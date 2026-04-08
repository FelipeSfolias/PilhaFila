# Projeto Pilha e Fila com Array em Java

## Nome do aluno

Felipe Eduardo Sfolias Stachak

## Link para vídeo com explicação do Projeto:


## Descrição do projeto
Este projeto foi desenvolvido em Java com o objetivo de demonstrar o funcionamento de duas estruturas de dados muito importantes na programação: pilha e fila.

As duas estruturas foram implementadas manualmente utilizando arrays, sem o uso de classes prontas da linguagem, como Stack, Queue, ArrayList ou LinkedList.

O programa funciona no console e possui um menu interativo para que o usuário possa testar as operações de pilha e fila.

## Explicação breve sobre pilha e fila

### Pilha
A pilha segue a lógica LIFO (Last In, First Out), ou seja, o último elemento que entra é o primeiro que sai.

Operações implementadas:
- push()
- pop()
- peek()
- isEmpty()
- isFull()
- display()

### Fila
A fila segue a lógica FIFO (First In, First Out), ou seja, o primeiro elemento que entra é o primeiro que sai.

Operações implementadas:
- enqueue()
- dequeue()
- front()
- isEmpty()
- isFull()
- display()

## Estrutura do projeto
- Main.java
- PilhaArray.java
- FilaArray.java
    Devem estar todos na mesmo mesmo diretório para realizar a execução
## Instruções para compilar e executar

    Necessário o Java JDK intalado para rodar
Link para Download:https://www.oracle.com/br/java/technologies/downloads/
### Compilar
```bash
javac Main.java PilhaArray.java FilaArray.java
```
Esse comando vai gerar os arquivos .class
Depois de compilar, é possível rodar o projeto com:
```bash
java Main
```
