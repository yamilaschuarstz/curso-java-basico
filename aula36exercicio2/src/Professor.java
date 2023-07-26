public class Professor {
    private String nome;
    private String departamento;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void obterInfo(){
        System.out.println("----INFORMAÇÕES PROFESSOR----");
        System.out.println("Nome do Professor: " + this.getNome());
        System.out.println("Departamento: " + this.getDepartamento());
        System.out.println("E-mail: " + this.getEmail());
    }

}
