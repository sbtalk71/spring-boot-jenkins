FROM openjdk:17
ADD target/spring-boot-jenkins-1.0.jar app.jar
EXPOSE 8080
CMD java -jar app.jar