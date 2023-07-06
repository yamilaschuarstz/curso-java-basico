import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = scan.nextInt();
        System.out.println("Digite o terceiro número: ");
        int n3 = scan.nextInt();

        if (n1 == n2 && n2 == n3){
            System.out.println("Os números são iguais");
        } else {
            if (n1 >= n2 && n1 >= n3){
                System.out.println("O maior número é " + n1);
            } else if (n2 >= n1 && n2 >= n3) {
                System.out.println("O maior número é " + n2);
            } else if (n3 >= n1 && n3 >= n2) {
                System.out.println("O maior número é " + n3);
            }
        }

    }
}
