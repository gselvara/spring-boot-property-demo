# spring-boot-property-demo
The aim of this project is to demonstrate how external propertile work in the spring-boot 2.0.3.RELEASE works.

Software:
Java        : 1.8.0_25
Spring Boot : 2.0.3.RELEASE
Spring      : 5.0.7.RELEASE
Maven       : 3

Steps to build and Run:
(1) mvn clean package
(2) run rundemo.bat (windows) or rundemo.sh (unix)

Goal:
 * Show how you can overide the "application.properties" and "test.properties" files with external property files.
java -jar target/spring-boot-property-demo-0.0.1-SNAPSHOT.war --spring.config.additional-location=classpath:file:src/test/resources/,classpath:file:src/test/resources/test.properties
