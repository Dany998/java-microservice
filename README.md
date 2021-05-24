# Java-microservice
Microservice Architecture in Java with Spring Boot

This project has included four separated modules which represent services like: two instances based on Java, API Gateway and a web server both provided by Netflix.

The action to follow is turning on the services become them in Docker containers with the docker-compose.yml file, running the line specified below:
> docker-compose up

The docker-compose sentence will recreate the images regarding to the services from Docker Hub Registry.

The services could take a few minutes in getting display through the browser. You can test the project with the following examples:
- http://localhost:8761 -> Eureka Server Dashboard showing up the services attached to it
- http://localhost:7000/api/instance-1/microservice1 -> A microservice displaying a brief message with its port used
- http://localhost:7000/api/instance-2/microservice2 -> Same difference to the above

**Note:** The essential function over this project is the API Gateway, which works as a service filter and through its bridge is possible accesing towards the modules. If you want to get inside the service instances with their port directly, sorry but you won´t. 
