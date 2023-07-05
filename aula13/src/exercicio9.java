import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a temperatura em Farenheit: ");
        double farenheit = scan.nextDouble();
        double celsius = (5 * (farenheit - 32) / 9);

        System.out.printf("São %.1f ºC" , celsius);
    }
}
