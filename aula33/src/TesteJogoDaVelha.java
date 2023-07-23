import java.util.Scanner;

public class TesteJogoDaVelha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();

        int linha;
        int coluna;
        int vez = 1;
        do {
            boolean jogou = false;
            do {
                System.out.println("Vez do jogador " + ((jogo.getJogada() % 2) + 1) + ": ");
                do{
                    System.out.println("Digite a linha [1-3]: ");
                    linha = scan.nextInt();
                } while (!jogo.validarLinha(linha));

                do {
                    System.out.println("Digite a coluna [1-3]: ");
                    coluna = scan.nextInt();
                } while (!jogo.validarColuna(coluna));

                --linha;
                --coluna;
                if (jogo.validarJogada(linha, coluna)){
                    jogo.jogar(linha, coluna);
                    jogou = true;
                } else {
                    System.out.println("Posição ocupada! Tente novamente!");
                }
            } while (jogou = false);
            jogo.imprimirTabuleiro();
            if (jogo.verificarVencedor()){
                break;
            }
            } while (jogo.getJogada() <= 8);

        }


}
