# Herança e Polimorfismo em Java

## Herança
Mecanismo que permite que uma classe (subclasse) herde atributos e métodos de outra classe (superclasse), promovendo reutilização de código e hierarquia.

```java
class Animal {
    void comer() { }
}

class Cachorro extends Animal {
    void latir() { }
}
```

## Super
Palavra-chave usada para:
- Chamar o construtor da superclasse
- Acessar métodos/atributos da superclasse

```java
class Cachorro extends Animal {
    Cachorro() {
        super(); // Chama construtor de Animal
    }
    
    void comer() {
        super.comer(); // Chama método da superclasse
    }
}
```

## Override (Sobrescrita)
Redefinir um método da superclasse na subclasse, mantendo a mesma assinatura. Permite polimorfismo.

```java
class Animal {
    void fazerSom() { }
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Au au!");
    }
}
```

## Overloading (Sobrecarga)
Criar múltiplos métodos com o **mesmo nome** mas **parâmetros diferentes** na mesma classe.

```java
class Calculadora {
    int somar(int a, int b) { return a + b; }
    double somar(double a, double b) { return a + b; }
    int somar(int a, int b, int c) { return a + b + c; }
}
```

## Polimorfismo
Capacidade de um objeto assumir múltiplas formas. Permite tratar objetos de classes diferentes através de uma referência comum.

```java
Animal a1 = new Cachorro();
Animal a2 = new Gato();

a1.fazerSom(); // "Au au!"
a2.fazerSom(); // "Miau!"
```

## Amarração (Binding)

### Amarração Estática (Static Binding)
- Ocorre em **tempo de compilação**
- Resolve: métodos **private, final, static** e **overloading**
- Usa o tipo da **referência**

### Amarração Dinâmica (Dynamic Binding)
- Ocorre em **tempo de execução**
- Resolve: métodos **sobrescritos (override)**
- Usa o tipo do **objeto real**
- Permite polimorfismo

```java
Animal a = new Cachorro(); // Referência: Animal, Objeto: Cachorro
a.fazerSom(); // Amarração dinâmica - executa método de Cachorro
```

## Diferenças Principais

| Conceito | Override | Overloading |
|----------|----------|-------------|
| Local | Subclasse | Mesma classe |
| Assinatura | Mesma | Diferente |
| Amarração | Dinâmica | Estática |
| Objetivo | Polimorfismo | Flexibilidade de uso |