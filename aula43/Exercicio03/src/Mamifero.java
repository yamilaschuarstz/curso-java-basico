public class Mamifero extends Animal{
    private String alimento;
    public Mamifero() {
        this.setAmbiente("Terra");
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAlimento: " + alimento;
    }
}
