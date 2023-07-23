public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("34234", "Billie Joca", true, 2000, 500);
        conta.verificarSaldo();
        conta.sacar(100);
        conta.sacar(600);
        conta.verificarSaldo();
        conta.depositar(300);
        conta.verificarSaldo();
        conta.verificarChequeEspecial();

        ContaCorrente conta2 = new ContaCorrente();
        conta2.setNumero("2143123");
        conta2.setNomeTitular("Nicolau");
        conta2.setEspecial(false);
        conta2.setLimite(0);
        conta2.setSaldo(600);
        conta2.verificarSaldo();
        conta2.sacar(50);
        conta2.verificarSaldo();
        conta2.sacar(600);
        conta2.verificarSaldo();
    }
}
