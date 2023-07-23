
public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("Renault", "Clio");
        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.numeroPassageiros);

        Carro carro1 = new Carro("Fiat", "Ducato", 10, 20, 0.2);

        System.out.println(carro1.marca);
        System.out.println(carro1.modelo);
        System.out.println(carro1.numeroPassageiros);
        System.out.println(carro1.capacidadeCombustivel);
        System.out.println(carro1.consumo);

    }
}
