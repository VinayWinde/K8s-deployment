
FROM openjdk:17
EXPOSE 9762
ADD target/Calculator-0.0.1-SNAPSHOT.jar Calculator-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/Calculator-0.0.1-SNAPSHOT.jar"]
