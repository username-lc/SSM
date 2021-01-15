FROM openjdk:8-jdk-alpine
ADD *.war app.war
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-war","/app.war"]