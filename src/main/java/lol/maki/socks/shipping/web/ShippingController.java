package lol.maki.socks.shipping.web;

import java.time.Clock;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import am.ik.yavi.builder.ValidatorBuilder;
import am.ik.yavi.core.ConstraintViolations;
import am.ik.yavi.core.Validator;
import lol.maki.socks.shipping.Carrier;
import lol.maki.socks.shipping.Shipment;
import lol.maki.socks.shipping.ShipmentMapper;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.IdGenerator;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@CrossOrigin
public class ShippingController {
	private final ShipmentMapper shipmentMapper;

	private final Clock clock;

	private final IdGenerator idGenerator;

	public ShippingController(ShipmentMapper shipmentMapper, Clock clock, IdGenerator idGenerator) {
		this.shipmentMapper = shipmentMapper;
		this.clock = clock;
		this.idGenerator = idGenerator;
	}

	@GetMapping(path = "/shipping/{orderId}")
	public ResponseEntity<ShipmentResponse> getShippingById(@PathVariable("orderId") String orderId) {
		return ResponseEntity.of(this.shipmentMapper.findByOrderId(orderId).map(this::toResponse));
	}

	@GetMapping(path = "/shipping")
	public ResponseEntity<List<ShipmentResponse>> getShippings() {
		return ResponseEntity.ok(this.shipmentMapper.findAll().stream().map(this::toResponse).toList());
	}

	@PostMapping(path = "/shipping")
	public ResponseEntity<?> postShipping(@RequestBody ShipmentRequest req, UriComponentsBuilder builder) {
		final ConstraintViolations violations = ShipmentRequest.validator.validate(req);
		if (!violations.isValid()) {
			final List<Map<String, Object>> details = violations.details().stream().map(d -> Map.of("field", d.getArgs()[0], "message", d.getDefaultMessage())).toList();
			return ResponseEntity.badRequest().body(Map.of(
					"error", HttpStatus.BAD_REQUEST.getReasonPhrase(),
					"details", details));
		}
		final Shipment shipment = new Shipment(
				Carrier.chooseByItemCount(req.itemCount()),
				req.orderId(),
				LocalDate.now(this.clock),
				this.idGenerator.generateId());
		this.shipmentMapper.insert(shipment);
		return ResponseEntity.created(builder.replacePath("shipping/{orderId}").build(shipment.orderId()))
				.body(toResponse(shipment));
	}


	record ShipmentRequest(int itemCount, String orderId) {
		static Validator<ShipmentRequest> validator = ValidatorBuilder.<ShipmentRequest>of()
				.constraint(ShipmentRequest::itemCount, "itemCount", c -> c.notNull().greaterThanOrEqual(1))
				.constraint(ShipmentRequest::orderId, "orderId", c -> c.notBlank())
				.build();
	}

	record ShipmentResponse(String orderId, String carrier, LocalDate deliveryDate,
							UUID trackingNumber) {}

	private ShipmentResponse toResponse(Shipment shipment) {
		return new ShipmentResponse(shipment.orderId(), shipment.carrier().name(), shipment.carrier().deliveryDate(shipment.shipmentDate()), shipment.trackingNumber());
	}
}