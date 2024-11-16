# 📦 Microserviço três módulos de relatórios de Compras

Gera **relatórios de compras** diversos com base nos dados consumidos de uma API externa.

🔧 Tecnologias aplicadas: **Java** | **Spring Boot** | **Spring Webflux** | **Spring Cloud** | **Eureka Server** | **Spring Cloud Gateway** | **Swagger**.

## 🔁 Endpoints

- /compras - Retorna uma lista de compras ordenadas de forma crescente por valor:

<p align="center">
    <img align="center" alt="GET - Compras ordem crescente" src="https://github.com/flauzo/microservico-app-compras-reports/image-repo-github/blob/main/GET%20-%20compras ordem crescente.JPG">
</p>

- /maior-compra/ano - Retorna a maior compra do ano informado com dados da compra:

<p align="center">
    <img align="center" alt="GET - Maior-compra-ano" src="https://github.com/flauzo/microservico-app-compras-reports/image-repo-github/blob/main/GET%20-%20maior-compra-ano.JPG">
</p>

- /clientes-fieis - Retorna o Top 3 clientes mais fiéis, clientes que possuem mais compras recorrentes com maiores valores.

<p align="center">
    <img align="center" alt="GET - Clientes-fieis" src="https://github.com/flauzo/microservico-app-compras-reports/image-repo-github/blob/main/GET%20-%20clientes-fieis.JPG">
</p>

- /recomendacao/cliente/tipo - Retorna uma recomendação de produtos de vinho baseado nos tipos de vinhos que o cliente mais compra.

<p align="center">
    <img align="center" alt="GET - Recomendacao-cliente-vinho" src="https://github.com/flauzo/microservico-app-compras-reports/image-repo-github/blob/main/GET%20-%20recomendacao-cliente-vinho.JPG">
</p>

## ✅ Utilização - passo a passo

1. Clonar o repositório ou baixar os três módulos para uma pasta única.
2. Importar essa pasta única numa IDE como p.ex. VC Code, Eclipse ou IntelliJ.
3. Executar primeiro o módulo ms-eureka-server
4. Executar o módulo ms-api-gateway
5. Executar o módulo ms-relatorio-compras
6ara acessar os endpoints, enviar request com postman ou no browser para o seguinte endereço base: http://localhost:8080/ms-relatorio-compras/

Exemplo passo 6: http://localhost:8080/ms-relatorio-compras/compras
    
## 📅 Eureka Server

Acessar via endereço http://localhost:8761

<p align="center">
    <img align="center" alt="eurek instances" src="https://github.com/flauzo/microservico-app-compras-reports/image-repo-github/blob/main/eureka%20instances.JPG">
</p>

## Swagger

Acessar via endereço http://localhost:8080/ms-relatorio-compras/swagger-ui.html
