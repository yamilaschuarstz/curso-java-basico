import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = scan.nextInt();

        if (n1 >= 0){
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }
}
