public class Somatorio {
    public static int somatorio(int n1){
        if (n1 == 1){
            return 1;
        }
        return n1 + somatorio(n1-1);
    }
}
