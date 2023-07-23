public class ContaCorrente {
    private String numero;
    private String nomeTitular;
    private boolean especial;
    private double limite;
    private double saldo;

    ContaCorrente(){

    }

    ContaCorrente(String numero, String nomeTitular, boolean especial, double limite, double saldo) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.especial = especial;
        this.limite = limite;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void sacar(double valor){
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            if (especial){
                if (limite > valor){
                    saldo -= valor;
                    System.out.println("Saque realizado através do cheque especial");
                }
            } else {
                System.out.println("Saldo insuficiente!");
            }
        }
    }

    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido para depósito!");
        } else {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        }
    }

    public void verificarSaldo(){
        System.out.printf("Saldo: R$%.2f" , this.saldo);
        System.out.println();
    }

    public boolean verificarChequeEspecial(){
        return saldo < 0;
    }
}
