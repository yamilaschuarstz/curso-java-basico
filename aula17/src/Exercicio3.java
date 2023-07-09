import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = " ";
        int idade;
        double salario;
        char estadoCivil;
        String genero;

        while (nome.length() < 3){
            System.out.println("Digite seu nome: ");
            nome = scan.nextLine();
            if (nome.length() < 3){
                System.out.println("Nome inválido! Digite novamente.");
            }
        }

        do{
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();
            if (idade < 0 || idade > 150){
                System.out.println("Número inválido! Digite novamente.");
            }
        } while (idade < 0 || idade > 150);

        do{
            System.out.println("Digite seu salário: ");
            salario = scan.nextDouble();
            if (salario <= 0){
                System.out.println("Número inválido! Digite novamente.");
            }
        } while (salario <= 0);

        do{
            System.out.println("Digite seu gênero [M/F]: ");
            genero = scan.next();
            if (!genero.equalsIgnoreCase("f") && !genero.equalsIgnoreCase("m")){
                System.out.println("Informação inválida! Digite novamente");
            }
        } while (!genero.equalsIgnoreCase("f") && !genero.equalsIgnoreCase("m"));
        do{
            System.out.printf("S - Solteiro/a \n" +
                    "C - Casado/a \n" +
                    "V - Viúvo/a \n" +
                    "D - Divorciado/a\n"
                    +"Digite seu estado civil: \n");
            estadoCivil = scan.next().charAt(0);
            if (estadoCivil != 'S' && estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'v' && estadoCivil != 'd'&& estadoCivil != 'D'){
                System.out.println("Dado inválido! Digite novamente.");
            }
        } while (estadoCivil != 'S' && estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'v' && estadoCivil != 'd' && estadoCivil != 'D');

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$" + salario);
        System.out.println("Gênero: " + genero);
        System.out.println("Estado Civil: " + estadoCivil);
    }


}
