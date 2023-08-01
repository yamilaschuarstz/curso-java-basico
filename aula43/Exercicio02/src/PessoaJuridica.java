public class PessoaJuridica extends Contribuinte{
    private String cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, double rendaBruta, String cnpj) {
        super(nome, rendaBruta);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double calcularImposto(){
        double imposto = this.getRendaBruta() * 0.10;
        return imposto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCNPJ: " + cnpj +
                "\nImposto: R$" + this.calcularImposto();
    }
}
