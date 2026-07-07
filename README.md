# 📚 Exercícios de Java - DIO

Este repositório contém os exercícios desenvolvidos durante o curso de Java da DIO.

## 📋 Pré-requisitos

Antes de abrir o projeto, instale os seguintes programas:

### 1. Git

Baixe e instale:

https://git-scm.com/downloads

Verifique a instalação:

```bash
git --version
```

---

### 2. JDK (Java Development Kit)

Baixe o JDK (versão 21 ou superior):

https://adoptium.net/

ou

https://www.oracle.com/java/technologies/downloads/

Verifique a instalação:

```bash
java -version
javac -version
```

---

### 3. IntelliJ IDEA Community

Download:

https://www.jetbrains.com/idea/download/

Durante a instalação, é recomendado marcar:

- Add "Open Folder as Project"
- Add to PATH (opcional)
- Create Desktop Shortcut

---

## 📥 Clonando o projeto

```bash
git clone <URL_DO_REPOSITORIO>
```

Entre na pasta:

```bash
cd JAVADIOEXERCICIOS
```

---

## 🚀 Abrindo o projeto

Abra o IntelliJ IDEA.

Escolha:

```
Open
```

Selecione a pasta:

```
JAVADIOEXERCICIOS
```

O IntelliJ irá reconhecer automaticamente os projetos.

---

## ⚙️ Caso o IntelliJ não encontre o Java

Vá em:

```
File
→ Project Structure
→ SDKs
```

Adicione o JDK instalado.

Depois selecione esse SDK para o projeto.

---

## ▶️ Executando os exercícios

Cada aula possui sua própria pasta.

Abra a classe que contém o método:

```java
public static void main(String[] args)
```

Clique no botão ▶ ao lado do método `main`.

---

## 📁 Estrutura

```
JAVADIOEXERCICIOS
│
├── Aula 1
├── Aula 2
├── Aula 3
└── ...
```

---

## 🔄 Atualizando o repositório

Baixar alterações:

```bash
git pull
```

Enviar alterações:

```bash
git add .
git commit -m "Descrição"
git push
```

---

## 📝 Observações

As pastas abaixo não fazem parte do projeto e são recriadas automaticamente pelo IntelliJ:

- `.idea/`
- `out/`
- `target/`
- `build/`
- `*.iml`

Por isso elas estão listadas no `.gitignore`.
