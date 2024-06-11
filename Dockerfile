FROM maven AS build
COPY . .
RUN mvn clean install

FROM openjdk:21
COPY --from=build target/*.jar Calculator.jar
ENTRYPOINT ["java","-jar","Calculator.jar"]