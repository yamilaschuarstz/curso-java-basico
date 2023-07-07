public class While {
    public static void main(String[] args) {
        int i = 1;
        int max = 10;
        System.out.println("Contando até " + max);

        while (i <= max){
            System.out.println(i);
            i++;
        }

        do{
            System.out.println(i);
            i++;
        } while (i < 15);
    }
}
