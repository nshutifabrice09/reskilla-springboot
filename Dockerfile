FROM openjdk:17
EXPOSE 8080
ADD target/reskilla-springboot-image.jar reskilla-springboot-image.jar
ENTRYPOINT ["java","-jar","reskilla-springboot-image.jar"]