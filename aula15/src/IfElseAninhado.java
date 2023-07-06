import java.util.Scanner;

public class IfElseAninhado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double preco = scan.nextDouble();

        if (preco <= 10){
            System.out.println("Está barato, pode comprar!");
        } else if (preco > 10 && preco < 15) {
            System.out.println("Você pode pedir desconto!");
        } else if (preco >= 15 && preco < 17){
            System.out.println("Você precisa pesquisar mais!");
        } else {
            System.out.println("Produto muito caro!");
        }
    }
}
