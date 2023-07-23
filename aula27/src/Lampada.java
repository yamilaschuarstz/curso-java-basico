public class Lampada {
    String cor;
    int potencia;
    String tipo;
    boolean ligada;

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }

    void mostrarEstado(){
        if (ligada){
            System.out.println("A lâmpada está ligada");
        } else {
            System.out.println("A lâmpada está desligada");
        }
    }

    void mudarEstado(){
        if (ligada){
            ligada = false;
        } else {
            ligada = true;
        }
    }
}
