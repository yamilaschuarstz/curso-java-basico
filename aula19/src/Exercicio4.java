import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[15];
        double[] b = new double[a.length];

        for (int i = 0; i < a.length; i++){
            System.out.println("Digite o " + (i+1) + "º número: ");
            a[i] = scan.nextInt();
            b[i] = Math.sqrt(a[i]);
        }

        for (int i = 0; i < a.length; i++){
            System.out.println("Vetor A: " + a[i]);
            System.out.printf("Vetor B: %.2f" , b[i]);
            System.out.println(" ");
        }
    }
}
