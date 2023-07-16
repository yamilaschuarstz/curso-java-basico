public class Exercicio04 {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca();
        livro.setTitulo("O Apanhador no Campo de Centeio");
        livro.setAutor("J. D. Salinger");
        livro.setAnoLancamento(1951);
        livro.setPaginas(256);
        livro.setEdicao(1);
        livro.setEditora("Todavia");
        livro.setCodigo("000001A");
        livro.setDisponivel(true);

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano lançamento: " + livro.getAnoLancamento());
        System.out.println("Número de páginas: " + livro.getPaginas());
        System.out.println("Edição: " + livro.getEdicao());
        System.out.println("Editora: " + livro.getEditora());
        System.out.println("Código: " + livro.getCodigo() );
        System.out.println("Disponível: " + livro.isDisponivel());
    }
}
