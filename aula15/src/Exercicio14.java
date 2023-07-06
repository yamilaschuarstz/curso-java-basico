import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nota 1: ");
        double nota1 = scan.nextDouble();
        System.out.println("Nota 2: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;
        String conceito;
        String aprovado = null;

        if (media >= 9 && media <= 10){
            conceito = "A";
        } else if (media >= 7.5 && media < 9) {
            conceito = "B";
        } else if (media >= 6 && media < 7.5) {
            conceito = "C";
        } else if (media >= 4 && media < 6) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        switch (conceito){
            case "A":
            case "B":
            case "C":
                aprovado = "Aprovado"; break;
            case "D":
            case "E":
                aprovado = "Reprovado"; break;
        }

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Status: " + aprovado);
    }
}
