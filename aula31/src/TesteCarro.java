
public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("Renault", "Clio", 5, 30, 0.5);
        System.out.println(carro.calcularCombustivel(20));
    }
}
