import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor da hora trabalhada: ");
        double valorHora = scan.nextDouble();
        System.out.println("Horas trabalhadas no mês: ");
        int horasTrabalhadas = scan.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;
        double descontoSindicato = (salarioBruto * 3) / 100;
        double fgts = (salarioBruto * 11) / 100;
        int porcentagemIR = 0;

        if (salarioBruto <= 900){
             porcentagemIR = 0;
         } else if (salarioBruto > 900 && salarioBruto <= 1500){
             porcentagemIR = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500){
             porcentagemIR = 10;
        } else {
             porcentagemIR = 20;
        }

        double descontoIR = (salarioBruto * porcentagemIR) / 100;
        double totalDescontos = descontoIR + descontoSindicato;
        double salarioLiquido = salarioBruto - totalDescontos;
        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("(-) IR (" + porcentagemIR + "%): R$" + descontoIR);
        System.out.println("(-) Sindicato (3%): R$" + descontoSindicato);
        System.out.println("FGTS (11%): R$" + fgts);
        System.out.println("Total de descontos: R$" + totalDescontos);
        System.out.println("Salário líquido: R$" + salarioLiquido);

    }
}
