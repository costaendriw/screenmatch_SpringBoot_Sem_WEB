# 🎬 ScreenMatch (Back-end)

Este projeto é a parte "core" do sistema ScreenMatch, desenvolvido com Spring Boot. Ele foca na **lógica de negócios e processamento de dados** para uma aplicação de catálogo de filmes e séries, sem uma interface web visível. Imagine-o como o "cérebro" que organiza as informações por trás de um serviço de streaming!

## 🚀 O Que Foi Realizado?

O objetivo principal deste projeto foi construir um sistema robusto para:

* **Busca e Consumo de Dados Externos:** Conectar-se a APIs externas (como a OMDB API) para buscar informações detalhadas sobre filmes e séries.
* **Processamento e Organização de Dados:** Receber os dados brutos da API e transformá-los em objetos Java (Filme, Série, Episódio) de forma estruturada e eficiente.
* **Cálculos e Lógica de Negócio:** Implementar funcionalidades como cálculo de média de avaliações, busca de títulos específicos, e organização de episódios por temporada.
* **Persistência de Dados (Futuro):** Embora esta versão não inclua persistência em banco de dados, a estrutura do projeto foi pensada para fácil integração futura com bancos de dados, permitindo salvar e gerenciar o catálogo.

Em essência, este é o "motor" que busca, processa e disponibiliza as informações de filmes e séries para que outras aplicações (como uma interface web ou mobile) possam utilizá-las.

## 🛠️ Tecnologias Utilizadas

Este projeto foi construído utilizando as seguintes tecnologias:

* **Java:** A linguagem de programação principal.
* **Spring Boot:** Framework que simplifica o desenvolvimento de aplicações Java, provendo uma estrutura robusta e ferramentas para construção de APIs e serviços.
* **APIs RESTful:** Utilizado para consumir dados de serviços externos (como a OMDB API).
* **Jackson (ObjectMapper):** Biblioteca utilizada para mapear JSON (dados da API) para objetos Java.

## ⚙️ Como o Projeto Funciona (Conceito)

Este projeto atua como um **serviço de back-end**. Ele não possui uma interface gráfica. Em vez disso, ele:

1.  **Envia requisições** para APIs externas (ex: "Me dê os dados da série 'The Office'").
2.  **Recebe as respostas** (dados em JSON).
3.  **Processa esses dados**, convertendo-os em objetos Java com os quais a aplicação pode trabalhar facilmente.
4.  **Executa a lógica**, como calcular a média de avaliações ou filtrar episódios.

Ele pode ser integrado com outras aplicações (como um front-end web ou mobile) que consumirão as informações e funcionalidades que este back-end oferece.

## ▶️ Como Executar o Projeto (para Desenvolvedores)

Para rodar e explorar este projeto em sua máquina, você precisará de:

1.  **Pré-requisitos:**
    * [Java Development Kit (JDK) 17 ou superior](https://www.oracle.com/java/technologies/downloads/)
    * Uma IDE Java como [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) ou [Eclipse](https://www.eclipse.com/downloads/)
    * [Maven](https://maven.apache.org/download.cgi) (gerenciador de dependências, geralmente já incluído nas IDEs)

2.  **Clone o Repositório:**
    Abra seu terminal ou Git Bash e execute o comando:
    ```bash
    git clone [https://github.com/costaendriw/screenmatch_SpringBoot_Sem_WEB.git](https://github.com/costaendriw/screenmatch_SpringBoot_Sem_WEB.git)
    ```

3.  **Navegue até o Diretório do Projeto:**
    ```bash
    cd screenmatch_SpringBoot_Sem_WEB
    ```

4.  **Importe o Projeto na sua IDE:**
    * Abra sua IDE (IntelliJ IDEA, Eclipse).
    * Selecione "Open" ou "Import Project" e navegue até a pasta `screenmatch_SpringBoot_Sem_WEB` que você clonou.
    * A IDE deve reconhecer o projeto Maven automaticamente.

5.  **Execute a Aplicação:**
    * Encontre o arquivo `ScreenmatchApplication.java` (geralmente em `src/main/java/.../screenmatch/ScreenmatchApplication.java`).
    * Clique com o botão direito nele e selecione "Run 'ScreenmatchApplication.main()'".

    A aplicação será iniciada no console da IDE. Você verá logs indicando que o Spring Boot está subindo e, em seguida, a execução da lógica de processamento de dados (buscas, cálculos, etc.) que você implementou.

## 🤝 Contribuição

Contribuições são sempre bem-vindas! Se você tiver sugestões, melhorias ou encontrar algum bug, sinta-se à vontade para:

1.  Fazer um `fork` do projeto.
2.  Criar uma `branch` para sua funcionalidade (`git checkout -b feature/MinhaNovaFuncionalidade`).
3.  Fazer suas alterações.
4.  Comitar suas mudanças (`git commit -m 'Adiciona nova funcionalidade X'`).
5.  Enviar para sua `branch` (`git push origin feature/MinhaNovaFuncionalidade`).
6.  Abrir um `Pull Request`.

## 📄 Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo `LICENSE` para mais detalhes.
