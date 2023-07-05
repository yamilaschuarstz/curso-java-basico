import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double valorPorHora = scanner.nextDouble();

        System.out.println("Quantas horas trabalhadas no mês? ");
        int horas = scanner.nextInt();

        double salarioBruto = valorPorHora * horas;
        double descontoImposto = salarioBruto - salarioBruto * 0.88;
        double descontoInss = salarioBruto - salarioBruto * 0.92;
        double descontoSindicato = salarioBruto - salarioBruto * 0.95;
        double salarioLiquido = salarioBruto - descontoSindicato - descontoImposto - descontoInss;

        System.out.println("Salário bruto: R$" + salarioBruto);
        System.out.println("- IR (11%): R$" + descontoImposto);
        System.out.println("- INSS (8%): R$" + descontoInss);
        System.out.println("- Sindicato (5%): R$" + descontoSindicato);
        System.out.println("Salário líquido: R$" + salarioLiquido);

    }
}
