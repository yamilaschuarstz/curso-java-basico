import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws AgendaCheiaException, ContatoNaoExisteException {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao = 1;
        while (opcao != 3){
            opcao = obterMenu(scan);
            if (opcao == 1){
                consultarContato(scan, agenda);
            } else if (opcao == 2) {
                criarContato(scan, agenda);
            } else if (opcao == 3) {
                System.exit(0);
            }
        }


    }

    public static void criarContato(Scanner scan, Agenda agenda){
        System.out.println("-------------------------");
        System.out.println("Digite o nome do contato: ");
        String nome = scan.nextLine();
        System.out.println("Digite o telefone: ");
        String telefone = scan.nextLine();
        System.out.println("Digite o email: ");
        String email = scan.nextLine();
        Contato c = new Contato();
        c.setNome(nome);
        c.setTelefone(telefone);
        c.setEmail(email);

        try{
            agenda.adicionarContato(c);
        } catch (AgendaCheiaException e){
            System.out.println(e.getMessage());;
        }
    }

    public static void consultarContato(Scanner scan, Agenda agenda){
        System.out.println("--------------------");
        String contato = lerNome(scan, "Digite o nome do contato a pesquisar: ");
        try{
            if (agenda.consultarContato(contato)){
                System.out.println("Contato está na agenda!");
            }

        } catch (ContatoNaoExisteException e){
            System.out.println(e.getMessage());
        }


    }

    public static String lerNome(Scanner scan, String msg){
        System.out.println(msg);
        String nome = scan.nextLine();
        return nome;
    }

    public static int obterMenu(Scanner scan){
        boolean entradaValida = false;
        int opcao = 0;

        do{
            System.out.println("--------MENU--------");
            System.out.println("[1] Consultar um contato");
            System.out.println("[2] Adicionar novo contato");
            System.out.println("[3] Sair");
            try{
                System.out.println("Digite a opção desejada: ");
                opcao = scan.nextInt();
                scan.nextLine();
                if (opcao < 1 || opcao > 3){
                    throw new Exception("Opção inválida");
                } else {
                    entradaValida = true;
                }
            } catch (Exception e){
                System.out.println("Opção inválida! Digite novamente.");
                scan.nextLine();
            }

        } while (!entradaValida);

         return opcao;
    }
}