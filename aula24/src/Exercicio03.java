public class Exercicio03 {
    public static void main(String[] args) {
        LivroDeLivraria livro = new LivroDeLivraria();
        livro.setTitulo("O Apanhador no Campo de Centeio");
        livro.setAutor("J. D. Salinger");
        livro.setAnoLancamento(1951);
        livro.setPaginas(256);
        livro.setEdicao(1);
        livro.setEditora("Todavia");
        livro.setPreco(54.50);
        livro.setQtdeEstoque(5);

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano lançamento: " + livro.getAnoLancamento());
        System.out.println("Número de páginas: " + livro.getPaginas());
        System.out.println("Edição: " + livro.getEdicao());
        System.out.println("Editora: " + livro.getEditora());
        System.out.println("Preço: " + livro.getPreco());
        System.out.println("Quantidade de estoque: " + livro.getQtdeEstoque());
    }
}
