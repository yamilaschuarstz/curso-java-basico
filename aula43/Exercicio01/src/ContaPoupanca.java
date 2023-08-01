import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;
    private final double TAXA_RENDIMENTO = 0.05;

    public ContaPoupanca(){

    }

    public ContaPoupanca(String nomeCliente, String numero, double saldo, int diaRendimento) {
        super(nomeCliente, numero, saldo);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public double getTAXA_RENDIMENTO() {
        return TAXA_RENDIMENTO;
    }

    public void calcularNovoSaldo(){
        Calendar hoje = Calendar.getInstance();
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            this.setSaldo(this.getSaldo() + (this.getSaldo() * TAXA_RENDIMENTO));
            System.out.println("Hoje é dia de rendimento, novo saldo: R$" + this.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento");
        }
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "diaRendimento=" + diaRendimento +
                ", TAXA_RENDIMENTO=" + TAXA_RENDIMENTO +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
