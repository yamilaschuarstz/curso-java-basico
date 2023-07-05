import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a medida do quadrado: ");
        double medida = scan.nextDouble();
        double area = Math.pow(medida, 2);
        System.out.printf("A área do quadrado é %.2f \n" , area);
        System.out.printf("O dobro da área do quadrado é %.2f" , area*2);

    }
}
