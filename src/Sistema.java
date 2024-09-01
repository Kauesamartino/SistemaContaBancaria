import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite o tipo da sua conta");
        String tipoConta = scanner.nextLine();
        System.out.println("Digite o seu saldo bancário:");
        double saldo = scanner.nextDouble();
        boolean exibirMenu = true;
        int operacoes;

        System.out.printf("""
                ********************************
                Nome do cliente: %s
                Tipo de conta: %s
                Saldo atual: R$%.2f
                ********************************
                %n""",nome,tipoConta,saldo);

        while (exibirMenu) {
            System.out.println("""
                    Operações\n
                    1 - Consultar saldos
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    """);

            System.out.println("Digite a opção desejada:");

            switch (operacoes = scanner.nextInt()) {
                case 1:
                    System.out.printf("O seu saldo é de R$%.2f%n", saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser recebido");
                    double valorRecebido = scanner.nextDouble();
                    saldo = saldo + valorRecebido;
                    System.out.printf("O valor de R$%.2f foi recebido!%n", valorRecebido);
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja transferir");
                    double valorTransferencia = scanner.nextDouble();

                    if (valorTransferencia <= saldo) {
                        saldo = saldo - valorTransferencia;
                        System.out.printf("O valor de %.2f foi enviado%n",valorTransferencia);
                    } else {
                        System.out.println("Esse valor não pode ser enviado");
                    }
                    break;
                case 4:
                    System.out.println("O sistema foi encerrado");
                    exibirMenu = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println("");
        }
    }
}
