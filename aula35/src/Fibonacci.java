public class Fibonacci {
    public static int fibonacci(int n1){
        if (n1 < 2){
            return 1;
        }
        return fibonacci(n1 - 1) + fibonacci(n1 - 2);
    }
}
