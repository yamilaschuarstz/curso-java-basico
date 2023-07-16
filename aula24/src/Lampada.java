public class Lampada {
    String marca;
    String modelo;

    String tensao;

    int potencia;
    String tipoLuz;
    String cor;
    int mesesGarantia;
    String[] tipo;
    double preco;
    int qtdeEstoque;
    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getTensao(){
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getTipoLuz(){
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }

    public void setMesesGarantia(int mesesGarantia) {
        this.mesesGarantia = mesesGarantia;
    }

    public String[] getTipo(){
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getQtdeEstoque(){
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque){
        this.qtdeEstoque = qtdeEstoque;
    }

}
