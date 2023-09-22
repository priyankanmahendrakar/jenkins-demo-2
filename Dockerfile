From openjdk:21-ea-17-jdk
VOLUME /tmp
COPY /target/user-service-0.0.1-SNAPSHOT.jar app2.jar
ENTRYPOINT ["java","-jar","app2.jar"]
