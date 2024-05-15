# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.5/maven-plugin/reference/html/#build-image)
* [Azure Actuator](https://aka.ms/spring/docs/actuator)
* [Azure PostgreSQL support](https://aka.ms/spring/msdocs/postgresql)
* [Spring Integration AMQP Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/amqp.html)
* [Spring Integration JDBC Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/jdbc.html)
* [Spring Integration JPA Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/jpa.html)
* [Spring Integration Test Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/testing.html)
* [Spring Integration Security Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/security.html)
* [Spring Integration HTTP Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/http.html)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#using.devtools)
* [Docker Compose Support](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#features.docker-compose)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#web)
* [Spring Session](https://docs.spring.io/spring-session/reference/)
* [Spring Security](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#web.security)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#appendix.configuration-metadata.annotation-processor)
* [OAuth2 Authorization Server](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#web.security.oauth2.authorization-server)
* [JDBC API](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#data.sql)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Flyway Migration](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#howto.data-initialization.migration-tool.flyway)
* [Spring Integration](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#messaging.spring-integration)
* [Spring for RabbitMQ](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#messaging.amqp)
* [Spring for RabbitMQ Streams](https://docs.spring.io/spring-amqp/reference/stream.html)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#actuator)
* [Sentry](https://docs.sentry.io/platforms/java/)
* [Prometheus](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#actuator.metrics.export.prometheus)
* [Spring REST Docs](https://docs.spring.io/spring-restdocs/docs/current/reference/htmlsingle/)
* [Config Client Quick Start](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_client_side_usage)
* [Spring Cloud Azure developer guide](https://aka.ms/spring/msdocs/developer-guide)
* [Azure Active Directory](https://microsoft.github.io/spring-cloud-azure/current/reference/html/index.html#spring-security-with-azure-active-directory)
* [Azure Key Vault](https://microsoft.github.io/spring-cloud-azure/current/reference/html/index.html#secret-management)
* [Spring Cache Abstraction](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#io.caching)
* [Quartz Scheduler](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#io.quartz)
* [Validation](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#io.validation)
* [Spring LDAP](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#data.nosql.ldap)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Accessing Relational Data using JDBC with Spring](https://spring.io/guides/gs/relational-data-access/)
* [Managing Transactions](https://spring.io/guides/gs/managing-transactions/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Integrating Data](https://spring.io/guides/gs/integration/)
* [Messaging with RabbitMQ](https://spring.io/guides/gs/messaging-rabbitmq/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Getting Started with Sentry](https://docs.sentry.io/platforms/java/guides/spring-boot/)
* [Deploying a Spring Boot app to Azure](https://spring.io/guides/gs/spring-boot-for-azure/)
* [Securing a Java Web App with the Spring Boot Starter for Azure Active Directory](https://aka.ms/spring/msdocs/aad)
* [Read Secrets from Azure Key Vault in a Spring Boot Application](https://aka.ms/spring/msdocs/keyvault)
* [Securing Spring Boot Applications with Azure Key Vault Certificates](https://aka.ms/spring/msdocs/keyvault/certificates)
* [Caching Data with Spring](https://spring.io/guides/gs/caching/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)

### Additional Links
These additional references should also help you:

* [Azure Samples](https://aka.ms/spring/samples)
* [Azure Active Directory Sample](https://aka.ms/spring/samples/latest/aad)
* [Azure Key Vault Sample](https://aka.ms/spring/samples/latest/keyvault)

### Docker Compose support
This project contains a Docker Compose file named `compose.yaml`.
In this file, the following services have been defined:

* postgres: [`postgres:latest`](https://hub.docker.com/_/postgres)
* rabbitmq: [`rabbitmq:latest`](https://hub.docker.com/_/rabbitmq)

Please review the tags of the used images and set them to the same as you're running in production.

