import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o preço do primeiro produto: ");
        double preco1 = scan.nextDouble();
        System.out.println("Digite o preço do segundo produto: ");
        double preco2 = scan.nextDouble();
        System.out.println("Digite o preço do terceiro produto: ");
        double preco3 = scan.nextDouble();

        if (preco1 == preco2 && preco2 == preco3) {
            System.out.println("Todos possuem o mesmo valor");
        } else{
            if (preco1 <= preco2 && preco1 <= preco3){
                System.out.printf("%.2f é o mais barato, compre o primeiro produto" , preco1);
                System.out.println(" ");
            } else if (preco2 <= preco1 && preco2 <= preco3) {
                System.out.printf("%.2f é o mais barato, compre o segundo produto" , preco2);
                System.out.println(" ");
            } else if (preco3 <= preco1 && preco3 <= preco2) {
                System.out.printf("%.2f é o mais barato, compre o terceiro produto" , preco3);
                System.out.println(" ");
            }
        }

    }
}
