public class PessoaFisica extends Contribuinte{
    private String cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, double rendaBruta, String cpf) {
        super(nome, rendaBruta);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double calcularImposto(){
        double imposto = 0;
        if (this.getRendaBruta() <= 1400){
            imposto = 0;
        } else if (this.getRendaBruta() > 1400 && this.getRendaBruta() <= 2100){
            imposto = this.getRendaBruta() * 0.10 - 100;
        } else if (this.getRendaBruta() > 2100 && this.getRendaBruta() <= 2800){
            imposto = this.getRendaBruta() * 0.15 - 270;
        } else if (this.getRendaBruta() > 2800 && this.getRendaBruta() <= 3600){
            imposto = this.getRendaBruta() * 0.25 - 500;
        } else if (this.getRendaBruta() > 3600){
            imposto = this.getRendaBruta() * 0.30 - 700;
        }

        return imposto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCPF: " + cpf +
                "\nImposto: R$" + calcularImposto();
    }
}
