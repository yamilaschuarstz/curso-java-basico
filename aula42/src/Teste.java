public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //Pessoa aluno = new Aluno();
        //Pessoa professor = new Professor();

        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        //exemplo02
        System.out.println("Melhor gato de todos: " + Constantes.MELHOR_GATO);
        // Constantes.MELHOR_GATO = "Nico"; isso é impossível
        System.out.println("Melhor time de todos: " + Constantes.MELHOR_TIME);



    }
}