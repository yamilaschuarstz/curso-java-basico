import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o raio do círculo: ");
        double raio = scan.nextDouble();
        double areaCirculo = 3.14 * (Math.pow(raio, 2));
        System.out.printf("A área do círculo é %.2f " , areaCirculo);
    }
}
