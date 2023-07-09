import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota;
        do{
            System.out.println("Digite a nota (0-10): ");
            nota = scan.nextDouble();

            if (nota > 10 || nota < 0){
                System.out.println("Nota inválida! Digite novamente.");
            }
        } while (nota > 10 || nota < 0);
    }
}
