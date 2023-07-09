import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int popA;
        int popB;
        double crescimentoA;
        double crescimentoB;
        do{
            System.out.println("Digite a população do primeiro país: ");
            popA = scanner.nextInt();
            if (popA <= 0){
                System.out.println("População não pode ser menor que 0. Digite novamente.");
            }
        } while (popA <= 0);

        do{
            System.out.println("Digite a taxa de crescimento do primeiro país: ");
            crescimentoA = scanner.nextDouble();
            if (crescimentoA <= 0){
                System.out.println("Taxa de crescimento não pode ser menor que 0. Digite novamente.");
            }
        } while (crescimentoA <= 0);

        do{
            System.out.println("Digite a população do primeiro país: ");
            popB = scanner.nextInt();
            if (popB <= 0){
                System.out.println("População não pode ser menor que 0. Digite novamente.");
            }
        } while (popB <= 0);

        do{
            System.out.println("Digite a taxa de crescimento do primeiro país: ");
            crescimentoB = scanner.nextDouble();
            if (crescimentoB <= 0){
                System.out.println("Taxa de crescimento não pode ser menor que 0. Digite novamente.");
            }
        } while (crescimentoB <= 0);

        int count = 0;
        while (popA <= popB){
            popA += (popA * crescimentoA) / 100;
            popB += (popB * crescimentoB) / 100;
            count++;
        }

        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("São necessários " + count + " anos para a população do país A ultrapassar a do país B." );
    }

}
