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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
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
