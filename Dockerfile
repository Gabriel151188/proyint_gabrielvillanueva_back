FROM amazoncorretto:11-alpine-jdk
MAINTAINER GVP
COPY target/gvp-0.0.1-SNAPSHOT.jar gvp-app.jar
ENTRYPOINT ["java","-jar","/gvp-app.jar"]
