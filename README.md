# Sistema Bancário em Java

Este projeto em Java implementa um sistema bancário simples, onde os usuários podem criar contas, depositar e sacar fundos.

## Funcionalidades

- Criação de conta bancária com número e titular
- Opção para depósito inicial (opcional)
- Depósito de fundos em uma conta existente
- Saque de fundos de uma conta existente, com taxa de R$ 5.00

## Executando o Projeto

1. Certifique-se de ter o Java JDK instalado em sua máquina.
2. Clone este repositório para o seu ambiente local.
3. Abra um terminal ou prompt de comando e navegue até o diretório raiz do projeto.
4. Compile os arquivos Java usando o comando:
5. Execute o programa com o comando:

## Uso

Ao executar o programa, você será guiado por instruções interativas para criar contas, fazer depósitos e saques.

## Classes

### Program.java

Esta classe contém o método `main` e é responsável pela interação com o usuário e pela execução das operações bancárias.

### Account.java

A classe `Account` representa uma conta bancária e possui os seguintes métodos:

- `Account(int number, String holder)`: Cria uma conta com o número e titular especificados.
- `Account(int number, String holder, double initialDeposit)`: Cria uma conta com o número, titular e depósito inicial especificados.
- `String getHolder()`: Retorna o nome do titular da conta.
- `int getNumber()`: Retorna o número da conta.
- `void setNumber(int number)`: Define um novo número de conta.
- `double getBalance()`: Retorna o saldo da conta.
- `void deposit(double deposit)`: Deposita o valor especificado na conta.
- `void withdraw(double withdraw)`: Realiza um saque da conta, incluindo uma taxa de R$ 5.00.
- `String toString()`: Retorna uma representação em string da conta.

## Contribuições

Contribuições para este projeto são bem-vindas! Se você encontrar problemas ou tiver melhorias para sugerir, sinta-se à vontade para criar um pull request.
   
