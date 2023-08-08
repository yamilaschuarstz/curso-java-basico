
public class ContatoNaoExisteException extends Exception {
    private String contato;

    ContatoNaoExisteException(String contato){
        this.contato = contato;
    }
    public String getMessage(){

        return "Contato " + this.contato + " não encontrado!";
    }
}
