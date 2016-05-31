FROM java:8
VOLUME /tmp
ADD maven/single-dog-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","app.jar"]