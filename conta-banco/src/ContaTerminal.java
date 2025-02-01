import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite a agencia: ");
        agencia = sc.nextLine();

        System.out.println("Digite seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.println("Digite seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

        sc.close();
    }
}
