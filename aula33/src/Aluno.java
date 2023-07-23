public class Aluno {
    private String matricula;
    private String nome;
    private String curso;
    private String [] disciplinas = new String[3];
    private double[][] notas = new double[3][2];

    Aluno(){

    }

    public Aluno(String matricula, String nome, String curso, String[] disciplinas, double[][] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.disciplinas = disciplinas;
        this.notas = notas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public void verificarNotas(){
        for (int i = 0; i < notas.length; i++){
            double soma = 0;
            double media = 0;
            for (int j = 0; j < notas[i].length; j++){
                soma += notas[i][j];
            }
            media = soma / notas[i].length;
            if (media >= 7){
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}
