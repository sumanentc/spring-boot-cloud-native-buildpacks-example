# Sample Cloud Native  - Spring Boot application
The purpose of this project is to demonstrate how we can use cloud native buildpacks to create docker image.

# How to build and run

project can be compiled with JDK 8 and above `javac`.

To compile just do `mvn clean install`.

**Prerequisites**

Docker needs to be installed

To Build a Cloud native image for the Spring Boot application execute the following command :
```
./mvnw spring-boot:build-image
```
When the build succeeds, we should be able to see the image using below Docker command :
```
docker images | grep cloud-native
```
To run the application using Docker image 
```
docker run -d -p 8080:8080 --name springbootcontainer sumand/cloud-native-buildpacks:latest
```

Check the application
```
curl http://localhost:8080/Suman
```

for more detailed technical information please check my medium post :
[Sample Cloud Native  - Spring Boot application](https://medium.com/@dassum/creating-a-docker-image-using-cloud-native-buildpacks-in-spring-boot-19ff81b5209d)

