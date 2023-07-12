import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.println("Digite a linha " + i + " coluna " + j + ": ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int pares = 0;
        int impares = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
                if (matriz[i][j] % 2 == 0){
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println(" ");
        }

        System.out.println("Quantidade números pares: " + pares);
        System.out.println("Quantidade números ímpares: " + impares);
    }
}
