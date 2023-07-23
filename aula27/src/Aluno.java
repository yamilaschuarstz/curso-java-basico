public class Aluno {
    String nome;
    String matricula;
    String curso;
    String[] disciplinas = new String[3];
    double[][] notas = new double[3][2];

    public void verificarNotas(){
        for (int i = 0; i < notas.length; i++){
            double somaNotas = 0;
            System.out.print("Disciplina " + disciplinas[i] + ": ");

            for (int j = 0; j < notas[i].length; j++){
                somaNotas += notas[i][j];
            }

            if ((somaNotas / notas[i].length) >= 7){
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}
