import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Bem-vindo ao Banco DIO JAVA! Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite seu saldo inicial: ");
        double saldo = scanner.nextDouble();



        System.out.println("Olá " + nomeCliente + ", obrigado por criar um conta em nosso banco, sua agência é " + agencia+ ", conta "+ conta
        + " e seu saldo de R$"+ saldo+ " já está disponível para saque!");



    }
}