import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = scan.nextInt();

        System.out.println("Digite o símbolo da operação (+ - * /): ");
        String operacao = scan.next();

        double resultado = 0;
        boolean valida = true;
        switch (operacao) {
            case "+":
                resultado = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + resultado);
                break;
            case "-":
                resultado = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + resultado);
                break;
            case "*":
                resultado = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + resultado);
                break;
            case "/":
                resultado = n1 / n2;
                System.out.println(n1 + " / " + n2 + " = " + resultado);
                break;
            default:
                System.out.println("Operação inválida"); valida = false; break;
        }

        if (valida){
            if (resultado >= 0){
                System.out.println("Número positivo");
            } else {
                System.out.println("Número negativo");
            }

            if (resultado % 2 == 0){
                System.out.println("Número par");
            } else {
                System.out.println("Número ímpar");
            }
        }

    }

}
