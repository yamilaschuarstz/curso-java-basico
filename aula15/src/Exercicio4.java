import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = scan.next();
        String letra1 = letra.toUpperCase();

        if (letra1.length() > 1){
            System.out.println("Entrada inválida!");
        } else{
            switch (letra1){
                case "A":
                case "E":
                case "I":
                case "O":
                case "U": System.out.println("Vogal"); break;
                case "B":
                case "C":
                case "D":
                case "F":
                case "G":
                case "H":
                case "J":
                case "L":
                case "M":
                case "N":
                case "P":
                case "R":
                case "S":
                case "T":
                case "V":
                case "W":
                case "X":
                case "Y":
                case "Z": System.out.println("Consoante"); break;
                default: System.out.println("Caractere inválido!"); break; }
        }

    }
}
