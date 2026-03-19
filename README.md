# Nexora-Core | Financial Management API

Nexora-Core es una API REST empresarial desarrollada en Java con Spring Boot. El sistema gestiona carteras digitales (wallets) y transacciones financieras de manera segura y eficiente.

## Especificaciones Tecnicas

* Lenguaje: Java 21
* Framework: Spring Boot 3.2.2
* Persistencia: Spring Data JPA con base de datos H2 (en memoria).
* Arquitectura: Capas (Controller, Service, Repository, Model).

## Endpoints Principales

* POST /api/wallets/{name}: Crea una nueva cartera para un usuario especifico.
* PUT /api/wallets/{id}/deposit?amount={valor}: Realiza un deposito en la cuenta indicada.
* PUT /api/wallets/{id}/withdraw?amount={valor}: Realiza un retiro validando saldo suficiente.

## Instalacion y Ejecucion

### Requisitos
* JDK 21 instalado.
* Maven instalado.

### Comandos
1. Clonar el repositorio:
   git clone https://github.com/Robles42/nexora-core.git
2. Ejecutar la aplicacion:
   mvn spring-boot:run

## Autor
* Carlos Santiago (Robles42) - https://github.com/Robles42
