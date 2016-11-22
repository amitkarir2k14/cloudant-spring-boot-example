FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
# Thie following add will work if the dockerImage task runs
#Uncomment this if building from local gradle
#ADD cloudant-spring-boot-example-0.0.1.jar app.jar

#The following will work for devops pipeline to pick up artifacts from the gradle build stage using absolute path
#Comment this line and uncomment the above ADD instruction if not using pipeline
ADD /build/libs/cloudant-spring-boot-example-0.0.1.jar app.jar

# Thie following COPY will work if the dockerImage task runs
#Uncomment this if building from local gradle
#COPY spring-cloud.properties /usr/local/spring-cloud.properties

#The following will work for devops pipeline to pick up artifacts from the gradle build stage using absolute path
#Comment this line and uncomment the above COPY instruction if not using pipeline
COPY /src/main/resources/spring-cloud.properties /usr/local/spring-cloud.properties

RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
