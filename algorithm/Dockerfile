FROM lwieske/java-8

LABEL version="1.0"
LABEL description=""

ENV JAR_NAME algorithm-1.0-SNAPSHOT.jar
ENV spring.profiles.active docker
RUN mkdir /app
#ADD ./target/$JAR_NAME  /app
#copy
COPY ./target/$JAR_NAME /app
WORKDIR /app
EXPOSE 8080
#run jar
CMD  java -jar /app/$JAR_NAME
