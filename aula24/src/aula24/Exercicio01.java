package aula24;

public class Exercicio01 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.setModelo("A60");
        lampada.setTensao("Bivolt");
        lampada.setMesesGarantia(36);
        lampada.setPotencia(7);
        lampada.setCor("Amarela");
        lampada.tipo = new String[3];
        lampada.tipo[0] = "Amarela";
        lampada.tipo[1] = "Abajur";
        lampada.tipo[2] = "Lampeões";
    }
}
