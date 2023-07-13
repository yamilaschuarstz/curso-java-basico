import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] jogo = new char[3][3];
        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0;
        int coluna = 0;

        System.out.println("Jogador 1: X");
        System.out.println("Jogador 2: O");

        while (!ganhou){
            if (jogada % 2 == 1){
                System.out.println("Vez do jogador 1");
                sinal = 'X';
            } else {
                System.out.println("Vez do jogador 2");
                sinal = 'O';
            }

            boolean linhaValida = false;
            while (!linhaValida) {
                System.out.println("Digite o número da linha (1, 2 ou 3): ");
                linha = scan.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Linha inválida! Tente novamente.");
                }
            }

            boolean colunaValida = false;

            while (!colunaValida){
                System.out.println("Digite o número da coluna (1, 2 ou 3): ");
                coluna = scan.nextInt();
                if (coluna >= 1 && coluna <=3){
                    colunaValida = true;
                } else {
                    System.out.println("Coluna inválida! Tente novamente.");
                }
            }

            linha--;
            coluna--;

            if (jogo[linha][coluna] == 'X' || jogo[linha][coluna] == 'O'){
                System.out.println("Posição já ocupada, tente novamente!");
            } else {
                jogo[linha][coluna] = sinal;
                jogada++;
            }

            for (int i = 0; i < jogo.length; i++){
                for (int j = 0; j < jogo[i].length; j++){
                    System.out.print("[" + jogo[i][j] + "]");
                }
                System.out.println();
            }

            if ((jogo[0][0] == 'X' && jogo[0][1] == 'X' && jogo[0][2] == 'X') ||
                    (jogo[1][0] == 'X' && jogo[1][1] == 'X' && jogo[1][2] == 'X') ||
                    (jogo[2][0] == 'X' && jogo[2][1] == 'X' && jogo[2][2] == 'X') ||
                    (jogo[0][0] == 'X' && jogo[1][0] == 'X' && jogo[2][0] == 'X') ||
                    (jogo[0][1] == 'X' && jogo[1][1] == 'X' && jogo[2][1] == 'X') ||
                    (jogo[0][2] == 'X' && jogo[1][2] == 'X' && jogo[2][2] == 'X') ||
                    (jogo[0][0] == 'X' && jogo[1][1] == 'X' && jogo[2][2] == 'X') ||
                    (jogo[2][0] == 'X' && jogo[1][1] == 'X' && jogo[0][2] == 'X')){
                System.out.println("Jogador 1 VENCEU!");
                ganhou = true;
            } else if ((jogo[0][0] == 'O' && jogo[0][1] == 'O' && jogo[0][2] == 'O') ||
                    (jogo[1][0] == 'O' && jogo[1][1] == 'O' && jogo[1][2] == 'O') ||
                    (jogo[2][0] == 'O' && jogo[2][1] == 'O' && jogo[2][2] == 'O') ||
                    (jogo[0][0] == 'O' && jogo[1][0] == 'O' && jogo[2][0] == 'O') ||
                    (jogo[0][1] == 'O' && jogo[1][1] == 'O' && jogo[2][1] == 'O') ||
                    (jogo[0][2] == 'O' && jogo[1][2] == 'O' && jogo[2][2] == 'O') ||
                    (jogo[0][0] == 'O' && jogo[1][1] == 'O' && jogo[2][2] == 'O') ||
                    (jogo[2][0] == 'O' && jogo[1][1] == 'O' && jogo[0][2] == 'O')) {
                System.out.println("Jogador 2 VENCEU!");
                ganhou = true;
            } else if (jogada > 9) {
                System.out.println("Ninguém ganhou a partida :(");
                ganhou = true;
                
            }

        }
    }
}
