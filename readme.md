# DesafioContaBancaria
## Descrição
O projeto "Desafio" é uma aplicação simples em Java que simula um sistema bancário básico. O sistema permite ao usuário consultar seu saldo, receber valores, transferir valores e encerrar a aplicação. Ele é uma boa introdução para quem está aprendendo Java e deseja praticar a utilização de entradas e saídas, além de estruturas de controle.

## Funcionalidades
Consultar saldos: Exibe o saldo atual da conta.
Receber valor: Permite adicionar um valor ao saldo da conta.
Transferir valor: Permite transferir um valor para outra conta, se o saldo for suficiente.
Sair: Encerra o sistema.

## Como Usar
1. Compilação e Execução

- Compile o código usando o comando javac Desafio.java.
- Execute o programa compilado com o comando java Desafio.
2. Entrada de Dados

- O programa solicitará que você insira seu nome, o tipo da sua conta e seu saldo bancário inicial.
- Após o início, você verá um menu com as opções de operação que pode escolher digitando o número correspondente.
3.	Opções do Menu

- 1: Consultar saldos - Mostra o saldo atual da conta.  
- 2: Receber valor - Solicita um valor para adicionar ao saldo.  
- 3: Transferir valor - Solicita um valor para transferir e verifica se há saldo suficiente.  
- 4: Sair - Encerra o programa.


## Exemplo de Uso
```
Digite seu nome:
João Silva
Digite o tipo da sua conta
Conta Corrente
Digite o seu saldo bancário:
1500.00
********************************
Nome do cliente: João Silva
Tipo de conta: Conta Corrente
Saldo atual: R$1500.00
********************************

Operações

1 - Consultar saldos
2 - Receber valor
3 - Transferir valor
4 - Sair

Digite a opção desejada:
1
O seu saldo é de R$1500.00

Digite a opção desejada:
2
Digite o valor a ser recebido
500.00
O valor de R$500.00 foi recebido!

Digite a opção desejada:
3
Digite o valor que deseja transferir
200.00
O valor de 200.00 foi enviado

Digite a opção desejada:
4
O sistema foi encerrado
```
## Observações
- Certifique-se de fornecer entradas válidas para evitar exceções.
- O sistema não implementa persistência de dados; todos os dados são perdidos após o término do programa.
## Contribuições
Sinta-se à vontade para contribuir com melhorias, correções e novas funcionalidades. Faça um fork do repositório e envie um pull request com suas alterações.
