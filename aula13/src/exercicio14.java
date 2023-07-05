import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidade pescada (kg): ");
        double peso = scan.nextDouble();

        double excesso = 0;
        double multa = 0;

        if (peso > 50){
            excesso = peso - 50;
            multa = excesso * 4;
        }

        System.out.printf("Você pesou %.2f kg a mais que o permitido! \n" , excesso);
        System.out.printf("Multa de R$ %.2f \n" , multa);
    }
}
