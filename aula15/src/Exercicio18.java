import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int n = scan.nextInt();

        if (n % 2 == 0){
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }
    }
}
