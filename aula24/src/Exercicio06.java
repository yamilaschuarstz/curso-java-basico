public class Exercicio06 {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Erling Haaland");
        contato.setEmail("erlinghaaland09@gmail.com");
        contato.setEndereco("Av. Centroavante, 09, Manchester");
        contato.numero = new String[3];
        contato.numero[0] = "0000000";
        contato.numero[1] = "99999999";

        System.out.println("Nome: " + contato.getNome());
        System.out.println("E-mail: " + contato.getEmail());
        System.out.println("Endereço: " + contato.getEndereco());
        System.out.println("Número: " + contato.numero[0]);


    }
}
