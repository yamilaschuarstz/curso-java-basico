import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] compromisso = new String[31][24];

        int resp;
        do{
            System.out.println("[1] - Adicionar compromisso");
            System.out.println("[2] - Verificar compromisso");
            System.out.println("[0] - Sair");
            resp = scan.nextInt();

            switch (resp){
                case 1:
                    boolean diaValido = false;
                    int hora;
                    int dia;
                    do {
                        System.out.println("Digite o dia do mês: ");
                        dia = scan.nextInt();
                        if (dia >= 1 && dia <= 31){
                            diaValido = true;
                        } else {
                            System.out.println("Dia inválido! Digite novamente.");
                        }
                    } while (!diaValido);

                    boolean horaValida = false;
                    do {
                        System.out.println("Digite a hora do dia: ");
                        hora = scan.nextInt();
                        if (hora >= 0 && hora <= 23){
                            horaValida = true;
                        } else {
                            System.out.println("Hora inválida! Digite novamente.");
                        }

                    } while (!horaValida);
                    System.out.println("Digite seu compromisso: ");
                    compromisso[--dia][hora] = scan.next();
                    break;

                case 2:
                    boolean diaValido1 = false;
                    int hora1;
                    int dia1;
                    do {
                        System.out.println("Digite o dia do mês: ");
                        dia1 = scan.nextInt();
                        if (dia1 >= 1 && dia1 <= 31){
                            diaValido1 = true;
                        } else {
                            System.out.println("Dia inválido! Digite novamente.");
                        }
                    } while (!diaValido1);

                    boolean horaValida1 = false;
                    do {
                        System.out.println("Digite a hora do dia: ");
                        hora1 = scan.nextInt();
                        if (hora1 >= 0 && hora1 <= 23){
                            horaValida1 = true;
                        } else {
                            System.out.println("Hora inválida! Digite novamente.");
                        }

                    } while (!horaValida1);
                    System.out.println("O compromisso agendado é: " + compromisso[--dia1][hora1]);
                    break;

            }
        } while (resp != 0);
    }
}
