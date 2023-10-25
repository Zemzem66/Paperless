FROM openjdk:17
WORKDIR /app
# Install Maven (if not already installed)
RUN apk --no-cache add maven
# copy sourcecode
COPY . /app
# Build the application --> skit tests for now
RUN mvn package -DskipTests

EXPOSE 8088
ENTRYPOINT ["java","-jar","target/swagger-spring-1.0.0.jar"]