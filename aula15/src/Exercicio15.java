import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o lado 1: ");
        int n1 = scan.nextInt();
        System.out.println("Informe o lado 2: ");
        int n2 = scan.nextInt();
        System.out.println("Informe o lado 3: ");
        int n3 = scan.nextInt();

        if ((n1 + n2) > n3 || (n1 + n3) > n2 || (n2 + n3) > n1){
            if (n1 == n2 && n2 == n3){
                System.out.println("Triângulo equilátero");
            } else if (n1 == n2 || n1 == n3 || n3 == n1){
                System.out.println("Triângulo isósceles");
            } else if (n1 != n2 && n2 != n3) {
                System.out.println("Triângulo escaleno");
            }
        } else{
            System.out.println("As medidas informadas não formam um triângulo!");
        }
    }
}
