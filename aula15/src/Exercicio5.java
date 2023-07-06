import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.printf("A média do aluno é de %.2f" , media );
        System.out.println(" ");

        if (media == 10){
            System.out.println("Aprovado com distinção!");
        } else if (media >= 7 && media < 10){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado :(");
        }
    }
}
