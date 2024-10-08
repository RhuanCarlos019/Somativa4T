# Sistema de Inscrição de Atletas

## Escopo
O Sistema de Inscrição de Atletas é uma aplicação desenvolvida para gerenciar o cadastro e a inscrição de atletas em competições. O sistema permite que os atletas se cadastrem, façam login e acompanhem o status de suas inscrições. Os administradores têm a capacidade de gerenciar essas inscrições, aprovando ou rejeitando-as conforme necessário. O objetivo é facilitar o processo de inscrição, promovendo uma interação eficiente entre atletas e administradores.

## Objetivos
- **Facilitar o Cadastro de Atletas**: Permitir que os atletas realizem seu cadastro de forma simples e intuitiva.
- **Gerenciar Inscrições**: Proporcionar uma interface para que os administradores possam visualizar, aprovar ou rejeitar inscrições.
- **Acompanhamento de Status**: Permitir que os atletas acompanhem o status de suas inscrições (Em análise, Liberado, Rejeitado).
- **Sistema Seguro**: Garantir que todas as operações sejam realizadas de maneira segura, utilizando autenticação de usuários.
- **Relatórios de Inscrições**: Permitir que administradores gerem relatórios sobre o número de inscrições, status e atletas.

## Tecnologias Utilizadas
- **Linguagem**: Java
- **Interface Gráfica**: Swing
- **Banco de Dados**: PostgreSQL
- **ORM (Object-Relational Mapping)**: JDBC
- **Gerenciamento de Dependências**: Maven
- **Ambiente de Desenvolvimento**: VSCode

## Manual de Uso da Aplicação

### 1. Instalação e Execução
Para instalar e executar a aplicação, siga os passos abaixo:
1. **Preparação do Ambiente**:
   - Instale o PostgreSQL e certifique-se de que está em execução.
   - Crie o banco de dados `GerAtletaBD` e execute o script SQL fornecido para criar as tabelas necessárias.

2. **Configuração do Projeto**:
   - Importe o projeto no seu IDE de preferência (como o VSCode).
   - Verifique a conexão com o banco de dados no arquivo `DatabaseConnection.java`.

3. **Execução**:
   - Execute a classe `Main` para iniciar a aplicação.

### 2. Funcionalidades Principais
- **Cadastro de Atletas**: O atleta pode preencher um formulário com seus dados pessoais e se inscrever na competição.
- **Login**: Atletas e administradores podem realizar login na aplicação para acessar suas respectivas funcionalidades.
- **Gerenciamento de Inscrições**: Os administradores podem visualizar todas as inscrições e atualizar seus status.
- **Visualização de Status**: Os atletas podem consultar o status de suas inscrições a qualquer momento.
- **Geração de Relatórios**: O administrador pode gerar relatórios sobre as inscrições e o desempenho dos atletas.

### 3. Navegação na Aplicação
- **Tela de Login**: O usuário deve inserir seu email e senha para acessar o sistema.
- **Painel do Atleta**: Após o login, o atleta é redirecionado para um painel onde pode visualizar suas inscrições.
- **Painel do Administrador**: O administrador, ao realizar o login, é direcionado para um painel onde pode gerenciar inscrições e gerar relatórios.

### 4. Estrutura de Dados
#### Diagrama de Classes
- **Atleta**
  - Atributos: `id`, `nome`, `email`, `peso`, `idade`, `clube`, `altura`, `liberacaoMedica`, `senha`, `status`.
  - Métodos: `cadastrarAtleta()`, `atualizarStatus()`, `visualizarDados()`.
  
- **Administrador**
  - Atributos: `id`, `nome`, `email`, `senha`.
  - Métodos: `login()`, `gerenciarInscricoes()`, `gerarRelatorio()`.
  
- **AtletaDAO**
  - Métodos: `cadastrarAtleta(Atleta)`, `buscarAtletaPorId(int)`, `listarAtletas()`, `atualizarStatusAtleta(int, String)`.

- **AdminDAO**
  - Métodos: `cadastrarAdmin(Administrador)`, `buscarAdministradorPorEmail(String)`.

- **AtletaService**
  - Métodos: `cadastrarAtleta(Atleta)`, `listarAtletas()`, `atualizarStatusAtleta(int, String)`.

- **AdminService**
  - Métodos: `cadastrarAdmin(Administrador)`, `login(String, String)`.

#### Diagrama de Sequência
1. **Cadastro de Atleta**:
   - O atleta preenche o formulário e envia.
   - O `AtletaController` chama o `AtletaService`.
   - O `AtletaService` chama o `AtletaDAO` para inserir os dados no banco de dados.
   - O sistema retorna a confirmação de cadastro.

2. **Login do Administrador**:
   - O administrador insere email e senha.
   - O `AdminController` chama o `AdminService`.
   - O `AdminService` valida as credenciais.
   - O sistema redireciona para o painel de administração.

### 5. Considerações
O Sistema de Inscrição de Atletas foi projetado para ser intuitivo e funcional, permitindo que tanto atletas quanto administradores gerenciem as inscrições de forma eficiente. O uso de Java e PostgreSQL proporciona uma base sólida para o desenvolvimento de aplicações de gestão, enquanto a interface gráfica com Swing garante uma boa experiência ao usuário.
