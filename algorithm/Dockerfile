FROM lwieske/java-8

LABEL version="1.0"
LABEL description=""

ENV JAR_NAME propaganda-platform-1.0-SNAPSHOT.jar


#bulid
RUN maven clean
RUN maven package
RUN yum insall

#copy

COPY ./target/$JAR_NAME /app
WORKDIR /app

#run jar
CMD ["java","-jar","/app/propaganda-platform-1.0-SNAPSHOT.jar"]
EXPOSE 8081