import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("Sexo [M/F]: ");
        char sexo = scan.next().charAt(0);

        System.out.println("Seu peso: ");
        double peso = scan.nextDouble();

        if (sexo == 'F' || sexo == 'f'){
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é %.2f kg \n" , pesoIdeal);
            if (pesoIdeal == peso){
                System.out.println("Você está no peso ideal!");
            } else if (pesoIdeal > peso){
                System.out.println("Você está abaixo do peso!");
            } else if (pesoIdeal < peso){
                System.out.println("Você está acima do peso!");
            }
        }

        if (sexo == 'M' || sexo == 'm'){
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é %.2f kg \n" , pesoIdeal);
            if (pesoIdeal == peso){
                System.out.println("Você está no peso ideal!");
            } else if (pesoIdeal > peso){
                System.out.println("Você está abaixo do peso!");
            } else if (pesoIdeal < peso){
                System.out.println("Você está acima do peso!");
            }
        }
    }
}
