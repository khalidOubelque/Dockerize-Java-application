FROM java:8-jdk-alpine

COPY DockerJavaApp-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch DockerJavaApp-0.0.1-SNAPSHOT'

ENTRYPOINT ["java","-jar","DockerJavaApp-0.0.1-SNAPSHOT.jar"]