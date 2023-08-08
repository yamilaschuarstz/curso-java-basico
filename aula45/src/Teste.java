public class Teste {
    public static void main(String[] args) {

        /*Aluno aluno = new Aluno();
        Pessoa pessoa = aluno; //Upcasting

        Pessoa aluno2 = new Aluno(); //upcasting
        Pessoa aluno3 = (Pessoa) new Aluno(); //upcasting

        Pessoa aluno4 = new Pessoa();
        Aluno aluno5 = (Aluno) aluno4; //downcasting*/

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        if (pessoa instanceof Pessoa){
            System.out.println("Tipo Pessoa");
        }

        if (aluno instanceof Aluno){
            System.out.println("Tipo Aluno");
        }

        if (professor instanceof Professor){
            System.out.println("Tipo Professor");
        }
    }
}