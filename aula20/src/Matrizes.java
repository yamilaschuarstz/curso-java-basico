public class Matrizes {
    public static void main(String[] args) {
        double[] [] notasAlunos = new double[2][4];

        notasAlunos[0][0] = 9.5;
        notasAlunos[0][1] = 7.8;
        notasAlunos[0][2] = 10;
        notasAlunos[0][3] = 9.2;

        notasAlunos[1][0] = 8.7;
        notasAlunos[1][1] = 9.1;
        notasAlunos[1][2] = 7.6;
        notasAlunos[1][3] = 8;

        for (int i = 0; i < notasAlunos.length; i++){
            for (int j = 0; j < notasAlunos[i].length; j++){
                System.out.print(notasAlunos[i][j] + " ");
            }
            System.out.println();
        }

        notasAlunos[1][3] = 8.3;

        for (int i = 0; i < notasAlunos.length; i++){
            for (int j = 0; j < notasAlunos[i].length; j++){
                System.out.print(notasAlunos[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Calculando a média de cada aluno: ");
        double soma;

        for (int i = 0; i < notasAlunos.length; i++){
            soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++){
                soma += notasAlunos[i][j];
            }
            System.out.println("Média do aluno " + i + ": " + soma/4);
        }
    }
}
