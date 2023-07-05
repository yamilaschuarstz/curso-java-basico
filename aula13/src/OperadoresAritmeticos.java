public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado/2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String nome = "João";
        String sobrenome = " da Silva";
        String nomeCompleto = nome + sobrenome;
        System.out.println(nomeCompleto);

        resultado++;
        System.out.println(resultado);
        System.out.println(resultado++);
        System.out.println(++resultado);

        resultado--;
        System.out.println(resultado);

        System.out.println(resultado--);
        System.out.println(--resultado);

    }
}
