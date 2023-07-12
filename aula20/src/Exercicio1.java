import java.util.Random;

public class Exercicio1 {
    public static void main(String[] args) {
        int[][] numeros = new int[4][4];
        Random numeroRandom = new Random();

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++){
                numeros[i][j] = numeroRandom.nextInt(100);
            }
        }

        int maior = 0;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                if (numeros[i][j] > maior){
                    maior = numeros[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Linha do maior valor: " + linha);
        System.out.println("Coluna do maior valor: " + coluna);
    }
}
