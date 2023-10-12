# Use the official Ubuntu base image
FROM ubuntu:20.04

# Use a base image with Maven to build the application
FROM maven:3.8.4-openjdk-17-slim AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the source code and pom.xml
COPY pom.xml .
COPY src/ ./src/

# Build the application using Maven
RUN mvn clean package

# Update and install necessary packages
RUN apt-get update && apt-get install -y openjdk-17-jdk

# Set the working directory to /app
WORKDIR /app

# Copy your Spring Boot application JAR file into the container
COPY target/hello-world-0.0.1-SNAPSHOT.jar /app/

# Expose port 8080
EXPOSE 6700

# Run the Spring Boot application
CMD ["java", "-jar", "hello-world-0.0.1-SNAPSHOT.jar"]

