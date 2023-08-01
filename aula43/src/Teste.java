public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setCurso("Análise e Desenvolvimento de sistemas");
        double[] notas = {7.7, 8.5, 9.0};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "aaaaa";
        String s2 = "aaaaA";

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equals(s2));

        Aluno aluno2 = new Aluno();
        aluno2.setCurso("Análise e Desenvolvimento de sistemas");
        double[] notas2 = {7.7, 8.5, 9.1};
        aluno2.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));



    }
}