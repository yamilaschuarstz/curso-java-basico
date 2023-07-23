public class Main {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroPassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumo = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("Autonomia do carro: " + autonomia + " km");

        double qtdeCombustivel = van.calcularCombustivel(10);
        System.out.println("Quantidade de combustível: " + qtdeCombustivel);

        double qtdeCombustivel2 = van.calcularCombustivel(15);
        System.out.println("Quantidade de combustível: " + qtdeCombustivel2);
    }
}