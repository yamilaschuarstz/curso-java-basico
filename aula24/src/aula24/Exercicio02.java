package aula24;

public class Exercicio02 {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("O Apanhador no Campo de Centeio");
        livro.setAutor("J. D. Salinger");
        livro.setAnoLancamento(1951);
        livro.setPaginas(256);
        livro.setEdicao(1);
        livro.setEditora("Todavia");

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano lançamento: " + livro.getAnoLancamento());
        System.out.println("Número de páginas: " + livro.getPaginas());
        System.out.println("Edição: " + livro.getEdicao());
        System.out.println("Editora: " + livro.getEditora());
    }
}
