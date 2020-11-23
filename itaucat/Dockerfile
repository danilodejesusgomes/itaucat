FROM openjdk:11

WORKDIR /opt/itaucat

COPY /target/itaucat.jar itaucat.jar

SHELL ["/bin/sh", "-c"]

EXPOSE 8080

CMD java -Xmx512m -jar itaucat.jar --spring.profiles.active=prod