import java.util.Scanner;
public class Exec18 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número menor que mil: ");
        double num = scan.nextDouble();

        double centena = num / 100;
        double dezena = (num % 100) / 10;
        double unidade = num % 10;

        if (num < 1000){
            System.out.println("Centena: " + (int)centena);
            System.out.println("Dezena: " + (int)dezena);
            System.out.println("Unidade: " + (int)unidade);
        } else {
            System.out.println("Numero inválido. Digite um número menor que mil.");
        }

    }
}
