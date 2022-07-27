# :school: Imersão Alura em Java - Criando Stickers

Este foi o meu primeiro projeto em **Java**, no primeiro contato com a linguagem, aprendido durante a imersão feita entre os dias 18 e 22/julho de 2022 pelos instrutores Jacqueline Oliveira, Alexandre Aquiles e Paulo Silveira, da [Alura](https://www.alura.com.br/).

## :notebook_with_decorative_cover: Projeto

O objetivo é construir Stickers, consumindo uma API pessoal gerada no banco de dados global MongoDB Atlas e compartilhada através do Heroku, um PaaS (Platform as a Service) que permite que possamos hospedar e compartilhar nossa API na nuvem.

## :open_file_folder: Resultado do projeto

Os Stickers gerados utilizaram as imagens dos projetos educacionais da Escola Matriz como o [MatrizKIDS](https://www.instagram.com/matrizkids/), que ensina crianças a programarem utilizando o [Scratch](https://scratch.mit.edu/users/FabioMori/projects/), o [MatrizCast](https://www.youtube.com/c/MatrizCast), o podcast de educação que conecta os jovens com diversos profissionais no mercado de trabalho e o Matriz4YOU, que busca alfabetizar digitalmente pessoas com mais de 50 anos.

<img src="https://user-images.githubusercontent.com/101336111/181359089-05d150c3-9110-482f-b17f-c3abecaa29d1.png" width="150" height="150"> <img src="https://user-images.githubusercontent.com/101336111/181359115-3b3e694f-5369-49c1-8e0f-8495958789da.png" width="150" height="200"> <img src="https://user-images.githubusercontent.com/101336111/181359139-63a98bf9-f7ef-4ac6-b33b-ee21e3c9384a.png" width="100" height="200"> <img src="https://user-images.githubusercontent.com/101336111/181359158-1c5de2ea-8d6c-463d-9c89-ff076abd8f3f.png" width="100" height="100"> <img src="https://user-images.githubusercontent.com/101336111/181359171-bad67f22-8ed3-408f-95e8-77dde289f3e4.png" width="100" height="100"> <img src="https://user-images.githubusercontent.com/101336111/181359179-fb80fa91-e0e9-4004-af2e-7b3847b51a2d.png" width="100" height="200"> <img src="https://user-images.githubusercontent.com/101336111/181359199-d2fd7c48-4673-4290-b50f-cf321cabc3f4.png" width="100" height="100">

## :unlock: O aprendizado do aluno Fábio Mori
### :bulb: Conceitos e ferramentas de programação

- Refatoração do código: é uma forma de construirmos nosso algoritmo de modo com que ele tenha um baixo acoplamento, ou seja, suas funcionalidades não estão presas umas nas outras. Desta forma, construímos um código mais limpo, organizado, separado, facilitando o entendimento de outras pessoas que não participaram do seu desenvolvimento. Esta é a importância da técnica da orientação ao objeto, que além de destas vantagens, também nos permite utilizar estes módulos em outras partes do código que sejam necessárias, sem a necessidade de ter que reescrevê-lo novamente.  

- Web API (Applications Protocol Interface): é um serviço que conecta um aplicativo a um banco de dados, permitindo fazer requisições para ler, editar e apagar informações. Podemos pensar em uma API como uma conexão entre dispositivos e servidores, feita para facilitar o acesso aos dados. Por exemplo, através de dispositivos podemos fazer uma requisição para uma API, que por sua vez realiza um processamento no servidor onde as informações estão armazenadas, e recebe um resultado de volta. Por sua vez, a API retorna este resultado como resposta para a requisição feita do dispositivo, finalizando este ciclo de comunicação de dados. 

- IDE ( Integrated Development Environment): é o ambiente de desenvolvimento que utilizamos para programar. Existem diversas opções, cada uma com vantagens e desvantagens dependendo da linguagem que será utilizada. De toda forma, uma IDE possui várias ferramentas que auxiliam o programador durante o desenvolvimento do algoritmo. Neste projeto foi utilizado o Visual Studio Code.

- JSON (Java Script Object Notation): é uma forma de notação **Java Script** muito utilizada para representar banco de dados e comum para diversas linguagens. Existem algumas regras que caracterizam um arquivo JSON, como: não pode ter funções, não pode ter comentários, todo texto tem aspas duplas e as propriedades sempre tem aspas duplas também.

- Expressões Regulares: são padrões encontrados em strings e são muito utilizadas para pesquisa e substituição de textos.
  
### :arrow_forward: Rodando o Projeto
- Primeiro você deve fazer o download das pastas do projeto através do Git ou do arquivo ZIP.
- Em seguida você poderá utilizar uma IDE, como o Visual Studio Code, para abrir a pasta do projeto.
- Para rodar o projeto e gerar os stickers, você deve compilar o arquivo ``App.java`` e verificar as imagens geradas na pasta ``saida``

