import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual tipo de combustível? [A/G]");
        String c = scan.next();
        String combustivel = c.toUpperCase();
        System.out.println("Quantos litros?");
        double litros = scan.nextDouble();

        double litroAlcool = 1.90;
        double litroGasolina = 2.50;
        double valorTotal = 0;
        int desconto = 0;

        switch (combustivel){
            case "A":
                if (litros <= 20){
                    desconto = 3;
                } else {
                    desconto = 5;
                }
                valorTotal = litros * litroAlcool;
                break;
            case "G":
                if (litros <= 20){
                    desconto = 4;
                } else {
                    desconto = 6;
                }
                valorTotal = litros * litroGasolina;
        }
        valorTotal = valorTotal - (valorTotal * desconto) / 100;
        System.out.println("Valor a ser pago: R$" + valorTotal);
    }
}
