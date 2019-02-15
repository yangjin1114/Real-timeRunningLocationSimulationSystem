# Real-time Running Location Simulation System

This project is mainly a backend system with light-weighted frontend presentations. 

Backend is are built with Microservices and integrated in a Cloud Native way.

Spring Cloud Running is the core part of the project, consisting of Edging Service, platform, Running Location Simulator, Runing Location Distribution Service, and Running Location Updater.

• Implemented server side REST APIs such as running location update service, location distribution service, and location persistence service using Spring Data, Spring Boot, and Spring Cloud.

• Persisted data to MongoDB and MySQL using Spring Data as Data Access Layer and incorporated RabbitMQ as message queue to decouple back-end services.

• Deployed applications to embedded Tomcat in automated fashion and used Spring Boot Actuator to monitor and manage application.

• Incorporated Netflix Eureka as service registration and discovery and Spring Boot Actuator to monitor application health.

• Developed the single page front-end to integrate with back-end using HTML, CSS, JavaScript, REST and WebSocket.

# Technology Stack:
Backend: Java, Spring Boot, Spring Data, Spring Cloud, Netflix OSS, SQL, JPA, Maven, Tomcat, WebSocket, RabbitMQ, REST
Frontend: HTML/CSS, Javascript, Bootstrap
Databases: MySQL, MongoDB, H2
Tools: Git, Docker, Vagrant, IntelliJ IDEA