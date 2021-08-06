FROM openjdk:8-jdk-alpine
ARG JAR_FILE=/home/runner/work/gitactions/gitactions/target/gitactions-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]