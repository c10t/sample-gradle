FROM gradle:jdk8-alpine AS build

COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src

RUN gradle build --info

FROM openjdk:8-jre-alpine
EXPOSE 8080
COPY --from=build "/home/gradle/src/build/libs/sample-app-0.0.1-SNAPSHOT.jar" /
ENTRYPOINT ["java", "-jar", "/sample-app-0.0.1-SNAPSHOT.jar"]
