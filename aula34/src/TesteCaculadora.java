public class TesteCaculadora{

    static int resultado;
    public static void main(String[] args) {
        resultado = Calculadora.soma(5, 8);

        subtrair(8, 5);
    }

    static int subtrair(int n1, int n2){
        return n1 - n2;
    }
}