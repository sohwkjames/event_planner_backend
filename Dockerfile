# Before building this image, build the jar file by running ./mvnw clean package
FROM openjdk:17-alpine

# Set the working directory in the Docker image
WORKDIR /app

# Copy the built jar file from local into image
COPY target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar

# equivalent to running "java -jar demo-0.0.1-SNAPSHOT.jar"
ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]

