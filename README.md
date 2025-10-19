# Exemplo de API no Render.com


[Github Actions](https://docs.github.com/pt/actions) | [Spring Initializr](https://start.spring.io/) | [Render.com](https://render.com/)


Exemplo de Spring Boot com Docker -  template inicial de como construir um projeto com Spring Boot e realizar o deploy automático no Render.com.

## Início rápido

1. Crie um fork deste repositório.
2. Crie uma sua conta em [Render.com](https://render.com/)
3. No Dashboard do Render, utilize a opção `Deploy a Web Service`
4. Selecione o projeto no seu Github
5. Na opção `Language` Selecione `Docker`
6. Na opção `Branch` Selecione `main`
7. Em `Instance Type` vamos utilizar a opção `For hobby projects - Free`

Após o build e implantação do projeto, o render irá disponibilizar uma URL para acesso, após isso
> Agora qualquer alteração na branch main será automaticamente enviado para o Render

## Ativar PR Preview
1. No Dashboard do projeto dentro do Render, clique no menu `Previews` 
2. Em `Pull Request Previews` Clique em `Edit`
3. Altere para `Automatic` e salve a alteração


##  Contribuindo para o projeto

Para contribuir, siga estas etapas:

1. Crie um fork deste repositório.
2. Crie um branch: `git checkout -b <nome_branch>`.
3. Faça suas alterações e confirme-as: `git commit -m '<mensagem_commit>'`
4. Envie para o branch original: `git push origin <nome_do_projeto> / <local>`
5. Crie a solicitação de pull.

Como alternativa, consulte a documentação do GitHub em [como criar uma solicitação pull](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request).

## Recomendação (opcional)

Para uma melhor semântica nos commits, recomendamos repositório sobre [padrões de commits](https://github.com/iuricode/padroes-de-commits). Assim ficará mais fácil para avaliar seu pull request.


