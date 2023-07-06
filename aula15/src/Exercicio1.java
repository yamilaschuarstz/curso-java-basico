import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = scan.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = scan.nextInt();

        if (n1 > n2){
            System.out.println(n1 + " é maior que " + n2);
        } else if (n2 > n1) {
            System.out.println(n2 + " é maior que " + n1);
        } else {
            System.out.println(n1 + " e " + n2 + " são iguais");
        }
    }
}
