import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Telefonou pra vítima? [S/N]");
        String resp1 = scan.next();

        System.out.println("2 - Esteve no local do crime? [S/N]");
        String resp2 = scan.next();

        System.out.println("3 - Mora perto da vítima? [S/N]");
        String resp3 = scan.next();

        System.out.println("4 - Devia pra vítima? [S/N]");
        String resp4 = scan.next();

        System.out.println("5 - Já trabalhou com a vítima? [S/N]");
        String resp5 = scan.next();

        int cont = 0;
        if (resp1.equalsIgnoreCase("s")){
            cont++;
        }

        if (resp2.equalsIgnoreCase("s")){
            cont++;
        }

        if(resp3.equalsIgnoreCase("s")){
            cont++;
        }

        if(resp4.equalsIgnoreCase("s")){
            cont++;
        }

        if(resp5.equalsIgnoreCase("s")){
            cont++;
        }

        if(cont == 2){
            System.out.println("Suspeito");
        } else if (cont == 3 || cont == 4) {
            System.out.println("Cúmplice");
        } else if (cont == 5) {
            System.out.println("Assassino!");
        } else {
            System.out.println("Inocente");
        }
    }
}
