FROM eclipse-temurin:11-jre


RUN mkdir "/app"
RUN wget -O /app/dd-java-agent.jar 'https://github.com/DataDog/dd-trace-java/releases/download/v1.24.2/dd-java-agent-1.24.2.jar'

COPY target/ddexample-*.jar /app/ddexample.jar
COPY config.yml /app/
EXPOSE 8080

CMD java -javaagent:/app/dd-java-agent.jar -jar /app/ddexample.jar server /app/config.yml