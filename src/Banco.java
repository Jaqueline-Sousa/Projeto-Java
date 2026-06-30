import heranca.Conta;
import heranca.contaCorrente;
import heranca.contaPoupanca;

public class Banco {
    public static void main(String[] args) {

        Conta cc = new contaCorrente(1001,9988770,  "Jaqueline", 50.00, true );

        Conta cp = new contaPoupanca(1001, 1122330,  "Jaqueline", 100.00, true );

        System.out.println("-------------------------------------------");
        System.out.println("Saldo conta corrente");
        System.out.printf("Saldo Inicial CC: %2f \n", cc.getSaldo());
        cc.depositar(950);
        cc.sacar(500);
        System.out.printf("Saldo Final CC: %.2f \n", cc.getSaldo());

        System.out.println("-------------------------------------------");
        System.out.println("Conta Poupança");
        System.out.printf("Saldo Inicial CP: %2f \n", cp.getSaldo() );
        cp.depositar(900);
        cp.sacar(500);
        System.out.printf("Saldo Final CP: %2f \n" , cp.getSaldo());


    }
}
