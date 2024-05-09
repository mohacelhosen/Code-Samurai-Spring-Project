# Use OpenJDK 17 as the base image
FROM openjdk:17
EXPOSE 8090

# Set the working directory inside the container
WORKDIR /app

# Copy all files from the current directory except the target folder
COPY . /app/
RUN rm -rf /app/target

# Build the package inside the container
RUN ./mvnw clean package -Dmaven.test.skip=true

# Define the entry point to run the Java application
ENTRYPOINT ["java", "-jar", "target/*.jar"]
