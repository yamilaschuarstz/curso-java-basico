public class ContaCorrente {
    String numero;
    String agencia;
    String titular;
    double saldo;
    double limiteEspecial;
    double valorEspecialUsado;
    boolean especial;

    public void sacar(double valor){
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso!");
        } else {
            if (especial){
                if ((limiteEspecial - valorEspecialUsado) >= valor){
                    valorEspecialUsado += valor;
                    saldo -= valor;
                    System.out.println("Saque efetuado através do cheque especial");
                }
            } else {
                System.out.println("Não é especial e não há saldo suficiente!");
            }
        }
    }

    public boolean mostrarEspecial(){
        return especial;
    }

    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido!");
        } else {
            saldo += valor;
        }
    }

    boolean verificarChequeEspecial(){
        if (saldo >= 0){
            return false;
        } else {
            return true;
        }
    }
    public void consultarSaldo(){
        System.out.println("Saldo disponível: R$" + saldo);
    }
}
