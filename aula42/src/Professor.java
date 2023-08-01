public class Professor{
    private double salario;
    private String curso;

    Professor(){

    }

    public Professor(String nome, String endereco, String telefone, String cpf, double salario, String curso) {
        //super(nome, endereco, telefone, cpf);
        this.salario = salario;
        this.curso = curso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double calcularSalarioLiquido(){
        return 0;
    }

    public String obterEtiquetaEndereco(){
        //String s = "Endereço do professor: " + this.getEndereco();
        //return s;
    }

    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }
}
