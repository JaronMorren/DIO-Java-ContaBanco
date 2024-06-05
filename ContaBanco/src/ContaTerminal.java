import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int Numero;
        String Agencia;
        String NomeCliente;
        Double Saldo;

        System.out.print("Por favor, digite o número da agência: ");
        Agencia = scanner.next();
        System.out.print("Por favor, digite o número da conta: ");
        Numero = scanner.nextInt();
        System.out.print("Por favor, digite o seu nome: ");
        NomeCliente = scanner.next();
        System.out.print("Por favor, digite o saldo da conta: ");
        Saldo = scanner.nextDouble();
        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");
        scanner.close();

    }
}
