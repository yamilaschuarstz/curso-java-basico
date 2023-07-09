public class Exercicio4 {
    public static void main(String[] args) {
        int popA = 80000;
        int popB = 200000;
        int cont = 0;

        while (popA <= popB){
            popA += (popA * 3) / 100;
            popB += (popB * 1.5) / 100;
            System.out.println("População do país A: " + popA);
            System.out.println("População do país B: " + popB);
            cont++;
        }

        System.out.println("São necessários " + cont + " anos para a população do país A ultrapassar a população do país B");
    }
}

