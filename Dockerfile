FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY . .

RUN chmod +x gradlew && ./gradlew bootJar

CMD ["sh", "-c", "java -jar build/libs/*.jar"]