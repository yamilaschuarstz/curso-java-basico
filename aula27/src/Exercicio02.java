public class Exercicio02 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "000013";
        conta.agencia = "444";
        conta.titular = "Billie Joca Silva";
        conta.saldo = -10;
        conta.especial = true;
        conta.limiteEspecial = 5000;
        conta.valorEspecialUsado = 10;

        System.out.println("Número: " + conta.numero);
        System.out.println("Agência: " + conta.agencia);
        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo: " + conta.saldo);
        System.out.println("Especial: " + conta.especial);
        System.out.println("Limite: " + conta.limiteEspecial);
        System.out.println("Valor cheque especial usado: " + conta.valorEspecialUsado);

        conta.sacar(15);
        conta.consultarSaldo();
        System.out.println("Valor especial usado: " + conta.valorEspecialUsado);

        conta.depositar(200);
        conta.consultarSaldo();

        if (conta.verificarChequeEspecial()){
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }

    }
}
