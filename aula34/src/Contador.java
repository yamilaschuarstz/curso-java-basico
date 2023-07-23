public class Contador {
    public static int contador;

    Contador(){
        contador++;
    }

    public static void incrementar(){
        contador++;
    }

    public static void zerar(){
        contador = 0;
    }

    public static int obterValor(){
        return contador;
    }
}
