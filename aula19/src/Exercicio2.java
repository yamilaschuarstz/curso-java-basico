import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[8];
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++){
            System.out.println("Digite o " + (i+1) + "º número: ");
            a[i] = scan.nextInt();
            b[i] = a[i] * 2;
        }

        for (int i = 0; i < a.length; i++){
            System.out.println("Vetor A: " + a[i]);
            System.out.println("Vetor B: " + b[i]);
        }
    }
}
