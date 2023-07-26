public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas = new double[4];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {

        this.notas = notas;
    }

    public double calculaMedia(){
        double soma = 0;
        for (int i = 0; i < this.notas.length; i++){
            soma += notas[i];
        }

        double media = soma / notas.length;
        return media;
    }

    public String estaAprovado(){
        if (this.calculaMedia() >= 7){
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public void obterInfo(){
        System.out.println("---INFORMAÇÃO ALUNO----");
        System.out.println("Nome do Aluno: " + this.getNome());
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.print("Notas: ");
        for (double nota : this.getNotas()){
            System.out.print("[" + nota + "]" + " ");
        }
        System.out.println(" ");
        System.out.println("Média: " + this.calculaMedia());
        System.out.println("Status: " + this.estaAprovado());
        System.out.println(" ");
    }

}
