import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----CADASTRO DE CURSO-----");
        System.out.println("Digite o nome do curso: ");
        String nomeCurso = scanner.nextLine();

        System.out.println("Digite o horário do curso: ");
        String horario = scanner.nextLine();

        Curso curso = new Curso();
        curso.setNome(nomeCurso);
        curso.setHorario(horario);

        System.out.println("----CADASTRO DO PROFESSOR----");
        System.out.println("Digite o nome do professor: ");
        String nomeProfessor = scanner.nextLine();
        System.out.println("Digite o departamento do professor: ");
        String departamento = scanner.nextLine();
        System.out.println("Digite o e-mail do professor: ");
        String emailProfessor = scanner.nextLine();

        Professor professor = new Professor();
        professor.setNome(nomeProfessor);
        professor.setDepartamento(departamento);
        professor.setEmail(emailProfessor);
        curso.setProfessor(professor);

        Aluno [] alunos = new Aluno[3];

        System.out.println("----CADASTRO DE ALUNOS----");
        for (int i = 0; i < alunos.length; i++){
            Aluno a = new Aluno();
            System.out.println("Digite o nome do aluno " + (i+1) + ": ");
            String nomeAluno = scanner.nextLine();
            a.setNome(nomeAluno);
            System.out.println("Digite a matrícula do aluno " + (i+1) + ": ");
            String matricula = scanner.nextLine();
            a.setMatricula(matricula);
            double[] notas = new double[4];
            double nota = -1;
            for (int j = 0; j < notas.length; j++){
                do {
                    System.out.println("Digite a nota " + (j+1) + ": ");
                    nota = scanner.nextDouble();
                    notas[j] = nota;
                    if (nota < 0 || nota > 10){
                        System.out.println("Nota inválida! Digite novamente.");
                    }
                } while (nota < 0 || nota > 10);
            }
            scanner.nextLine();
            a.setNotas(notas);
            alunos[i] = a;

        }

        curso.setAlunos(alunos);

        System.out.println(" ");
        professor.obterInfo();
        System.out.println(" ");

        curso.obterInfo();
        System.out.println(" ");

        for (Aluno aluno : curso.getAlunos()){
            aluno.obterInfo();
        }


    }
}
