
mvn clean package
podman build -f src/main/docker/Dockerfile .
podman run -p8080:8080 {THE_ID}
curl -vvv -XPOST localhost:8080/people/ABCEDF