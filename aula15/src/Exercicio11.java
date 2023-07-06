import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe seu salário: ");
        double salario = scan.nextDouble();

        int porcentagem = 0;
        double aumento = 0;
        double salarioFinal;
        if (salario <= 280){
            porcentagem = 20;
        } else if (salario > 280 && salario <= 700) {
            porcentagem = 15;
        } else if (salario > 700 && salario <= 1500) {
            porcentagem = 10;
        } else if (salario > 1500) {
            porcentagem = 5;
        }

        aumento = (salario * porcentagem) / 100;
        salarioFinal = salario + aumento;
        System.out.println("Seu salário era de R$" + salario);
        System.out.println("Seu salário aumentou " + porcentagem + "%");
        System.out.println("Você recebeu um aumento de R$" + aumento);
        System.out.println("Seu salário a partir de agora é de R$" + salarioFinal);
    }
}
