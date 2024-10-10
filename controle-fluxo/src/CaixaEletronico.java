public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.00;
        double valorSolicitado = 28.00;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("novo saldo: " + saldo);
        }

        else {

            System.out.println("Saldo insuficiente. Seu saldo atual é: " + saldo);
        }

    }
}
