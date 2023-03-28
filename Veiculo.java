public class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String cor;

    public Veiculo(String marca, String modelo, int anoFabricacao, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
    }

    public void informacao() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Cor: " + cor);
    }
}


