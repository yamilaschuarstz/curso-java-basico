public class Calculadora {
    static int fatorialNaoRecursivo(int n1){
        int fatorial = 1;
        if (n1 == 0){
            return 1;
        } else{
            for (int i = 1; i <= n1; i++){
                fatorial *= i;
            }
        }
        return fatorial;
    }

    public static int fatorial(int n1){
        if (n1 == 0){
            return 1;
        }
        return n1 * (fatorial(n1 - 1));
    }

}
