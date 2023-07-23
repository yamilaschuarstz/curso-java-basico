public class TesteExercicio02 {
    public static void main(String[] args) {
        imprimirTela(Exercicio02.somar(12, 3));
        imprimirTela(Exercicio02.subtrair(7, 3));
        imprimirTela(Exercicio02.multiplicar(6, 3));
        imprimirTela(Exercicio02.dividir(56, 7));
        imprimirTela(Exercicio02.elevarPotencia(3, 3));
        imprimirTela(Exercicio02.calcularFatorial(5));
        imprimirTela(Exercicio02.calcularFatorial(0));
        imprimirTela(Exercicio02.calcularFatorial(1));
    }

    static void imprimirTela(int num){
        System.out.println(num);
    }
}
