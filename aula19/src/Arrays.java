public class Arrays {
    public static void main(String[] args) {
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.5;
        temperaturas[1] = 32.7;
        temperaturas[2] = 30.7;
        temperaturas[3] = 31.4;

        System.out.println("A temperatura do dia 3 é: " + temperaturas[2]);
        System.out.println("Tamanho do array: " + temperaturas.length);

        for (int i = 0; i < temperaturas.length; i++){
            System.out.println("Temperatura do dia " + (i+1) + ": " + temperaturas[i]);
        }

        for (double temp : temperaturas){
            System.out.println(temp);
        }
    }
}
