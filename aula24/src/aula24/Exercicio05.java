package aula24;

public class Exercicio05 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.setNumero("000013");
        conta.setAgencia("444");
        conta.setTitular("Billie Joca Silva");
        conta.setSaldo(2000.05);
        conta.setEspecial(true);
        conta.setLimite(5000);

        System.out.println("Número: " + conta.getNumero());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Especial: " + conta.isEspecial());
        System.out.println("Limite: " + conta.getLimite());
    }
}
