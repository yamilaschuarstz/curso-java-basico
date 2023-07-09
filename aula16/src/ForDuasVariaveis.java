public class ForDuasVariaveis {
    public static void main(String[] args) {
        for (int i = 0, j = 10; i < j; i++, j--){
            System.out.println("i = " + i + "; j = " + j);
        }

        int c = 0;

        for ( ; c <= 5 ; ){
            System.out.println(c);
            c++;
        }

        int soma = 0;
        for (int i = 0; i <= 5; soma += i++);
        System.out.println("O valor de soma é " + soma);

    }
}
