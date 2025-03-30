FROM openjdk:21-jdk

EXPOSE 8080

ADD target/restapi-1.0.jar restapi-1.0.jar

ENTRYPOINT [ "java","-jar","/restapi-1.0.jar"]


