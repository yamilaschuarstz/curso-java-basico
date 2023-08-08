public class Teste {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.setLado(4);
        quadrado.setNome("Quadrado");

        Circulo circulo = new Circulo();
        circulo.setRaio(2.75);
        circulo.setNome("Círculo");

        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(2);
        triangulo.setBase(3);
        triangulo.setNome("Triângulo");

        Cubo cubo = new Cubo();
        cubo.setLado(5);
        cubo.setNome("Cubo");

        Cilindro cilindro = new Cilindro();
        cilindro.setAltura(3);
        cilindro.setRaio(2);
        cilindro.setNome("Cilindro");

        Piramide piramide = new Piramide();
        piramide.setAltura(3);
        piramide.setApotema(4);
        piramide.setArestaBase(2);
        piramide.setNumeroPoligonos(4);
        piramide.setBase(quadrado);
        piramide.setNome("Pirâmide");

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = quadrado;
        figuras[1] = circulo;
        figuras[2] = triangulo;
        figuras[3] = cubo;
        figuras[4] = cilindro;
        figuras[5] = piramide;

        for (FiguraGeometrica figura : figuras){
            System.out.println("----------------");
            System.out.println("Nome: " + figura.getNome());
            if (figura instanceof Figura2D){
                Figura2D figura2D = (Figura2D) figura;
                System.out.println("Área: " + figura2D.calcularArea());
            }
            if (figura instanceof Figura3D){
                Figura3D figura3D = (Figura3D) figura;
                System.out.println("Área: " + figura3D.calcularArea());
                System.out.println("Volume: " + figura3D.calcularVolume());
            }
        }


    }
}