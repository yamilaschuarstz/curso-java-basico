public class AgendaCheiaException extends Exception{

    public String getMessage(){
        return "Agenda cheia, não é possível adicionar contato";
    }
}
