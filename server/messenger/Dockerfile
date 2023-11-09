# our base build image
FROM maven:3.6.0-jdk-8 as maven

# copy the project files
COPY ./pom.xml ./pom.xml

# build all dependencies
RUN mvn dependency:go-offline -B

# copy your other files
COPY ./src ./src

# build for release
RUN mvn package

# our final base image
FROM openjdk:17-alpine

# set deployment directory
WORKDIR /messenger-server

# copy over the built artifact from the maven image
COPY --from=maven target/messenger-1.0.jar ./

# set the startup command to run your binary
CMD ["java", "-jar", "./messenger-1.0.jar"]