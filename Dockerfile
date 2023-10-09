FROM maven:3.8.4-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim
COPY --from=build /target/bookclub-0.0.1-SNAPSHOT.jar bookclub.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","bookclub.jar"]
