FROM anapsix/alpine-java

WORKDIR /AppServer
ADD target/desafio.jar desafio.jar

ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /AppServer/desafio.jar"]