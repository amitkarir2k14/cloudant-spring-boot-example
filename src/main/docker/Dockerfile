FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD SpringBootCloudantBluemixExample.war app.war
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.war"]