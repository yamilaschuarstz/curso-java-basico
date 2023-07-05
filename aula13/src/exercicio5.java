import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor em metros: ");
        double metros = scan.nextDouble();
        double convertido = metros * 100;
        System.out.printf("O valor em centímetros é %.0f" , convertido);
    }
}
