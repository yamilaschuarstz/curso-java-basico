import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scan.nextInt();
        System.out.println("Digite o limite: ");
        int limite = scan.nextInt();

        for (int i = num; i <= limite; i++){
            if (i % 7 == 0){
                System.out.println(i + " é o primeiro número divisível por 7");
                break;
            }
        }

        for (int i = num; i <= limite; i++){
            if (i % 7 == 0){
                continue;
            }

            System.out.println(i);
        }
    }
}
