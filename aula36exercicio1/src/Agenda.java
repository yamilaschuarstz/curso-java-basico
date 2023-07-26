public class Agenda {
    private String nome;
    private Contato[] contatos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public void exibirContatos(){
        System.out.println("Contatos - " + this.getNome());
        int cont = 1;
        for (Contato contato : this.getContatos()){
            System.out.println("Contato " + cont);
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getTelefone());
            System.out.println("E-mail: " + contato.getEmail());
            System.out.println("------------------------");
            cont++;
        }
    }

}
