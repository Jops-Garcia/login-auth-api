# Página de login - Backend

## Descrição do Projeto
Este é o backend para a página de login utilizando Java e Spring Boot.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot**
- **Spring Security**
- **JWT (JSON Web Tokens)**
- **Maven**
- **H2 Database**

## Estratégias e Estrutura do Projeto

```
login-auth-api/
├── src/
│   ├── main/
│   │   ├── java/com/example/login_auth_api/
│   │   │   ├── controllers/          # Controladores REST
│   │   │   ├── domain/user/          # Domínio e modelos de usuário
│   │   │   ├── dto/                  # Objetos de Transferência de Dados (DTOs)
│   │   │   ├── infra/
│   │   │   │   ├── cors/             # Configurações de CORS
│   │   │   │   ├── security/         # Configurações e serviços de segurança
│   │   │   ├── repositories/         # Repositórios para acesso a dados
│   │   │   ├── LoginAuthApiApplication.java  # Classe principal da aplicação
│   ├── resources/
│   │   ├── application.properties    # Configurações da aplicação
│   ├── test/                         # Testes unitários
```

### Destaques do Backend
- **Autenticação baseada em JWT**:
  - Geração de tokens para autenticação do usuário.
  - Middleware para validação de tokens em requisições.
- **Spring Security**:
  - Configurações de controle de acesso e proteção de rotas.
- **H2 Database**:
  - Banco de dados em memória para desenvolvimento.

## Configuração e Execução

### Requisitos
- Java 17 ou superior
- Maven instalado

### Passos para Executar o Projeto
1. **Clonar o Repositório**:
   ```bash
   git clone <url-do-repositorio>
   cd login-auth-api
   ```
2. **Instalar Dependências**:
   ```bash
   mvn install
   ```
3. **Iniciar o Servidor**:
   ```bash
   mvn spring-boot:run
   ```
4. **Acessar a API**:
   O backend estará disponível em [http://localhost:8080](http://localhost:8080).

## Frontend
[https://github.com/Jops-Garcia/login-page](https://github.com/Jops-Garcia/login-page)


## Prints

![image](https://github.com/user-attachments/assets/708ac81e-a93c-4370-918f-a2f2799d61d3)
![image](https://github.com/user-attachments/assets/44af0890-246c-41b7-8106-eadff1b47763)


Obrigado por conferir este projeto!
