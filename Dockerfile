FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Build the jar with Maven first, then copy it in
COPY target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
