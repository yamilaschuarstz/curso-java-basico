public class Carro {
    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeCombustivel;
    double consumo;

    Carro(){
        System.out.println("Classe carro foi instanciada");
        numeroPassageiros = 4;
    }

    Carro(String marca_, String modelo_, int numeroPassageiros_, double capacidadeCombustivel_, double consumo_){
        marca = marca_;
        modelo = modelo_;
        numeroPassageiros = numeroPassageiros_;
        capacidadeCombustivel = capacidadeCombustivel_;
        consumo = consumo_;
    }

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é de: " + capacidadeCombustivel * consumo + " km");
    }
}
