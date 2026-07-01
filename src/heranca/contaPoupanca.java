package heranca;

public class contaPoupanca extends Conta{

    public contaPoupanca(int agencia, int numeroConta, String titularConta, double saldo, boolean isAtiva) {
        super(agencia, numeroConta, titularConta, saldo, isAtiva);
    }


    @Override
    public void depositar(double valor) {
        double rendimento = ( getSaldo() + valor ) * 0.01;
                super.depositar(valor + rendimento);
    }

}
