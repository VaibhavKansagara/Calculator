FROM maven:3.6.3-jdk-11 as builder
WORKDIR /build
COPY pom.xml .

COPY src/ /build/src/
RUN mvn install

# Step : Package image
FROM openjdk:11-jre

COPY --from=builder /build/target/devops_calculator-1.0-SNAPSHOT.jar .

CMD java -cp devops_calculator-1.0-SNAPSHOT.jar:/build/target/classes/ calculator.Calculator
