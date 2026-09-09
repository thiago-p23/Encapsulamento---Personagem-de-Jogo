# Encapsulamento---Personagem-de-Jogo

# Desafio Personagem Java

## Descrição

Este projeto implementa uma classe `Personagem` em Java para controlar a vida, energia e nível de um personagem de videogame.

O objetivo principal é aplicar conceitos de Programação Orientada a Objetos, principalmente encapsulamento, garantindo que os atributos do personagem não possam ser alterados livremente.

## Regras de negócio

A classe `Personagem` segue as seguintes regras:

* Os atributos `nome`, `vida`, `energia` e `nivel` são privados.
* A vida começa em 100.
* A vida pode variar entre 0 e 100.
* A energia começa em 100.
* A energia pode variar entre 0 e 100.
* O nível começa em 1.
* Não existe `setVida()`.
* Não existe `setEnergia()`.
* O método `receberDano(int dano)` diminui a vida do personagem.
* O dano deve ser um valor positivo.
* A vida não pode ficar abaixo de 0.
* O método `descansar()` recupera energia.
* A energia não pode ultrapassar 100.
* O método `atacar()` consome energia.
* O personagem não pode atacar se não tiver energia suficiente.
* Um personagem com vida igual a 0 é considerado derrotado.
* O método `getStatus()` informa automaticamente se o personagem está `Vivo` ou `Derrotado`.
* Não existe um atributo `status` que possa ser alterado manualmente.

## Estrutura do projeto

```text
desafio-personagem-java/
├── src/
│   ├── Personagem.java
│   └── Main.java
└── README.md
```

## Classe Personagem

A classe `Personagem` possui os seguintes atributos:

```java
private String nome;
private int vida;
private int energia;
private int nivel;
```

Os atributos são privados para garantir o encapsulamento.

O personagem é criado com vida e energia iniciais de 100 e nível inicial igual a 1.

## Principais métodos

### receberDano()

O método `receberDano(int dano)` reduz a vida do personagem.

```java
personagem.receberDano(30);
```

Caso o dano seja maior que a vida atual, a vida será definida como 0.

### descansar()

O método `descansar()` recupera 30 pontos de energia.

```java
personagem.descansar();
```

A energia máxima permitida é 100.

### atacar()

O método `atacar()` consome 20 pontos de energia.

```java
personagem.atacar();
```

Caso o personagem não possua energia suficiente, o ataque não será realizado.

Um personagem derrotado também não pode atacar.

### getStatus()

O método `getStatus()` verifica a vida atual do personagem e retorna automaticamente seu estado.

```java
personagem.getStatus();
```

Se a vida for maior que 0:

```text
Vivo
```

Se a vida for igual a 0:

```text
Derrotado
```

Não é necessário criar ou alterar um atributo `status`.

## Classe Main

A classe `Main` é utilizada para demonstrar o funcionamento da classe `Personagem` e testar suas regras de negócio.

São realizados testes de:

* Criação do personagem.
* Verificação do status inicial.
* Ataque.
* Recuperação de energia.
* Recebimento de dano.
* Consumo de energia.
* Tentativa de atacar sem energia suficiente.
* Dano que reduz a vida para 0.
* Tentativa de atacar após ser derrotado.
* Tentativa de descansar após ser derrotado.

## Exemplo de execução

```text
=== STATUS INICIAL ===
Nome: Guerreiro
Vida: 100
Energia: 100
Nível: 1
Status: Vivo

=== TESTE DE ATAQUE ===
Guerreiro atacou!
Energia restante: 80

=== TESTE DE DESCANSO ===
Guerreiro descansou e recuperou energia.

=== TESTE DE DANO ===
Guerreiro recebeu 40 de dano.

=== TESTE DE DANO FATAL ===
Guerreiro recebeu 100 de dano.
Status: Derrotado
```

## Conceitos utilizados

O projeto utiliza conceitos importantes de Programação Orientada a Objetos:

### Encapsulamento

Os atributos da classe são `private`, impedindo que sejam modificados diretamente fora da classe.

### Métodos de acesso

Os métodos `getNome()`, `getVida()`, `getEnergia()` e `getNivel()` permitem consultar os valores dos atributos sem permitir alterações diretas.

### Validação de regras

As alterações de vida e energia são realizadas por métodos que verificam as regras antes de modificar os valores.

### Estado derivado

O status do personagem não é armazenado em um atributo. Ele é determinado automaticamente com base na vida atual.

## Tecnologias utilizadas

* Java
* Programação Orientada a Objetos
* Git
* GitHub

## Como executar

1. Clone este repositório.

```bash
git clone URL_DO_REPOSITORIO
```

2. Acesse a pasta do projeto.

```bash
cd desafio-personagem-java
```

3. Compile os arquivos Java.

```bash
javac src/*.java
```

4. Execute a classe `Main`.

```bash
java -cp src Main
```

## Objetivo do desafio

Este projeto foi desenvolvido como atividade prática para aplicar conceitos de encapsulamento, métodos, atributos privados, validação de regras de negócio e Programação Orientada a Objetos em Java.
