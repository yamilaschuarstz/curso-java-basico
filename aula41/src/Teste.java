public class Teste {
    public static void main(String[] args) {
        //Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        //pessoa.setEndereco("Rua de Baixo, 111");
        aluno.setEndereco("Rua de Cima, 122");
        professor.setEndereco("Rua do Meio, 333");

        //System.out.println(aluno.obterEtiquetaEndereco());
        //System.out.println(professor.obterEtiquetaEndereco());

        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();
    }
}