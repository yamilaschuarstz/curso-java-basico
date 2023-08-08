import java.util.Arrays;

public class Agenda {
    private Contato[] contatos = new Contato[5];

    public Agenda() {

    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public void adicionarContato(Contato contato) throws AgendaCheiaException {
        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = contato;
                cheia = false;
                break;
            }
        }

        if (cheia){
            throw new AgendaCheiaException();
        }
    }

    public boolean consultarContato(String nome) throws ContatoNaoExisteException {
        boolean contatoExiste = false;
        for (int i = 0; i < contatos.length; i++){
            if (contatos[i] != null){
                if (contatos[i].getNome().equalsIgnoreCase(nome)){
                    System.out.println(contatos[i].toString());
                    return true;
                }
            }
        }
        throw new ContatoNaoExisteException(nome);


    }

    @Override
    public String toString() {
        String s = "";
        for (Contato contato : contatos){
            s = contato.toString() + "\n";
        }
        return s;
    }
}
