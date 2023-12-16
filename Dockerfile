FROM eclipse-temurin:18-jdk-alpine
WORKDIR /app
COPY target/Authentification-0.0.1-SNAPSHOT.jar Authentification-0.0.1-SNAPSHOT.jar
EXPOSE 8088
CMD ["java","-jar","Authentification-0.0.1-SNAPSHOT.jar"]