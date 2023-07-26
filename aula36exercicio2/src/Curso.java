public class Curso {
    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public double calculaMediaTurma(){
        double soma = 0;
        for (Aluno aluno : alunos){
            soma += aluno.calculaMedia();
        }

        double mediaTurma = soma / alunos.length;
        return mediaTurma;
    }

    public void obterInfo(){
        System.out.println("----INFORMAÇÕES CURSO-----");
        System.out.println("Nome do curso: " + this.getNome());
        System.out.println("Horário: " + this.getHorario());
        System.out.println("Professor: " + this.professor.getNome());
        System.out.println("Alunos: ");
        for (Aluno aluno : alunos){
            System.out.println(aluno.getNome());
        }
        System.out.printf("Média da turma: %.2f" , this.calculaMediaTurma());
        System.out.println(" ");
    }
}
