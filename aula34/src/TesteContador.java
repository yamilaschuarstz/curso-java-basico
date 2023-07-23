public class TesteContador {
    public static void main(String[] args) {
        System.out.println(Contador.obterValor());
        Contador.incrementar();
        System.out.println(Contador.obterValor());
        Contador.zerar();
        System.out.println(Contador.obterValor());

        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        System.out.println(Contador.obterValor());
    }
}
