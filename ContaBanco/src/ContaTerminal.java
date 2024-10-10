import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 25.00;
        System.out.println("Digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite sua conta: ");
        String conta = scanner.next();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();        
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        //impressão dos dados da conta
        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta +" e seu saldo " + saldo + " já está disponível para saque");

        
    }   
}