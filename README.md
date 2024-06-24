# Sistema de gerenciamento de contas bancárias

Este é um programa Java para gerenciar uma conta bancária. O programa permite aos usuários criar uma conta, fazer depósitos e sacar fundos. O saldo é atualizado em conformidade e uma taxa é aplicada para saques.

## Funcionalidades

- Crie uma nova conta bancária com saldo inicial
- Faça depósitos na conta
- Retirar fundos da conta (com taxa)
- Exibir informações da conta

## Estrutura do Projeto

O projeto é composto por dois arquivos principais:

1. `Program.java`
2. `Validator.java`

### Program.java

Este é o arquivo principal que contém a lógica de interação com o usuário.

### Validator.java

Esta classe representa uma conta bancária e fornece métodos para gerenciá-la.

## Métodos

- **int getUserAccountNumber()**: Retorna o número da conta do usuário.
- **String getAccountName()**: Retorna o nome do titular da conta.
- **void setAccountName(String accountName)**: Define o nome do titular da conta.
- **double getStartingBalance()**: Retorna o saldo atual da conta.
- **void depositAmount(double depositValue)**: Deposita o valor especificado na conta.
- **void amountToWithdraw(double withdrawValue)**: retira o valor especificado da conta e aplica uma taxa.
- **String toString()**: Retorna uma representação de string das informações da conta.

### Exemplo de uso

1. Quando solicitado, insira o número da conta e o nome do titular da conta.
2. Especifique se existe um depósito inicial. Se sim, insira o valor do depósito.
3. Visualize os dados da conta.
4. Insira um valor de depósito e veja os dados atualizados da conta.
5. Insira um valor de saque e veja os dados atualizados da conta, lembrando que é aplicada uma taxa.

