public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        //van.numeroPassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumo = 0.2;

        System.out.println(van.numeroPassageiros);

        Carro fusca = new Carro("Volkswagen", "Fusca", 4, 50, 0.5);
        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
        System.out.println(fusca.numeroPassageiros);
        System.out.println(fusca.capacidadeCombustivel);
        System.out.println(fusca.consumo);
    }
}
