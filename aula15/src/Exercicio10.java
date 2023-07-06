import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Em que turno você estuda? [M/T/N]");
        String turno = scan.next();
        String turno1 = turno.toUpperCase();

        switch (turno1){
            case "M":
                System.out.println("Bom dia!"); break;
            case "T":
                System.out.println("Boa tarde!"); break;
            case "N":
                System.out.println("Boa noite!"); break;
            default:
                System.out.println("Resposta inválida!"); break;
        }
    }
}
