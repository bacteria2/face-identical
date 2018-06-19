FROM lwieske/java-8

LABEL version="1.0"
LABEL description=""

ENV JAR_NAME propaganda-platform-1.0-SNAPSHOT.jar

#install dependency
RUN groupadd -r mysql && useradd -r -g mysql mysql
RUN apt-get update && apt-get install -y perl pwgen --no-install-recommends && rm -rf /var/lib/apt/lists/*

#bulid
RUN maven clean
RUN maven package

#copy
COPY ./target/$JAR_NAME  /app
WORKDIR /app

#run jar
CMD ["java","-jar","/app/propaganda-platform-1.0-SNAPSHOT.jar"]
EXPOSE 8081