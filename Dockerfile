# Use OpenJDK 17 as the base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the project files into the container
COPY . .

# Run the Maven build process
RUN ./mvnw clean package -Dmaven.test.skip=true

# Expose port 9999
EXPOSE 8090

# Define the command to run the Java application
CMD ["java", "-jar", "target/student.jar"]
