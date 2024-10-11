
# GitHub API User Data

Este projeto tem como objetivo realizar consultas na API pública do GitHub para buscar dados de perfis de usuários. O programa se conecta à API e recupera informações como nome, bio e quantidade de repositórios públicos, exibindo-as no terminal.

Além de servir como um exemplo de integração com APIs REST, o projeto demonstra práticas de programação orientada a objetos para a formação Java e POO da Alura.

## Instalação

```bash
# Clone o repositório
git clone https://github.com/chrisbmineiro/api-github-java.git

# Acesse o diretório do projeto
cd api-github-java

# Importe o projeto em sua IDE preferida (Eclipse, IntelliJ, etc.)
```

## Configuração

Certifique-se de que o projeto tenha as seguintes dependências configuradas:

- **JDK 17+**
- **Biblioteca Gson** (para fazer parsing de JSON)
  - Você pode adicionar a dependência do Gson no seu `pom.xml` (se estiver usando Maven):

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.11.0</version>
</dependency>
```

Ou pode fazer o download manualmente da biblioteca versão 2.11.0 e incluí-la no classpath de dependencias do projeto.

## Uso

```bash
# Execute o projeto pela linha de comando ou diretamente pela sua IDE.
# Digite o nome de usuário do GitHub que deseja consultar.
# Exemplo de execução no terminal:

Digite o nome de usuário do GitHub: octocat
Nome: The Octocat
Bio: Mascote oficial do GitHub
Repositórios públicos: 8
```

## Exceções e Erros

O projeto inclui tratamento de exceções específicas para erros relacionados à consulta na API do GitHub:

- `ErroConsultaGitHubException`: Lançada quando o nome de usuário não é encontrado ou quando há um problema ao tentar acessar a API.

Além disso, outras exceções genéricas relacionadas a problemas de conexão ou formatação podem ser lançadas.

## Estrutura de Arquivos

```bash
├── main
│   ├── Main.java                 # Arquivo principal que roda o programa
├── models
│   ├── GitHubUser.java           # Classe modelo para armazenar informações do usuário GitHub
├── services
│   ├── ConsultaGitHub.java       # Classe responsável por fazer a consulta na API do GitHub
├── exceptions
│   ├── ErroConsultaGitHubException.java # Exceção personalizada para erros de consulta
└── README.md                     # Documentação do projeto
```

- **`Main.java`**: Classe principal que interage com o usuário via terminal.
- **`GitHubUser.java`**: Modelo que mapeia os dados da resposta da API do GitHub.
- **`ConsultaGitHub.java`**: Responsável por fazer a requisição à API e processar a resposta.
- **`ErroConsultaGitHubException.java`**: Exceção customizada para tratar erros de consulta à API.

## Contribuição

Contribuições são bem-vindas! Para contribuir:

1. Faça um fork do repositório.
2. Crie uma nova branch (`git checkout -b feature/nova-funcionalidade`).
3. Commit suas mudanças (`git commit -m 'Adiciona nova funcionalidade'`).
4. Faça o push para a branch (`git push origin feature/nova-funcionalidade`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo `LICENSE` para mais informações.

## Contato

Em caso de dúvidas ou sugestões, entre em contato:
- Nome: Christopher Barros
- E-mail: chrisbmineiro@gmail.com
- GitHub: [github.com/chrisbmineiro](https://github.com/chrisbmineiro)
