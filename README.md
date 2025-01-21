# ForumHub

ForumHub é uma API desenvolvida em **Spring Boot** para gerenciar um fórum de discussões. O projeto permite a criação, leitura, atualização e exclusão de tópicos, utilizando boas práticas de desenvolvimento e padrões RESTful.

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.4.1**
- **MySQL**
- **Hibernate (JPA)**
- **Maven**

## Funcionalidades

- Gerenciamento de tópicos.
- Persistência de dados com MySQL.
- Configuração flexível por variáveis de ambiente.

## Configurações Necessárias

Antes de rodar o projeto, configure as seguintes variáveis de ambiente para conexão com o banco de dados:

- `DB_HOST`: URL do servidor MySQL.
- `DB_FHNAME`: Nome de usuário do banco de dados.
- `DB_FHPASSWORD`: Senha do banco de dados.

## Como Rodar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/forumhub.git
   cd forumhub
   ```

2. **Configure o banco de dados:**
   - Crie um banco de dados MySQL chamado `forumhubApi`.

3. **Configure as variáveis de ambiente:**
   Defina as variáveis de ambiente conforme descrito acima.

4. **Compile o projeto:**
   ```bash
   mvn clean install
   ```

5. **Execute a aplicação:**
   ```bash
   mvn spring-boot:run
   ```

6. **Acesse a API:**
   A API estará disponível em `http://localhost:8080`.

## Estrutura do Projeto

- **`src/main/java`**: Contém o código-fonte da aplicação.
- **`src/main/resources`**: Contém os arquivos de configuração, como `application.properties`.


