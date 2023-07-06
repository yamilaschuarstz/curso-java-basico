import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você não é maior de idade.");
        }
    }
}