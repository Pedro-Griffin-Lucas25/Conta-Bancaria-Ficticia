import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int saldoInicial = 2000;
        int opção = 0;

        System.out.println("\n¨¨+*+-*+-&+*+-*+&+*+¨¨");
        System.out.println("Olá! Bem vindo ao Banco Virtual Ficcionário!");
        System.out.println("¨¨+*+-*+-&+*+-*+&+*+¨¨");
        System.out.println("\n Por favor, Digite o seu nome.");
        String nome = scanner.nextLine();

        System.out.println("\n++++++++++++++++++++++++++++++++++++");
        System.out.println("DADOS INICIAIS DO CLIENTE");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("\nnome: " + nome);
        System.out.println("Saldo atual: " + saldoInicial);
        System.out.println("Tipo de conta: Corrente");
        System.out.println("\n++++++++++++++++++++++++++++++++++++");

        String menu = """
                \nOlá! :), Você deseja?
                (1). Realizar uma transferencia para sua conta
                (2). Realizar um saque de sua conta
                (3). Consultar dados
                (4). sair"
                """;


        while (opção != 4) {
            System.out.println(menu);
            opção = scanner.nextInt();

            if (opção == 1) {
                System.out.println("Qual valor deseja tranferir para sua conta?");
                double valorTransferido = scanner.nextDouble();
                System.out.println("Aguarde um momento...");
                System.out.println("bip..");
                System.out.println("bip...");
                System.out.println("bip..");
                System.out.println("bip...");
                System.out.println("bazinga!");
                System.out.println("Transferencia realizada com sucesso!");

                saldoInicial += valorTransferido;
                System.out.println("Saldo atual: " + saldoInicial);

            }
            else if (opção == 2) {
                System.out.println("Digite o valor desejado para saque");
                double saque = scanner.nextDouble();

                if (saldoInicial < saque){
                    System.out.println("Desculpa patrão, num dá, você não tem saldo suficiente!");
                } else {
                    saldoInicial -= saque;
                    System.out.println("Dinheiro resgatado com sucesso!");
                    System.out.println("Novo saldo: " + saldoInicial);
                }

            }
            if (opção == 3) {
                System.out.println("++++++++++++++++++++++++++++++++++++");
                System.out.println("\nnome: " + nome);
                System.out.println("Saldo atual: " + saldoInicial);
                System.out.println("Tipo de conta: Corrente");
                System.out.println("\n++++++++++++++++++++++++++++++++++++");
            }
        }










    }
}
