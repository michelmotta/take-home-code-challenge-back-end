# Take home code challenge (back-end) - KRATOS

Este projeto foi implementado como segunda etapa do processo de seleção para desenvolvedor back-end Java para a empresa Kratos. 

## Objetivos do Projeto

Os objetivos deste projeto é implementar uma API REST Java que seja capaz de receber uma requisição HTTP do tipo POST com um objeto Json no corpo da requisição, que representa uma lista de itens com seus respectivos atributos e realizar o cálculo de tributação conforme as regras de tributação do grupo de ICMS 20 (Grupo que calcula os tributos com redução na base de cálculo).

## Detalhes do Projeto

O projeto foi desenvolvido utilizando Ferramentas/Tecnologias:

* Java 8
* Spring MVC 4.3.18 Obs.: Eu escolhi esta versão, pois segundo o [Maven Repository](https://mvnrepository.com/artifact/org.springframework/spring-webmvc) é uma versão mais utilizada do que a versão mais atual Spring MVC 5.0.8, consequentemente existem muito mais materiais de pesquisa/estudo na internet para esta versão. 
* Eclipse Java EE para Web Developers
* Servidor Apache Tomcat 9.0
* Gerenciador de dependências Maven 

### Bibliotecas/Dependências Auxiliares
* [Jackson Core 2.9.5](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core) e [Jackson Databind 2.9.5](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind)
* [Apache Commons Math 3.6.1](https://mvnrepository.com/artifact/org.apache.commons/commons-math3)
* [Validation API 2.0.1.Final](https://mvnrepository.com/artifact/javax.validation/validation-api)


## Como Utilizar Esse Projeto?

### Utilizando o Eclipse Java EE para Web Developers
Este projeto foi desenvolvido utilizando o Eclipse Java EE para Web Developers, desta forma o conjunto de pastas se caracteriza como um projeto do Eclipse Java EE para Web Developers. Você precisa apenas baixar o projeto, colocar dentro de seu diretório de trabalho e realizar a importação do projeto através da interface do Eclipse.

### Utilizando o Arquivo de implantação WAR(Web application ARchive)
Dentro do diretório [implantacao](https://github.com/michelmotta/take-home-code-challenge-back-end/tree/master/implantacao) existe um arquivo de implantação para aplicações web baseadas em Java. Você precisa apenas baixar esse arquivo e colocar dentro da pasta de aplicativos web do seu servidor Java preferido.