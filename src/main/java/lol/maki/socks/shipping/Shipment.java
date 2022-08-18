package lol.maki.socks.shipping;

import java.time.LocalDate;
import java.util.UUID;

public record Shipment(Carrier carrier, String orderId, LocalDate shipmentDate,
					   UUID trackingNumber) {
}
