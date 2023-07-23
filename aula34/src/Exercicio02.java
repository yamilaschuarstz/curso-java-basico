public class Exercicio02 {

    static int somar(int n1, int n2){
        return n1 + n2;
    }

    static int subtrair(int n1, int n2){
        return n1 - n2;
    }

     static int multiplicar(int n1, int n2){
        return n1 * n2;
    }

    static int dividir(int n1, int n2){
        return n1 / n2;
    }

    static int elevarPotencia(int n1, int n2){
        int total = 1;
        for (int i = 1; i <= n2; i++){
            total *= n1;
        }

        return total;
    }


    static int calcularFatorial(int n1){
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

}
