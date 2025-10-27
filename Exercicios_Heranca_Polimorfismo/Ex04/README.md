# Exercício 04 — Sistema de Biblioteca Virtual

João está desenvolvendo um sistema de biblioteca virtual. Ele percebe que existem diferentes tipos de conteúdos: livros, revistas, artigos científicos e vídeos educativos. Alguns conteúdos podem ser baixados, outros apenas consultados online. Além disso, todos os conteúdos têm título, autor e ano de publicação, mas o modo como cada um é exibido para o usuário varia bastante.

---

## Atividades e Perguntas

1. Crie um Diagrama de Classes para representar o sistema.  
   **R:** [Diagrama de Classes](https://tinyurl.com/POO-exercicio04)

2. Desenvolva o sistema em **Java**.

3. Qual entidade do sistema poderia ser representada como **classe abstrata**?  
   **R:** A entidade **`Conteudo`**, pois é uma generalização dos tipos específicos e não deve ser instanciada.

4. Justifique sua escolha considerando os conceitos de **generalização** e **implementação parcial**.  
   **R:** A classe `Conteudo` define os atributos e métodos comuns a todos os conteúdos, mas o método de exibição é específico para cada tipo. Portanto, podemos fornecer uma implementação parcial na classe abstrata e exigir que cada subclasse complete os detalhes.

5. Qual comportamento poderia ser representado como **interface**?  
   **R:** As interfaces **`Baixavel`** e **`ConsultavelOnline`**.

6. Justifique sua escolha considerando que nem todo conteúdo pode ter esse comportamento.  
   **R:** Nem todo conteúdo pode ser baixado ou consultado online. Usar interfaces permite que cada tipo de conteúdo implemente apenas os comportamentos que fazem sentido para ele, garantindo flexibilidade.

7. Explique como o **polimorfismo** poderia ser aplicado neste cenário usando a classe abstrata e as interfaces identificadas.  
   **R:** O polimorfismo permite que possamos trabalhar com referências do tipo `Conteudo` ou das interfaces `Baixavel`/`ConsultavelOnline` sem nos preocupar com o tipo concreto do objeto. Por exemplo, podemos criar um método que exiba informações de qualquer conteúdo chamando `exibirDetalhes()`, ou baixar qualquer conteúdo que implemente `Baixavel` chamando `baixar()`, sem precisar saber se é um livro, artigo ou vídeo. O Java irá resolver em tempo de execução qual implementação concreta usar.

---
