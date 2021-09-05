FROM adoptopenjdk/openjdk11:alpine-slim

MAINTAINER martin tchokonthe

RUN apk update && apk add bash

RUN apk add --update curl

WORKDIR /target

COPY /target*.jar app.jar

EXPOSE 8080

CMD ["java","-jar","app.jar"]