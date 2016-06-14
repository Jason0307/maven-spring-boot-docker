FROM java:8
VOLUME /tmp
ADD maven/jason-docker-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["/usr/lib/jvm/java-8-openjdk-amd64/bin/java","-jar","app.jar"]