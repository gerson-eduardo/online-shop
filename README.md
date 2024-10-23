# Online Store

Projeto de loja online.
O projeto vai contar com 2 microserviços. O primeiro que lida com dados de usuarios e ordens. O segundo lida com dados de carrinhos e tokens.

### MS-A 
Will deal with the heavy transactional data
- Java 21 with Spring Boot 3
- PostgreSQL

### MS-B
Will deal with carts and tokens
- Java 21 with Spring Boot 3
- MongoDB

## Keycloak
Will provide Auth and Auto

## RabbitMQ
Will provide a Queue for the applications

## Apache Airflow
Will read the database and translate the operational data into analytical data

