import java.util.Random;

public class Exercicio2 {
    public static void main(String[] args) {
        int[][] numeros = new int[10][10];
        Random aleatorio = new Random();

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                numeros[i][j] = aleatorio.nextInt(10);
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println(" ");
        }

        int maiorLinha5 = 0;
        int menorLinha5 = 0;

        for (int i = 0; i < numeros[5].length; i++){
            if (numeros[5][i] > maiorLinha5){
                maiorLinha5 = numeros[5][i];
            }

            if (numeros[5][i] < menorLinha5){
                menorLinha5 = numeros[5][i];
            }
        };

        int maiorColuna7 = 0;
        int menorColuna7 = 101;

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i][7] > maiorColuna7){
                maiorColuna7 = numeros[i][7];
            }

            if (numeros[i][7] < menorColuna7){
                menorColuna7 = numeros[i][7];
            }
        }

        System.out.println("Maior valor linha 5: " + maiorLinha5);
        System.out.println("Menor valor linha 5: " + menorLinha5);
        System.out.println("Maior valor coluna 7: " + maiorColuna7);
        System.out.println("Menor valor coluna 7: " + menorColuna7);

    }
}
