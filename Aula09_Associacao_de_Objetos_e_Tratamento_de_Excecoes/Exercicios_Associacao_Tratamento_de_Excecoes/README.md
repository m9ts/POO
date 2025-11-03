# Sistema Hospitalar - Análise de Associações entre Classes

## Contexto do Sistema

Você está desenvolvendo um sistema para um hospital. O sistema envolve os seguintes elementos:

- **Hospital**: possui um endereço fixo.
- **Endereço**: contém rua e número. Só existe como parte do hospital.
- **Médico**: possui um nome e especialidade.
- **Paciente**: possui um nome e está associado a um médico.
- **Enfermaria**: agrupa vários pacientes, mas os pacientes podem existir fora da enfermaria.

---

## Questões – Associações entre Classes

### 1. Classifique os tipos de associação entre as seguintes classes e justifique sua resposta:

**a) Hospital → Endereço**

**R:** Composição

**Justificativa:** O endereço está totalmente atrelado ao hospital. Como descrito no enunciado: "Só existe como parte do hospital". Se o hospital deixar de existir, o endereço também deixa.

---

**b) Enfermaria → Paciente**

**R:** Agregação

**Justificativa:** A enfermaria agrupa pacientes, mas estes podem existir independentemente dela. Um paciente pode ser transferido entre enfermarias ou existir fora delas.

---

**c) Paciente → Médico**

**R:** Associação simples

**Justificativa:** Ambos existem de forma independente, portanto, não estabelecem uma relação todo-parte. O paciente está associado a um médico, mas ambos têm ciclos de vida independentes.

---

### 2. Explique com suas palavras a diferença entre agregação e composição, usando os exemplos do sistema hospitalar.

**R:**

A **agregação** ocorre quando uma classe (o todo) contém outra (a parte), mas ambas podem existir separadamente. A parte não depende do todo para existir.

**Exemplo:** Uma **Enfermaria** agrupa **Pacientes**, mas os pacientes podem existir fora da enfermaria e serem transferidos entre enfermarias.

Já a **composição** ocorre quando a parte depende completamente do todo para existir. Se o todo for destruído, a parte também deixa de existir.

**Exemplo:** O **Endereço** só existe como parte do **Hospital**. Se o hospital for removido do sistema, o endereço também será.

---

### 3. Julgue as afirmações abaixo como Verdadeiras (V) ou Falsas (F):

a) Um endereço pode existir independentemente do hospital. **(F)**

b) Um paciente pode ser transferido de uma enfermaria para outra sem deixar de existir. **(V)**

c) Um paciente só pode existir se estiver associado a um médico. **(F)**

---

### 4. Analise o trecho de código abaixo e identifique o tipo de associação representado. Justifique.
```java
class Enfermaria {
    List<Paciente> pacientes = new ArrayList<>();
}
```

**R:** Representa uma **agregação**.

**Justificativa:** A enfermaria contém uma lista de pacientes, mas estes podem existir independentemente dela. Os pacientes podem ser removidos da lista, transferidos para outra enfermaria ou existir sem estar em nenhuma enfermaria.

---

### 5. Descreva uma situação em que a associação entre **Paciente** e **Médico** poderia ser transformada em uma agregação. O que mudaria no modelo e no ciclo de vida dos objetos?

**R:**

A relação entre **Paciente** e **Médico** já é uma associação simples. Para que se tornasse uma **agregação**, seria necessário que o **Médico** passasse a "conter" ou "agrupar" pacientes de forma explícita, estabelecendo uma relação todo-parte.

**Exemplo de mudança:**

Se o sistema fosse modelado de forma que um **Médico** mantivesse uma lista de seus **Pacientes** sob seus cuidados, teríamos uma agregação onde:

- O **Médico** (todo) agrupa seus **Pacientes** (partes).
- Os **Pacientes** podem existir independentemente do médico.
- Um paciente pode ser transferido de um médico para outro.

**Mudanças no modelo:**
```java
class Medico {
    List<Paciente> pacientesAtendidos = new ArrayList<>();
}
```

**Mudanças no ciclo de vida:**

- A exclusão de um médico não implicaria na exclusão dos pacientes associados.
- Os pacientes poderiam ser reatribuídos a outros médicos.
- O médico seria responsável por gerenciar sua lista de pacientes, mas não pelo ciclo de vida deles.

---

### 6. Faça o diagrama de classes.

**R:**

https://tinyurl.com/POO-ex06-lista-associacao

---

### 7. Tratamento de Exceções

a) Considere o código abaixo:

```java
Hospital hospital = null;
System.out.println(hospital.getNome());
```

Qual exceção será lançada? Explique o motivo dessa exceção e como ela poderia ser evitada no código.

***R:**

O objeto hospital está com o valor **null**, portanto, não aponta para nenhum objeto real. Mesmo assim, o código tenta executar **hospital.getNome()** - então o Java tenta acessar um método de algo que não existe na memória. Isso gera uma exceção **NullPointerException**.

**Para evitar:**

Verifique se o objeto não é nulo antes de chamar o método. Veja:

```java
if (hospital != null) {
    System.out.println(hospital.getNome());
}
```

---

b) Observe o seguinte trecho:

```java
List<Paciente> pacientes = new ArrayList<>();
pacientes.add(new Paciente("Maria", null));
System.out.println(pacientes.get(2).getNome());
```

Qual exceção pode ocorrer aqui? Em que linha ela acontece e por quê? Mostre como o código poderia ser protegido com um bloco try-catch.

**R:**

Pode ocorrer a exceção **IndexOutOfBoundsException**, na linha 3. A exceção é lançada quando se tenta acessar um índice de um vetor que está fora de seus limites - como em **get(2)** tentando acessar uma posição inexistente, visto que **List<Paciente>** tem somente o elemento **Maria**, que corresponde ao índice 0.

**Usando try-catch:**

```java
try {
    List<Paciente> pacientes = new ArrayList<>();
    pacientes.add(new Paciente("Maria", null));
    System.out.println(pacientes.get(2).getNome());
} catch (IndexOutOfBoundsException ex) {
    System.out.println("Erro ao tentar acessar índice de um vetor que está fora de seus limites: " + ex.getMessage());
}
```

---

c) Analise o código abaixo:

```java
try {
    Enfermaria enfermaria = new Enfermaria();
    for (int i = 0; i <= 10; i++) {
        enfermaria.getPacientes().add(
            new Paciente("Paciente " + i, new Medico("Dr. João", "Clínico"))
        );
    } 
} catch (Exception e) {
    System.out.println("Erro: " + e.getMessage());
}
```

Que tipo de exceção pode ocorrer aqui? Explique o motivo. Como você poderia evitar essa situação antes que a exceção acontecesse?

**R:**

Caso **pacientes** dentro da classe **Enfermaria** não tenha sido inicializado, chamar o método **add()** irá gerar a exceção **NullPointerException**, porque você estaria tentando chamar um método em um referência que ainda é null.

**Para evitar:**

Basta inicializar a lista dentro da classe.

```java
class Enfermaria {
    private List<Paciente> pacientes = new ArrayList<>();

    public List<Paciente> getPacientes() {
        return pacientes;
    }
}
```