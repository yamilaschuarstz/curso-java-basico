public class Teste {
    public static void main(String[] args) {
        PessoaJuridica juridica = new PessoaJuridica("ACME SA", 5000, "23423423");
        System.out.println(juridica.toString());

        PessoaFisica fisica = new PessoaFisica("João", 1200, "12345678900");
        System.out.println(fisica.toString());

        PessoaFisica fisica2 = new PessoaFisica("Maria", 2000, "12345678901");
        System.out.println(fisica2.toString());

        PessoaFisica fisica3 = new PessoaFisica("Marcos", 2500, "12345678903");
        System.out.println(fisica3.toString());

        PessoaFisica fisica4 = new PessoaFisica("Bianca", 3100, "12345678955");
        System.out.println(fisica4.toString());

        PessoaFisica fisica5 = new PessoaFisica("Lucas", 4000, "12345678906");
        System.out.println(fisica5.toString());


    }
}