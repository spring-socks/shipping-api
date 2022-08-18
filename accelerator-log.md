# Accelerator Log

## Options
```json
{
  "dbPort" : "25432",
  "groupId" : "lol.maki.socks",
  "javaVersion" : "17",
  "pkgName" : "lol.maki.socks",
  "projectName" : "shipping-api",
  "serverPort" : "5003"
}
```
## Log
```
┏ engine (Chain)
┃  Info Running Chain(GeneratorValidationTransform, UniquePath)
┃ ┏ ┏ engine.transformations[0].validated (Combo)
┃ ┃ ┃  Info Combo running as Chain(Merge(merge), UniquePath(UseLast))
┃ ┃ ┃ engine.transformations[0].validated.merge (Chain)
┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0] (Merge)
┃ ┃ ┃ ┃  Info Running Merge(Combo, Combo, Combo)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Exclude)
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[0].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Exclude)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[0].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**/*]
┃ ┃ ┃ ┃ ┃ ┃ Debug .github/workflows/ci.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug backstage/catalog-info.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug docker-compose.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug k8s/pipeline.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug k8s/postgresql.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug k8s/workload.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/demo/DemoApplication.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1__create_initial_tables.sql matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/openapi/doc.yml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/demo/DemoApplicationTests.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/resources/logback-test.xml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[0].<combo>.transformations[1] (Exclude)
┃ ┃ ┃ ┃ ┃ ┃  Info Will exclude [README.md, pom.xml, **/*.java, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml]
┃ ┃ ┃ ┃ ┃ ┃ Debug .github/workflows/ci.yaml matched [README.md, pom.xml, **/*.java, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [README.md, pom.xml, **/*.java, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [README.md, pom.xml, **/*.java, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [README.md, pom.xml, **/*.java, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md matched [README.md, pom.xml, **/*.java, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug backstage/catalog-info.yaml matched [README.md, pom.xml, **/*.java, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docker-compose.yaml matched [README.md, pom.xml, **/*.java, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug k8s/pipeline.yaml matched [README.md, pom.xml, **/*.java, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug k8s/postgresql.yaml matched [README.md, pom.xml, **/*.java, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug k8s/workload.yaml matched [README.md, pom.xml, **/*.java, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [README.md, pom.xml, **/*.java, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [README.md, pom.xml, **/*.java, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [README.md, pom.xml, **/*.java, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/demo/DemoApplication.java matched [README.md, pom.xml, **/*.java, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties matched [README.md, pom.xml, **/*.java, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1__create_initial_tables.sql didn't match [README.md, pom.xml, **/*.java, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/openapi/doc.yml matched [README.md, pom.xml, **/*.java, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/demo/DemoApplicationTests.java matched [README.md, pom.xml, **/*.java, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> excluded
┃ ┃ ┃ ┃ ┗ ┗ Debug src/test/resources/logback-test.xml didn't match [README.md, pom.xml, **/*.java, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> included
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Chain(chain))
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Chain)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [README.md, pom.xml, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml]
┃ ┃ ┃ ┃ ┃ ┃ Debug .github/workflows/ci.yaml matched [README.md, pom.xml, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [README.md, pom.xml, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [README.md, pom.xml, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [README.md, pom.xml, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md matched [README.md, pom.xml, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug backstage/catalog-info.yaml matched [README.md, pom.xml, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug docker-compose.yaml matched [README.md, pom.xml, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug k8s/pipeline.yaml matched [README.md, pom.xml, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug k8s/postgresql.yaml matched [README.md, pom.xml, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug k8s/workload.yaml matched [README.md, pom.xml, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [README.md, pom.xml, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [README.md, pom.xml, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [README.md, pom.xml, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/demo/DemoApplication.java didn't match [README.md, pom.xml, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties matched [README.md, pom.xml, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1__create_initial_tables.sql didn't match [README.md, pom.xml, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/openapi/doc.yml matched [README.md, pom.xml, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/demo/DemoApplicationTests.java didn't match [README.md, pom.xml, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/resources/logback-test.xml didn't match [README.md, pom.xml, src/main/resources/application.properties, src/main/resources/static/openapi/doc.yml, docker-compose.yaml, k8s/*, backstage/*, .github/workflows/ci.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo>.transformations[1] (Chain)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[1].<combo>.transformations[1].transformations[0] (ReplaceText)
┃ ┃ ┃ ┃ ┗ ┗ ┗  Info Will replace [demo-db->shipping-db, dbname->shipping, 15432->25432, spring-socks/template->spring-socks/shippin...(truncated), 17->17, com.example->lol.maki.socks, 8080->5003, demo->shipping-api]
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, Chain(chain))
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Chain)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**/*.java]
┃ ┃ ┃ ┃ ┃ ┃ Debug .github/workflows/ci.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug backstage/catalog-info.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug docker-compose.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug k8s/pipeline.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug k8s/postgresql.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug k8s/workload.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/demo/DemoApplication.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/db/migration/V1__create_initial_tables.sql didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/openapi/doc.yml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/demo/DemoApplicationTests.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/resources/logback-test.xml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[1] (Chain)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(OpenRewriteRecipe, ReplaceText, RewritePath)
┃ ┃ ┃ ┃ ┃ ┃ ╺ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[1].transformations[0] (OpenRewriteRecipe)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[1].transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [Demo->ShippingApi]
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.merge.transformations[0].sources[2].<combo>.transformations[1].transformations[2] (RewritePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/lol/maki/socks/DemoApplication.java' matched '^(?<folder>.*/)?(?<filename>([^/]+?|)(?=(?<ext>\.[^/.]*)?)$)' with groups {ext=.java, folder=src/main/java/lol/maki/socks/, filename=DemoApplication.java, g0=src/main/java/lol/maki/socks/DemoApplication.java, g1=src/main/java/lol/maki/socks/, g2=DemoApplication.java, g3=DemoApplication.java, g4=.java} and was rewritten to 'src/main/java/lol/maki/socks/ShippingApiApplication.java'
┃ ┃ ┃ ┗ ┗ ┗ ┗ Debug Path 'src/test/java/lol/maki/socks/DemoApplicationTests.java' matched '^(?<folder>.*/)?(?<filename>([^/]+?|)(?=(?<ext>\.[^/.]*)?)$)' with groups {ext=.java, folder=src/test/java/lol/maki/socks/, filename=DemoApplicationTests.java, g0=src/test/java/lol/maki/socks/DemoApplicationTests.java, g1=src/test/java/lol/maki/socks/, g2=DemoApplicationTests.java, g3=DemoApplicationTests.java, g4=.java} and was rewritten to 'src/test/java/lol/maki/socks/ShippingApiApplicationTests.java'
┃ ┗ ┗ ╺ engine.transformations[0].validated.merge.transformations[1] (UniquePath)
┗ ╺ engine.transformations[1] (UniquePath)
```
