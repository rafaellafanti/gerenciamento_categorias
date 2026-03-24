API de Gerenciamento de Categorias

API REST para gerenciamento de categorias de produtos.

Tecnologias

* Java 17
* Spring Boot
* Spring Data JPA
* H2 Database

Estrutura do projeto

* models → entidades JPA
* repositories → acesso ao banco de dados
* services → regras de negócio
* controllers → endpoints REST

Endpoints

* POST /categorias
* GET /categorias
* GET /categorias/{id}
* PUT /categorias/{id}
* DELETE /categorias/{id}

Como testar

Os endpoints podem ser testados utilizando:

Postman
ou
Swagger: http://localhost:8080/swagger-ui/index.html
