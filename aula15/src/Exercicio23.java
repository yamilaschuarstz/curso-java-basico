import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tipo de carne: ");
        System.out.println("1 - Filé Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        System.out.println("Digite o número da carne desejada: ");
        int num = scan.nextInt();
        System.out.println("Quantidade (kg) desejada: ");
        double qtde = scan.nextDouble();

        String carne = null;
        double precoKg = 0;
        switch (num){
            case 1:
               carne = "Filé Duplo";
               if (qtde <= 5){
                   precoKg = 4.90;
               } else {
                   precoKg = 5.80;
               }
               break;
            case 2:
                carne = "Alcatra";
                if (qtde <= 5){
                    precoKg = 5.90;
                } else {
                    precoKg = 6.80;
                }
                break;
            case 3:
                carne = "Picanha";
                if (qtde <= 5){
                    precoKg = 6.90;
                } else {
                    precoKg = 7.80;
                }
        };

        System.out.println("Forma de pagamento: [1 para cartão]: ");
        int pagamento = scan.nextInt();
        double valorTotal = precoKg * qtde;
        if (pagamento == 1){
            valorTotal = valorTotal - (valorTotal * 5) / 100;
        }

        System.out.println("------CUPOM FISCAL------");
        System.out.println("Carne escolhida: " + carne);
        System.out.printf("Valor total: R$ %.2f" , valorTotal);
    }
}
