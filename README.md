# Inventory Report API

Spring Boot REST API to fetch inventory details between two dates using H2 in-memory database.

## Tech Stack
- Java 21
- Spring Boot
- Spring Data JPA
- H2 Database

## Project Structure
```text
Inventory_Curd_Operation
├── src
│   └── main
│       ├── java/com/calsoft/api
│       │   ├── controller/      
│       │   │   └── InventoryController.java
│       │   ├── entity/          
│       │   │   ├── Inventory.java
│       │   │   └── InventoryDetails.java
│       │   ├── repository/      
│       │   │   ├── InventoryRepository.java
│       │   │   └── InventoryDetailsRepository.java
│       │   ├── service/         
│       │   │   └── InventoryService.java
│       │   └── InventoryCurdOperationApplication.java 
│       └── resources
│           ├── application.properties 
│           └── data.sql         
└── pom.xml
```


## Endpoint
GET /api/inventory/details?startDate=YYYY-MM-DD&endDate=YYYY-MM-DD

## Example
http://localhost:8080/api/inventory/details?startDate=2023-01-01&endDate=2023-12-31

## Run
mvn spring-boot:run

## Output

<img width="1037" height="473" alt="image" src="https://github.com/user-attachments/assets/ea4e3b76-15b5-45f3-b49e-ab5e8e133b6f" />
