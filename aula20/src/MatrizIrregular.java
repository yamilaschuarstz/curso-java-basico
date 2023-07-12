import java.util.Scanner;

public class MatrizIrregular {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o número de pessoas entrevistadas: ");
        int entrevistados = scan.nextInt();

        String[][] filhos = new String[entrevistados][];

        for (int i = 0; i < filhos.length; i++){
            System.out.println("Quantidade de filhos: ");
            int qtdeFilhos = scan.nextInt();
            filhos[i] = new String[qtdeFilhos];
            for (int j = 0; j < filhos[i].length; j++){
                System.out.println("Digite o nome do filho " + (j+1) + ": ");
                filhos[i][j] = scan.next();
            }
        }

        for (int i = 0; i < filhos.length; i++){
            System.out.println("Pessoa " + i + " tem " + filhos[i].length + " filhos.");
            for (int j = 0; j < filhos[i].length; j++){
                System.out.println("Nome: " + filhos[i][j]);
            }
        }
    }
}
