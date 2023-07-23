public class Calculadora {
    public static int soma(int n1, int n2){
        return n1 + n2;
    }

    public double soma(double n1, double n2){
        return n1 + n2;
    }

    public int soma(int n1, int n2, int n3){
        return n1 + n2 +n3;
    }

    public int soma(int[] vetorInteiros){
        int soma = 0;
        for (int i = 0; i < vetorInteiros.length; i++){
            soma += vetorInteiros[i];
        }

        return soma;
    }
}
