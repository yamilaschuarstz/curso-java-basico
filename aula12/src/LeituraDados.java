import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String nome = scan.next();
        System.out.println("Seu primeiro nome é: " + nome);

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);

        System.out.println("Digite a sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("A sua altura é: " + altura);*/

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem um bicho de estimação: ");
        String primeiroNome = scan.next();
        int idade1 = scan.nextInt();
        byte qtdeFilhos = scan.nextByte();
        float altura1 = scan.nextFloat();
        boolean pet = scan.nextBoolean();

        System.out.println("Você digitou os seguintes dados: ");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Idade: " + idade1);
        System.out.println("Quantidadae de filhos: " + qtdeFilhos);
        System.out.println("Altura: " + altura1);
        System.out.println("Bicho de estimação: " + pet);
    }
}
