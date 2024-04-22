# Spring Security 6 + Spring Boot 3
With Spring Boot 3 the Spring security version also changes to Security 6. There are lot of breaking changes in this new version.
The list cane be found it https://docs.spring.io/spring-security/reference/whats-new.html.
## Some common changes
- *WebSecurityConfigurerAdapter* is no longer used in the Spring Configuration class. If added this throws a ClassNotFound exception
- *antMatchers* are no longer available. This has to be changed with newer methods

This a simple project that focuses on -
- Spring Security 6
- Uses a In memory H2 DB
- Thymeleaf, usage of fragments etc
