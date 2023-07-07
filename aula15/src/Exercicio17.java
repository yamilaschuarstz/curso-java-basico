import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um ano: ");
        int ano = scan.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0){
            if (ano % 100 != 0){
                System.out.println("O ano " + ano + " é bissexto");
            } else{
                System.out.println("O ano " + ano + " NÃO é bissexto");
            }
        } else{
            if (ano % 400 == 0){
                System.out.println("O ano " + ano + " é bissexto");
            } else {
                System.out.println("O ano " + ano + " NÃO é bissexto");
            }
        }
    }
}
