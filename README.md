# APIs Cat&Foto 
Esse projeto disponibiliza API's de leitura de bases carregadas sobre Raças de Gatos e suas foto.

# Getting Started

### Reference Documentation
Para executar o projeto, será necessário:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.0/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.4.0/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.4.0/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Jersey](https://docs.spring.io/spring-boot/docs/2.4.0/reference/htmlsingle/#boot-features-jersey)


### Desenvolvimento
Para iniciar o desenvolvimento, é necessário clonar o projeto do GitHub num diretório de sua preferência:

```shell
cd "diretorio de sua preferencia"
git clone https://github.com/danilodejesusgomes/itaucat
```

### Construção (Build)
Você também pode criar um ambiente de desenvolvimento utilizando simplesmente o comando abaixo. Aplicação subira em sua maquina local na porta 8080:
Obs: Sempre verifique se sua porta 8080 esta disponivel para aplicacao. ah você tambem poderá alterar a porta onde esta aplicação deve rodar alterando o parametro do arquivo "application.properties" localizado no diretorio "src/main/resources"

```shell
mvn clean install
```
Acionar API de estimulo de carga inicial abaixo:

```shell
http://<local>:<Port>/carga

exemplo:
http://localhost:8080/carga
```

### Deploy (Docker)
Você também pode criar um ambiente em container utilizando o docker. Os arquivos de Dockerfile e docker-compose estão disponiveis na raiz do projeto e para subir a aplicação basta executar o comando abaixo:

```shell
cd "diretorio raiz do projeto"
docker-compose up --build
```
Acionar API de estimulo de carga inicial abaixo:

```shell
http://<local>:<Port>/carga

exemplo:
http://localhost:8080/carga
```

### Cloud (AWS)
Você também pode criar um ambiente em nuvem AWS via container Docker. Para subir a aplicação para AWS eu sugiro utilizar o serviço AWS Elastic Beanstalk usando o docker como ferramenta onde você poderá fazer um deploy facilmente com o arquivo Dockerrun.aws.json localizado no diretorio raiz deste projeto. Neste arquivo já contem o endereço de imagem no Docker-Hub para subir esta aplicação.

```shell
arquivo de Imagem da aplicação no Docker-Hub
danilojgomes/backend-itaucat:v4.0
```

Acionar API de estimulo de carga inicial abaixo:

```shell
http://<dominio>/carga

exemplo:
http://backenditauthecat-env.eba-abdxxcqb.us-east-1.elasticbeanstalk.com/carga
```

### Como monitorar a saúde das APIs
Você pode monitorar como os serviçoes de API's estão se comportando em seu ambiente escolhido. Como referencia deixo algumas evidencias de monitoramentos e queries realizadas por mim no Splunk para monitorar os consumos das aplicações.

### Documentação das APIS
Foi gerado os manuais de utilização das APIs para ajudar desenvolvedores que desejam consumir os dados desta aplicação. Foi gerado as documentaçoes na ferramenta de Swagger e deixo os arquivos disponiveis no diretorio raiz do projeto para orientações de utilização das API's.

### Documentação para desenvolvedores
Foi gerada a documentação pardrão do javadoc sobre todas as classes desta aplicação. Esta documentação completa você encontra facilmente no diretorio raiz do projeto denominada como pasta "doc". Sugiro que veja o arquivo index.html que lhe fornecerá informações mais facilmente.

### Desenho da arquitetura da aplicação
Foi gerada a documentação basico de entendimento da arquitetura da aplicacação que você encontra facilmente no diretorio raiz do projeto denominada com pasta "Arquitetura". Sugiro que veja ele para ter uma visão macro da aplicação.

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)


