public class JogoDaVelha {
    private char[][] jogo;
    private char jogador1;
    private char jogador2;
    int jogada = 0;

    JogoDaVelha(){
        this.jogo = new char[3][3];
        for (int i = 0; i < jogo.length; i ++){
            for (int j = 0; j < jogo[i].length; j++){
                jogo[i][j] = ' ';
            }
        }
        this.jogador1 = 'X';
        this.jogador2 = 'O';
    }

    public char[][] getJogo() {
        return jogo;
    }

    public void setJogo(char[][] jogo) {
        this.jogo = jogo;
    }

    public char getJogador1() {
        return jogador1;
    }

    public void setJogador1(char jogador1) {
        this.jogador1 = jogador1;
    }

    public char getJogador2() {
        return jogador2;
    }

    public void setJogador2(char jogador2) {
        this.jogador2 = jogador2;
    }

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

    public boolean validarLinha(int linha){
        if (linha >= 1 && linha <= 3){
            return true;
        } else {
            System.out.println("Linha inválida! Jogue novamente");
            return false;
        }
    }

    public boolean validarColuna(int coluna){
        if (coluna >= 1 && coluna <= 3){
            return true;
        } else {
            System.out.println("Coluna inválida! Jogue novamente");
            return false;
        }
    }

    public boolean validarJogada(int linha, int coluna){
        if (this.jogo[linha][coluna] != 'X' && this.jogo[linha][coluna] != 'O') {
            return true;
        } else {
            return false;
        }
    }

    public void jogar(int linha, int coluna){
        if (jogada % 2 == 1){
            jogo[linha][coluna] = 'X';
            jogada++;
        } else {
            jogo[linha][coluna] = 'O';
            jogada++;
        }
    }

    public void imprimirTabuleiro(){
        for (int i = 0; i < jogo.length; i++){
            for (int j = 0; j < jogo[i].length; j++){
                System.out.print("[" + jogo[i][j] + "]");
            }
            System.out.println();
        }
    }

    public boolean verificarVencedor(){
        if ((jogo[0][0] == 'X' && jogo[0][1] == 'X' && jogo[0][2] == 'X') ||
                (jogo[1][0] == 'X' && jogo[1][1] == 'X' && jogo[1][2] == 'X') ||
                (jogo[2][0] == 'X' && jogo[2][1] == 'X' && jogo[2][2] == 'X') ||
                (jogo[0][0] == 'X' && jogo[1][0] == 'X' && jogo[2][0] == 'X') ||
                (jogo[0][1] == 'X' && jogo[1][1] == 'X' && jogo[2][1] == 'X') ||
                (jogo[0][2] == 'X' && jogo[1][2] == 'X' && jogo[2][2] == 'X') ||
                (jogo[0][0] == 'X' && jogo[1][1] == 'X' && jogo[2][2] == 'X') ||
                (jogo[2][0] == 'X' && jogo[1][1] == 'X' && jogo[0][2] == 'X')){
            System.out.println("Jogador 2 venceu!");
            return true;
        } else if ((jogo[0][0] == 'O' && jogo[0][1] == 'O' && jogo[0][2] == 'O') ||
                (jogo[1][0] == 'O' && jogo[1][1] == 'O' && jogo[1][2] == 'O') ||
                (jogo[2][0] == 'O' && jogo[2][1] == 'O' && jogo[2][2] == 'O') ||
                (jogo[0][0] == 'O' && jogo[1][0] == 'O' && jogo[2][0] == 'O') ||
                (jogo[0][1] == 'O' && jogo[1][1] == 'O' && jogo[2][1] == 'O') ||
                (jogo[0][2] == 'O' && jogo[1][2] == 'O' && jogo[2][2] == 'O') ||
                (jogo[0][0] == 'O' && jogo[1][1] == 'O' && jogo[2][2] == 'O') ||
                (jogo[2][0] == 'O' && jogo[1][1] == 'O' && jogo[0][2] == 'O')) {
            System.out.println("Jogador 1 venceu!");
            return true;
        } else{
            return false;

        }
    }
}
