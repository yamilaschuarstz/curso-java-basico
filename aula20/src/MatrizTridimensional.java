public class MatrizTridimensional {
    public static void main(String[] args) {
        int[][][] matriz = new int[3][3][3];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                for (int k = 0; k < matriz[i][j].length; k++){
                    matriz[i][j][k] = i + j + k;
                }
            }
        }

        int soma = 0;
        int somaPar = 0;
        int somaImpar = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                for (int k = 0; k < matriz[i][j].length; k++){
                    soma += matriz[i][j][k];

                    if (matriz[i][j][k] % 2 == 0){
                        somaPar += matriz[i][j][k];
                    } else {
                        somaImpar += matriz[i][j][k];
                    }
                }
            }
        }

        System.out.println("Soma total: " + soma);
        System.out.println("Soma dos pares: " + somaPar);
        System.out.println("Soma dos ímpares: " + somaImpar);
    }
}
