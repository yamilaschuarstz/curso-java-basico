import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura em graus celsius: ");
        double celsius = scan.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("São %.0f ºF" , fahrenheit);
    }
}
