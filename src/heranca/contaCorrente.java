package heranca;

public class contaCorrente extends Conta {
    public contaCorrente(int agencia, int numeroConta, String titularConta, double saldo, boolean isAtiva) {
        super(agencia, numeroConta,titularConta, saldo, isAtiva);


    }
    @Override
    public void sacar(double valor) {
        double taxaSaque = valor * 0.0005;
                super.sacar( valor+taxaSaque);
    }

}
