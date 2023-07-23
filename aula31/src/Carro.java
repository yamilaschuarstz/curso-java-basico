public class Carro {
    private String marca;
    private String modelo;
    private int numeroPassageiros;
    private double capacidadeCombustivel;
    private double consumo;


    public Carro(String marca, String modelo, int numeroPassageiros, double capacidadeCombustivel, double consumo){
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.consumo = consumo;
    }

    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        numeroPassageiros = 5;
        System.out.println("Chamando construtor com dois parâmetros");
    }
    public Carro(){

    }
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é de: " + capacidadeCombustivel * consumo + " km");
    }

    private double divideKmPorConsumo(double km){
        return km/this.consumo;
    }

    public double calcularCombustivel(double km){
        return this.divideKmPorConsumo(km);
    }
}
