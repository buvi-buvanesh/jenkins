FROM openjdk:17-jdk-slim
EXPOSE 4321
ADD target/jenkins-docker.jar jenkins-docker.jar
ENTRYPOINT ["java", "-jar", "/jenkins-docker.jar"]
