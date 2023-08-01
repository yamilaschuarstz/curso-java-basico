public class ContaBancaria {
    protected String nomeCliente;
    protected String numero;
    protected double saldo;

    public ContaBancaria(){

    }
    public ContaBancaria(String nomeCliente, String numero, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Novo saldo : R$" + this.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para realizar saque!");
        }
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito!");
        }

    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
