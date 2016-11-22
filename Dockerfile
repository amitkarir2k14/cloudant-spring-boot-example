FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp

#The following will work for devops pipeline to pick up artifacts from the gradle build stage using absolute path
ADD build/libs/cloudant-spring-boot-example-0.0.1.jar app.jar

#The following will work for devops pipeline to pick up artifacts from the gradle build stage using absolute path
COPY src/main/resources/spring-cloud.properties /usr/local/spring-cloud.properties

RUN sh -c 'touch /app.jar'
CMD java -Djava.security.egd=file:/dev/./urandom -jar app.jar

