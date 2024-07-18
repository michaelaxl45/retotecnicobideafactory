﻿<h1> Microservice Springboot Booking A House test to company Bidea Factory </h1> <br/>

<h2>Descrición</h2>
<p>OBJETIVO: Crear una API rest que permite reservar una casa, para lo cual se debe recibir un request,
validar dicho request, si se indica algún código de descuento validarlo a través de una api rest, y para
finalizar guardar los datos del request en una bbdd postgresql. </p>
<hr>
<br/>


## 🚀 Tecnologias Usadas<br/>
<br/>
- Spring Boot<br/>
- Spring Cloud Microserviços <br/>
- Clean Code<br/>
- PostgreSQL <br/>
-   Swagger <br/>
-   Docker - Docker-compose<br/>
- Feign Client<br/>
-   Rest  <br/>

<br/>
<hr>
<br/>
<p>Básicamente, solo necesitará tener Docker instalado en su máquina, en la carpeta "docker-compose" ejecute el comando "docker-compose -f docker-compose.yml -f docker-compose.override.yml up -d" Justo después de los contenedores se crean, espere un momento y abra el contenedor llamado "ms-pg-admin" y cree los servidores para dbbook y dbdiscount, solo siga el sorteo que muestra cómo crear los servidores en postgreSQL, poco después, una base de datos con el nombre "ms_discount "se creará automáticamente en el servidor dbdiscount, realice una consulta y ejecute el siguiente comando que se encuentra en el archivo discount.sql, luego podrá probar la aplicación mediante el host "http://localhost:8001/swagger-ui/index. html#/"</p>
<br/>

