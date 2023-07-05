import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tamanho do arquivo (MB): ");
        double arquivo = scan.nextDouble();

        System.out.println("Velocidade da internet (Mbps): ");
        double velocidade = scan.nextDouble();

        double tempo = arquivo / velocidade;
        System.out.println("Tempo de download: " + tempo);
    }
}
