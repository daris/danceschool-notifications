# Notifications Microservice

The **Notifications Microservice** is a Spring Boot application built with **Java** that handles real-time notifications for the DanceSchool platform. It uses **Kafka** for event-driven communication and supports sending user-related notifications when events occur in other microservices.

---

## Features

- Listens to user-related events from Kafka (e.g., `user-created`).
- Processes events and logs notifications.

---

## Tech Stack

- **Java 21**
- **Spring Boot 4**
- **Spring Kafka**
- **Spring Web**
- **Lombok**
- **Jackson (JSON serialization/deserialization)**
- **JUnit 5 / Mockito** for testing
- **Docker / Docker Compose** for containerization

---

## Running the Service

### Using Gradle:

```bash
./gradlew bootRun
```

## Testing

```bash
./gradlew test
```


