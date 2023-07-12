import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
        int[] notas = new int[10];
        Random random = new Random();

        for (int i = 0; i < notas.length; i++){
            notas[i] = random.nextInt(10);
        }

        System.out.println("Usando o for: ");
        for (int i = 0; i < notas.length; i++){
            System.out.print(notas[i] + " ");
        }

        System.out.println(" ");
        System.out.println("Usando o for each: ");
        for (int nota : notas){
            System.out.print(nota + " ");
        }
        System.out.println(" ");
        System.out.println("Exemplo com matrizes: ");
        int[][] notasAlunos = new int[4][4];

        for (int i = 0; i < notasAlunos.length; i++){
            for (int j = 0; j < notasAlunos[i].length; j++){
                notasAlunos[i][j] = random.nextInt(10);
            }
        }

        for (int[] notasAluno : notasAlunos){
            for (int nota : notasAluno){
                System.out.print(nota + " ");
            }
            System.out.println(" ");
        }
    }
}
