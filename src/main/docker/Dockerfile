FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD cloudant-spring-boot-example-0.0.1.jar app.jar
COPY spring-cloud.properties /usr/local/spring-cloud.properties
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]