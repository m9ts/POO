# Exercício 01 — Herança e Polimorfismo

## Perguntas

1. Se adicionarmos um novo tipo de veículo à lista, o código do `for` precisa mudar?  
2. O que aconteceria se esquecêssemos o `instanceof` e tentássemos chamar o método `abastecer` diretamente?  
3. Como o Java sabe qual versão do método `mover` chamar, mesmo usando o tipo genérico `VeiculoTransporte`?  
4. Se trocássemos `ArrayList` por `LinkedList`, o comportamento polimórfico mudaria? Por quê?

---

## Respostas

**1.**  
Não. O código do `for` permanece o mesmo, porque ele trabalha com o tipo genérico `VeiculoTransporte`.  
Portanto, qualquer classe que herde de `VeiculoTransporte` e implemente seus métodos poderá ser usada sem alterar o laço — graças ao **polimorfismo**.

---

**2.**  
O código **não compilaria**, já que o tipo declarado no `for` é `VeiculoTransporte`, e essa classe abstrata não declara o método `abastecer()`.  
O compilador impede essa chamada direta, garantindo a segurança de tipos.
"Exception in thread "main" java.lang.ClassCastException"

---

**3.**  
Devido ao **polimorfismo dinâmico** (ou **ligação tardia**).  
O Java decide **em tempo de execução** qual implementação de `mover()` chamar, com base no **objeto real** armazenado na variável, e não no tipo de referência (`VeiculoTransporte`).

---

**4.**  
Não mudaria, porque o comportamento polimórfico vem das **classes de veículos**, não da coleção.  
A interface `List` permite diferentes implementações polimórficas (`ArrayList`, `LinkedList`, etc.), e o laço `for` funcionaria da mesma forma.
