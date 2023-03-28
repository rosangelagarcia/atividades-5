public class Main {
    public static void main(String[] args) {
        
        Veiculo veiculo = new Veiculo("Ford", "Fiesta", 2020, "Vermelho");
        Carro carro = new Carro("Chevrolet", "Camaro", 2022, "Amarelo", 2);
        Motocicleta moto = new Motocicleta("Honda", "CG 150", 2021, "Preto", 150);

        veiculo.informacao();
        System.out.println("------------------------");
        carro.informacao();
        System.out.println("------------------------");
        moto.informacao();
    }
}







