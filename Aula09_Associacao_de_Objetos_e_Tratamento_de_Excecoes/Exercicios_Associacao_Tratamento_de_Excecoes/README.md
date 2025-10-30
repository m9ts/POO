Aqui está uma versão revisada e ajustada do seu **README.md** com correção gramatical, de acentuação e formatação — mantendo o conteúdo técnico correto e mais claro:

---

# Questões – Associações entre Classes

## 1. Classifique os tipos de associação entre as seguintes classes e justifique sua resposta:

a) **Hospital → Endereço**
**R:** Agregação
**Justificativa:** O hospital possui um endereço, mas o endereço pode existir independentemente do hospital.

b) **Enfermaria → Paciente**
**R:** Agregação
**Justificativa:** Uma enfermaria pode existir sem necessariamente conter pacientes, e um paciente pode ser movido para outra enfermaria.

c) **Paciente → Médico**
**R:** Composição
**Justificativa:** Nesta relação, o paciente depende diretamente do médico — sem o médico responsável, o paciente não tem acompanhamento dentro do sistema hospitalar.

---

## 2. Explique com suas palavras a diferença entre agregação e composição, usando os exemplos do sistema hospitalar.

**R:**
A **agregação** ocorre quando uma classe (o todo) possui outra (a parte), mas ambas podem existir separadamente.
Exemplo: uma **Enfermaria** pode existir mesmo sem conter **Pacientes**, e o **Endereço** continua existindo mesmo sem estar vinculado a um **Hospital**.

Já a **composição** ocorre quando a existência da parte depende totalmente do todo.
Exemplo: um **Paciente** depende do seu **Médico** — se o médico (ou o vínculo com ele) for removido, o paciente perde a referência essencial para o seu acompanhamento no sistema.

---

## 3. Julgue as afirmações abaixo como Verdadeiras (V) ou Falsas (F):

a) Um endereço pode existir independentemente do hospital. **(V)**
b) Um paciente pode ser transferido de uma enfermaria para outra sem deixar de existir. **(V)**
c) Um paciente só pode existir se estiver associado a um médico. **(V)** 

---

## 4. Analise o trecho de código abaixo e identifique o tipo de associação representado. Justifique.

```java
class Enfermaria {
    List<Paciente> pacientes = new ArrayList<>();
}
```

**R:** Representa uma **agregação**.
**Justificativa:** A enfermaria contém uma lista de pacientes, mas estes podem existir independentemente dela e serem movidos para outra enfermaria.

---

## 5. Descreva uma situação em que a associação entre **Paciente** e **Médico** poderia ser transformada em uma agregação. O que mudaria no modelo e no ciclo de vida dos objetos?

**R:**
Se o sistema permitir que o **Paciente** exista independentemente de um **Médico** — por exemplo, no caso de um paciente recém-cadastrado que ainda não foi atendido — a relação passaria a ser uma **agregação**.

Nesse caso:

* O **Paciente** não dependeria do **Médico** para existir.
* O ciclo de vida de ambos seria independente.
* A exclusão de um médico não implicaria automaticamente na exclusão dos pacientes associados.

---
