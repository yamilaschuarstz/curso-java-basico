public class Carro {
    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeCombustivel;
    double consumo;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é de: " + capacidadeCombustivel * consumo + " km");
    }

    double obterAutonomia(){
        System.out.println("Método obter autonomia foi chamado");
        return capacidadeCombustivel * consumo;
    }
}
