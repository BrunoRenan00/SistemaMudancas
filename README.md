Bruno Renan Silva de Oliveira RA:26002006
# Sistema de Transporte Rodoviário de Mudanças

## Sobre o projeto

Este projeto foi desenvolvido como parte do Projeto Integrado do curso de Análise e Desenvolvimento de Sistemas (ADS) da UNIFEOB.

O sistema tem como objetivo auxiliar no cadastro e gerenciamento de serviços de transporte de mudanças, permitindo registrar os dados do cliente, origem, destino, distância, quantidade de itens e veículo utilizado.

## Objetivo

Desenvolver um sistema simples em Java para aplicar conceitos de lógica de programação e Programação Orientada a Objetos (POO).

## Tecnologias utilizadas

- Java
- Visual Studio Code
- Git
- GitHub
- JDK

## Estrutura do projeto

### Cliente.java

Responsável pelo cadastro dos dados do cliente, como nome e telefone.

### Veiculo.java

Classe abstrata que representa um veículo utilizado no transporte.

### Van.java

Representa uma van e realiza o cálculo do valor do transporte de acordo com a distância.

### Caminhao.java

Representa um caminhão e realiza o cálculo do valor do transporte de acordo com a distância.

### Mudanca.java

Responsável pelas informações da mudança, cálculo do valor e controle do status do transporte.

### Main.java

Classe principal responsável pela execução do sistema e interação com o usuário através do terminal.

## Conceitos de Programação Orientada a Objetos

O projeto utiliza os seguintes conceitos:

- Classes e objetos
- Encapsulamento
- Herança
- Abstração
- Polimorfismo
- Métodos
- Construtores

## Cálculo do valor

O sistema utiliza valores diferentes de acordo com o veículo:

- Van: R$ 3,50 por km
- Caminhão: R$ 5,00 por km

Também são acrescentados valores adicionais:

- Mais de 30 itens: + R$ 100,00
- Distância superior a 200 km: + R$ 150,00

## Status da mudança

O transporte possui três possíveis estados:

1. Agendado
2. Em transporte
3. Concluído

## Como executar

1. Instale o JDK.
2. Abra a pasta do projeto no Visual Studio Code.
3. Abra o terminal.
4. Compile os arquivos Java:

```bash
javac *.java
