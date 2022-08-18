# shipping-api
shipping-api

[![CI](https://github.com/spring-socks/shipping-api/actions/workflows/ci.yaml/badge.svg)](https://github.com/spring-socks/shipping-api/actions/workflows/ci.yaml)

## How to run locally

Run postgresql

```
docker-compose up
```

Run the app

```
# at the first time 
git init
git add -A
git commit -m "Initial commit"

./mvnw spring-boot:run
```

## Open API Doc

* [Swagger UI](https://petstore.swagger.io/?url=https://raw.githubusercontent.com/spring-socks/shipping-api/main/src/main/resources/static/openapi/doc.yml)
* [ReDoc](https://redocly.github.io/redoc/?url=https://raw.githubusercontent.com/spring-socks/shipping-api/main/src/main/resources/static/openapi/doc.yml)