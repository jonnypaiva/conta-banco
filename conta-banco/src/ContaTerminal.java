import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    String agencia = "067-8";
    int conta = 1021;

    System.out.println("Seja bem Vindo ao Banco Bradesco!");
    System.out.println("Vamos abrir a sua conta");
    System.out.println("Para iniciarmos, me informe o seu NOME: ");
        String nome = scanner.next();
    System.out.println("Olá " + nome + ", me informa agora, seu SOBRENOME: ");
        String sobrenome = scanner.next();
    System.out.println("Obrigado por informar!");
    System.out.println("Vamos agora, realizar o seu primeiro depósito.");
    System.out.println("Informe a quantia a ser depositada:");
        double saldo = scanner.nextDouble();
    System.out.println("Estou processando seu depósito.");
    System.out.println("Tudo certo!!");


    System.out.println("Olá, " + nome + " " + sobrenome + ", Obrigado por criar uma conta em nosso banco.");
    System.out.println("Sua Agência é: " + agencia + ", sua conta é: " + conta + ", e seu saldo de " + saldo + " já está disponível para saque.");

    }
}
