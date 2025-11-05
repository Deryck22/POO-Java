# 🚀 Aprendendo na Prática Programação Orientada a Objetos (POO)

Este projeto foi desenvolvido com o objetivo de aplicar e reforçar os principais conceitos da **Programação Orientada a Objetos (POO)** em Java, através da construção de um sistema que simula a dinâmica de um **Bootcamp**, com **cursos**, **mentorias** e **desenvolvedores** participantes.

O desafio foi inspirado em uma atividade prática co-criada com a plataforma [**Digital Innovation One (DIO)**](https://web.digitalinnovation.one/) 💛🧡, e está disponível gratuitamente para toda a comunidade de desenvolvedores Java.

---

## 🎯 Objetivo do Projeto

O principal objetivo deste projeto é colocar em prática os **quatro pilares da POO**:

- 🧱 **Abstração** — Representar entidades do mundo real de forma simplificada no código.  
- 🔒 **Encapsulamento** — Proteger os dados e expor apenas o necessário.  
- 🧬 **Herança** — Reaproveitar código e criar hierarquias entre classes.  
- 🎭 **Polimorfismo** — Permitir que métodos tenham comportamentos diferentes conforme o objeto que os invoca.

---

## 🧩 Estrutura do Projeto

O projeto é composto pelas seguintes classes:

### 🏫 `Bootcamp.java`
Representa o programa principal de aprendizado.  
Contém informações como **nome**, **descrição**, **conjunto de conteúdos** e **participantes (Devs)**.

### 📘 `Conteudo.java`
Classe **abstrata** que serve como base para os tipos de conteúdo oferecidos (curso e mentoria).  
Define atributos e métodos genéricos como **título**, **descrição** e **XP padrão**.

### 🎓 `Curso.java`
Classe que **herda de `Conteudo`**, representando um curso dentro do bootcamp.  
Possui um atributo adicional: **carga horária**.

### 💬 `Mentoria.java`
Classe que **herda de `Conteudo`**, representando uma sessão de mentoria.  
Adiciona o atributo **data**, indicando quando a mentoria ocorre.

### 👨‍💻 `Dev.java`
Representa um desenvolvedor inscrito no bootcamp.  
Controla o progresso do aluno, conteúdos inscritos e concluídos, além do cálculo do total de XP adquirido.

---

## ⚙️ Tecnologias Utilizadas

- ☕ **Java 11+**
- 🧠 Paradigma **Orientado a Objetos**
- 💻 IDE recomendada: **IntelliJ IDEA** (mas pode ser executado em qualquer IDE)
- 🔧 **Git & GitHub** para controle de versão

---

## 🧠 Conceitos Aplicados

- Criação de classes e objetos

- Uso de herança e abstração

- Implementação de encapsulamento via modificadores de acesso

- Aplicação de polimorfismo em métodos e heranças

- Manipulação de coleções (Set, LinkedHashSet)

- Utilização de classes abstratas e sobrescritas (@Override)

## 🤝 Contribuições

Contribuições são bem-vindas!

Se este projeto te ajudou, não esqueça de deixar uma ⭐ no repositório.

**Você pode:**

- Abrir issues com sugestões de melhorias 📝

- Enviar pull requests com novas funcionalidades 💡

- Compartilhar com outros devs interessados em aprender POO em Java 🚀

## 📬 Autor

👨‍💻 Deryck Silva

Desenvolvedor Java | Estudante de Ciência de Dados

🌐 GitHub: (https://github.com/Deryck22)

------------

Disponibilizado pela Prof: [cami-la](https://www.linkedin.com/in/cami-la/ "cami-la").
