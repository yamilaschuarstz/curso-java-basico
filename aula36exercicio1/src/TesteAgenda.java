import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da agenda: ");
        String nomeAgenda = scanner.nextLine();

        Agenda agenda = new Agenda();
        agenda.setNome(nomeAgenda);
        Contato[] contatos = new Contato[3];

        for (int i = 0; i < contatos.length; i++){
            Contato c = new Contato();
            System.out.println("Digite o nome do contato " + (i+1) + ": ");
            String nome = scanner.nextLine();
            c.setNome(nome);
            System.out.println("Digite o telefone do contato: ");
            String telefone = scanner.nextLine();
            c.setTelefone(telefone);
            System.out.println("Digite o email do contato: ");
            String email = scanner.nextLine();
            c.setEmail(email);
            contatos[i] = c;
        }

        agenda.setContatos(contatos);
        agenda.exibirContatos();

        for (Contato contato : contatos){
            System.out.println(contato.obterInfo());
        }
    }
}
