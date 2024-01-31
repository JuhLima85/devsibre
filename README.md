## Projeto Devsibre

## Sobre o projeto

- Plataforma para gerenciamento de movimentação de Formularios, Agenda, Inventarios e Cobranças.

## Ferramentas:

- JDK 8
- IDE Eclipse (STS4)
- Maven
- Docker/Docker-Compose

## Frameworks e Tecnologias:
- Spring Boot / Data
- Frameworks Spring/jpa
- Hibernate
- Padrão MVC
- Interface web com Bootstrap
- Testes de Integração com JUnit 5
- Thymeleaf como template engine

## Banco de Dados:
- Mysql
- Nome do Banco: devsibredb

## EXECUTE
- mvn clean install
Na rais do diretorio execute o comando a abaixo gerar imagem e o banco via container
- docker-compose up --build --force-recreate

## Acesso ao Frontend do Projeto
- http://localhost:8080/
- http://localhost:8080/agendas_User
- http://localhost:8080/Entrar
<br><br>

## TELA INICIAL
![Tela Inicial](https://github.com/JuhLima85/devsibre/assets/89745459/a0a6ebec-7ef5-45e3-bfc6-e375c68b6a91)

## TELA DE LOGIN
![Tela de Login](https://github.com/JuhLima85/devsibre/assets/89745459/e4c892de-bbb1-4675-9bf2-76afaa194b36)

## TELA DE MINISTÉRIOS
![Tela Minstérios](https://github.com/JuhLima85/devsibre/assets/89745459/0894cc73-a5f1-435d-bc29-e6b2effa63a8)

## TELA CADASTRO
![Tela Cadastro](https://github.com/JuhLima85/devsibre/assets/89745459/bc1db9eb-5495-4514-8618-00b43712948c)

## TELA DE COBRANÇA
![Tela de Cobrança](https://github.com/Ernilson/devsibre/assets/30840118/97b8d018-9853-4e68-bfaf-89e5a694afbc)

## TELA PATRIMONIO
![Tela de Patrimonio](https://github.com/Ernilson/devsibre/assets/30840118/126dbff2-243d-4f2a-90e6-67701c0ebd3a)

## TELA RELATORIO DE CADASTRO
![Tela de Relatorio](https://github.com/Ernilson/devsibre/assets/30840118/def69275-eaf5-4682-b4fe-99379fa65891)

## TELA RELATÓRIO DE DÉBITOS
![Relatorio de Membros](https://github.com/Ernilson/devsibre/assets/30840118/23e86abb-c18d-4187-a7b2-62a02f0ae6e6)

## TELA DE MODELAGEM
![Tela de Modelagem](https://github.com/JuhLima85/devsibre/assets/89745459/9e0e1ba6-3bb4-4d2b-a6e1-75d01812e1bc)

## Comandos Docker:
docker-compose up --build --force-recreate

## Comando para imagem Docker chamada "devsibre" 
docker build --build-arg PROFILE=dev --build-arg ADDITIONAL_OPTS="-agentlib:jdwp=transport=dt_socket,
server=y,suspend=n,address=*:8000" -t devsibre .
