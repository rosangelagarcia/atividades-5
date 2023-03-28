public class Motocicleta extends Veiculo {
    private int cilindradas;

    public Motocicleta(String marca, String modelo, int anoFabricacao, String cor, int cilindradas) {
        super(marca, modelo, anoFabricacao, cor);
        this.cilindradas = cilindradas;
    }

    public void informacao() {
        super.informacao();
        System.out.println("Cilindradas: " + cilindradas);
    }
}