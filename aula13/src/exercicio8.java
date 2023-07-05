import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? R$ ");
        double valorPorHora = scan.nextDouble();
        System.out.println("Quantas horas você trabalha por mês: ");
        int horas = scan.nextInt();
        double salario = valorPorHora * horas;

        System.out.printf("Seu salário é de R$ %.2f" , salario);
    }
}
