import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = scan.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = scan.nextInt();

        System.out.println("A soma dos números digitados é " + (numero1+numero2));
    }
}
