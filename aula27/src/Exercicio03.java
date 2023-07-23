import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Informe o nome do aluno: ");
        aluno.nome = scan.nextLine();

        System.out.println("Informe a matrícula do aluno: ");
        aluno.matricula = scan.nextLine();

        System.out.println("Informe o curso do aluno: ");
        aluno.curso = scan.nextLine();

        aluno.disciplinas = new String[3];
        for (int i = 0; i < aluno.disciplinas.length; i++){
            System.out.println("Informe a " + (i+1) + "ª disciplina do aluno: ");
            aluno.disciplinas[i] = scan.nextLine();
        };


        for (int i = 0; i < aluno.notas.length; i++) {
            System.out.println("Notas da disciplina " + aluno.disciplinas[i] + ":");
            for (int j = 0; j < aluno.notas[i].length; j++){
                System.out.println("Nota " + (j + 1) + ": ");
                aluno.notas[i][j] = scan.nextDouble();
            }
        };

        System.out.println("Nome: " + aluno.nome);
        System.out.println("Matrícula: " + aluno.matricula);
        System.out.println("Notas: ");
        for (int i = 0; i < aluno.notas.length; i++){
            System.out.print("Disciplina " + aluno.disciplinas[i] + ": ");
            for (int j = 0; j < aluno.notas[i].length; j++){
                System.out.print(aluno.notas[i][j] + " ");
            }
            System.out.println();
        };

        System.out.println("Status: ");
        aluno.verificarNotas();

    }
}
