FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
#Expose the port embedded tomcat is listening on
EXPOSE 8765

#The following will work for devops pipeline to pick up artifacts from the gradle build stage using absolute path
ADD build/libs/SpringBootCloudantBluemixExample.war app.war

RUN sh -c 'touch /app.jar'
CMD java -Djava.security.egd=file:/dev/./urandom -jar app.war

