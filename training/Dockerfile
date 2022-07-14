FROM openjdk:8-alpine

COPY target/uberjar/training.jar /training/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/training/app.jar"]
