public class Lampada {
    private String marca;
    private String modelo;
    private int tensao;
    private int potencia;
    private String cor;
    private int mesesGarantia;

    private String[] tipo;

    private boolean estado;
    Lampada(){

    }

    Lampada(String marca, String modelo, int tensao, int potencia, String cor, int mesesGarantia, String[] tipo){
        this.marca = marca;
        this.modelo = modelo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.mesesGarantia = mesesGarantia;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTensao() {
        return tensao;
    }

    public void setTensao(int tensao) {
        this.tensao = tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }

    public void setMesesGarantia(int mesesGarantia) {
        this.mesesGarantia = mesesGarantia;
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void ligar(){
        this.setEstado(true);
    }

    public void desligar(){
        this.setEstado(false);
    }

    public void mudarEstado(){
        if (estado){
            this.desligar();
        } else {
            this.ligar();
        }
    }

    public void mostrarEstado(){
        if (this.estado){
            System.out.println("A lâmpada está ligada;");
        } else {
            System.out.println("A lâmpada está desligada");
        }
    }
}
