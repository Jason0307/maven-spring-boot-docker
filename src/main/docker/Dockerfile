FROM java:8
ARG boot_jar
VOLUME /tmp
ADD ${boot_jar} app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","app.jar"]