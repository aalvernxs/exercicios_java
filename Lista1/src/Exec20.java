import java.util.Scanner;

public class Exec20 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor a ser sacado: ");
        double valorSaque = scan.nextDouble();

            int notas100 = (int) (valorSaque / 100);
            int notas50 = (int) ((valorSaque % 100) / 50);
            int notas20 = (int) (((valorSaque % 100) % 50) / 20);
            int notas10 = (int) ((((valorSaque % 100) % 50) % 20) / 10);
            int notas5 = (int) (((((valorSaque % 100) % 50) % 20) % 10) / 5);
            int notas2 = (int) ((((((valorSaque % 100) % 50) % 20) % 10) % 5) / 2);
            int notas1 = (int) (((((((valorSaque % 100) % 50) % 20) % 10) % 5) % 2));

            if (valorSaque >= 100) {
                System.out.println("Notas de 100: " + notas100);
            }
            if (valorSaque % 100 >= 50) {
                System.out.println("Notas de 50: " + notas50);
            } if (valorSaque % 100 % 50 >= 20){
                System.out.println("Notas de 20: " + notas20);
            } if (valorSaque % 100 % 50 % 20 >= 10){
                System.out.println("Notas de 10: " + notas10);
            } if (valorSaque % 100 % 50 % 20 % 10 >= 5){
                System.out.println("Notas de 5: " + notas5);
            } if (valorSaque % 100 % 50 % 20 % 10 % 5 >= 2){
                System.out.println("Notas de 2: " + notas2);
            } if (valorSaque % 100 % 50 % 20 %  10 % 5 % 2 >= 1){
                System.out.println("Notas de 1: " + notas1);

        }


    }
}
