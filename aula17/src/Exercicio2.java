import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome de usuário: ");
        String usuario = scan.next();
        String senha;
        do {
            System.out.println("Digite a senha: ");
            senha = scan.next();

            if (senha.equals(usuario)){
                System.out.println("Senha inválida. Digite novamente.");
            } else {
                System.out.println("Usuário cadastrado com sucesso!");
            }
        } while (senha.equals(usuario));


    }
}
