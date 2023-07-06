import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = scan.next();

        if (letra.equalsIgnoreCase("m")){
            System.out.println("M - Masculino");
        } else if (letra.equalsIgnoreCase("f")) {
            System.out.println("F - Feminino");
        } else {
            System.out.println("Entrada inválida!");
        }
    }
}
