public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial() {

    }
    public ContaEspecial(String nomeCliente, String numero, double saldo, double limite) {
        super(nomeCliente, numero, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void sacar(double valor){
        if (this.getSaldo() >= valor){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            if (limite >= valor){
                double diferenca = valor - saldo;
                this.saldo = 0;
                this.limite -= diferenca;
                System.out.println("Saque realizado através do cheque especial!");
            } else {
                System.out.println("Limite do cheque especial excedido! Saque não pode ser realizado.");
            }
        }
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite=" + limite +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
