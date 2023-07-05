import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int n2 = scanner.nextInt();

        System.out.println("Digite um número real: ");
        double n3 = scanner.nextDouble();

        int a = (n1*2)  * (n2/2);
        System.out.println("O produto do dobro do primeiro com metade do segundo: " + a);

        double b = (n1 * 3) + n3;
        System.out.printf("A soma do triplo do primeiro com o terceiro: %.2f \n" , b);

        double c = Math.pow(n3, 3);
        System.out.printf("O terceiro elevado ao cubo: %.2f \n" , c);
    }
}
