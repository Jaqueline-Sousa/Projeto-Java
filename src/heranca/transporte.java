package heranca;

public class transporte {

    private String nome;
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double preco;
    private boolean isLigado;



    public transporte(String nome, String marca, String modelo, int anoFabricacao, double preco, boolean isLigado) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
        this.isLigado = isLigado;

}

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }



    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

