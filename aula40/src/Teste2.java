public class Teste2 {
    public static void main(String[] args) {

        Object objeto = obterString();
        String s1 = (String) objeto;

        Object objeto2 = "String";
        String s2 = (String) objeto2;

        Object objeto3 = new Object();
        String s3 = (String) objeto3; // erro de execução

        Object objeto4 = obterInteiro();
        String s4 = (String) objeto4; // erro de execução


    }

    public static String obterString(){
        return "String";
    }

    public static int obterInteiro(){
        return 1;
    }
}
