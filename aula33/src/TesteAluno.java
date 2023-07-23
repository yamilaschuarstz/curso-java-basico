public class TesteAluno {
    public static void main(String[] args) {
        String[] disciplinas = new String[3];
        disciplinas[0] = "Algoritmos";
        disciplinas[1] = "Orientação a objetos";
        disciplinas[2] = "Sistemas operacionais";

        double[][] notas = new double[3][2];
        notas[0][0] = 9.0;
        notas[0][1] = 8.5;
        notas[1][0] = 7;
        notas[1][1] = 7;
        notas[2][0] = 5.4;
        notas[2][1] = 6;

        Aluno aluno = new Aluno("0001", "Billie", "Computação", disciplinas, notas);
        aluno.verificarNotas();

    }
}
