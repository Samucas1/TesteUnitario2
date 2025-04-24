🧮 Calculadora em Java com Testes JUnit

Este projeto é uma aplicação simples de uma **Calculadora** desenvolvida em **Java**, utilizando o paradigma de **Programação Orientada a Objetos (POO)**.

A solução também inclui testes automatizados utilizando o framework **JUnit 5** para garantir que os métodos da calculadora funcionem corretamente.

---

## ✅ Funcionalidades

A classe `Calculadora` possui os seguintes métodos:

- `somar(double, double)`: retorna a soma de dois números.
- `subtrair(double, double)`: retorna a subtração de dois números.
- `multiplicar(double, double)`: retorna a multiplicação de dois números.
- `dividir(double, double)`: retorna a divisão de dois números (lança exceção ao dividir por zero).
- `potenciar(double, double)`: retorna o valor da base elevada ao expoente.

---

## 🧪 Testes Unitários

A classe `CalculadoraTeste` foi criada para testar cada um dos métodos da calculadora usando **JUnit 5**.

Os testes cobrem:

- Operações com valores positivos e negativos.
- Validação de divisão por zero.
- Resultados esperados de cada operação matemática.

---

## 🛠️ Tecnologias Utilizadas

- **Java 11+**
- **JUnit 5**
- **Eclipse IDE** (ou qualquer outra IDE Java)
- **Maven** (opcional, para gerenciamento de dependências)

---

## ▶️ Como Executar

1. Clone o repositório ou copie os arquivos `.java` para seu projeto no Eclipse.
2. Compile e execute a classe `Calculadora` para testar manualmente.
3. Execute os testes da classe `CalculadoraTeste` utilizando a ferramenta de testes da sua IDE (como Eclipse ou IntelliJ).

---

## 🚀 Possíveis Melhorias Futuras

- Criar uma interface gráfica (GUI) para facilitar o uso.
- Adicionar suporte para operações com mais de dois números.
- Permitir entrada via terminal para tornar a calculadora interativa.

---

## 👨‍💻 Desenvolvedor

Projeto feito para fins de estudo e prática de testes unitários com JUnit e conceitos de POO.
