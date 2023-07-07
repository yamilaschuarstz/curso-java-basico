import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidade (kg) de morangos: ");
        double kgMorango = scan.nextDouble();

        System.out.println("Quantidade (kg) de maçãs: ");
        double kgMaca = scan.nextDouble();

        double precoMorango = 0;
        double precoMaca = 0;

        if (kgMorango <= 5){
            precoMorango = 2.50;
        } else {
            precoMorango = 2.20;
        }

        if (kgMaca <= 5){
            precoMaca = 1.80;
        } else {
            precoMaca = 1.50;
        }

        double totalMorango = precoMorango * kgMorango;
        double totalMacas = precoMaca * kgMaca;
        double valorTotal = precoMorango + precoMaca;
        double qtdeTotal = kgMorango + kgMaca;

        if (valorTotal > 25 || qtdeTotal > 8){
            valorTotal = valorTotal - (valorTotal * 10) / 100;
        }

        System.out.println("Valor total da compra: R$" + valorTotal);
    }
}
