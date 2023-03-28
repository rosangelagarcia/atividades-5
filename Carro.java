public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo, int anoFabricacao, String cor, int numPortas) {
        super(marca, modelo, anoFabricacao, cor);
        this.numPortas = numPortas;
    }

    public void informacao() {
        super.informacao();
        System.out.println("Número de Portas: " + numPortas);
    }
}
