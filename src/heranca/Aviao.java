package heranca;

public class Aviao extends transporte{


    public Aviao(String nome, String marca, String modelo, int anoFabricacao, double preco, boolean isLigado) {
        super(nome, marca, modelo, anoFabricacao, preco, isLigado);
    }

    public class Motocicleta extends  transporte{

        private final int LIMITE_VELOCIDADE = 460;

        public Motocicleta(String nome, String marca, String modelo, int anoFabricacao, double preco, boolean isLigado) {
            super(nome, marca, modelo, anoFabricacao, preco, isLigado);
        }

        @Override
        public void acelerar(){
            System.out.printf("A velocidade máxima de um Avião é {} km por hora.", LIMITE_VELOCIDADE);
            super.acelerar();

            public void colocarCapacete(){
                System.out.println("Voando...");
            }
        }

    }


}
