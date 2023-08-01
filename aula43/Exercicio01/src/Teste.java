public class Teste {
    public static void main(String[] args) {
        System.out.println("Teste Conta Bancária");
        ContaBancaria conta1 = new ContaBancaria("Maria", "78678", 400.50);
        System.out.println(conta1.toString());
        conta1.depositar(50);
        System.out.println(conta1.toString());
        conta1.sacar(1000);
        conta1.sacar(200);
        System.out.println(conta1.toString());

        ContaPoupanca conta2 = new ContaPoupanca("João", "24523", 300, 1);

        System.out.println(conta2.toString());
        conta2.depositar(50.00);
        conta2.calcularNovoSaldo();
        System.out.println(conta2.toString());

        ContaEspecial conta3 = new ContaEspecial("José", "43534", 50, 500);
        conta3.sacar(60);
        System.out.println(conta3.toString());



    }
}
