# E-commerce Application Architecture

The e-commerce application follows a **microservices architecture** pattern, comprising several specialized services that work together to provide complete e-commerce functionality.

## Core Services

| Service              | Description                      | Primary Responsibility                     |
|----------------------|----------------------------------|-------------------------------------------|
| **Order Service**       | Central service for order management | Orchestrates the entire order process       |
| **Product Service**     | Manages product data and inventory    | Handles product information and availability |
| **Customer Service**    | Manages customer information           | Stores and validates customer data           |
| **Payment Service**     | Processes payments                   | Handles payment processing for orders        |
| **Notification Service**| Sends notifications to customers       | Sends order and payment confirmations        |

## Core Technologies

The e-commerce application is built using the following core technologies:

| Component                    | Technology           |
|------------------------------|----------------------|
| **Programming Language**      | Java 19            |
| **Build System**              | Maven              |
| **Framework**                | Spring Boot 3.4.x |
| **Microservices Infrastructure** | Spring Cloud       |
| **Database Systems**         | PostgreSQL, MongoDB |
| **Messaging**                | Apache Kafka       |
| **API Gateway**              | Spring Cloud Gateway |
| **Service Discovery**        | Netflix Eureka      |
| **Configuration Management** | Spring Cloud Config |


## Setting Up the Environment

### Starting Infrastructure Services

To start all required infrastructure services, run:

```bash
docker-compose up -d
