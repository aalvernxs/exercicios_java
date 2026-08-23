import java.util.Scanner;
public class Exec17 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int resultado = 1;


        System.out.println("Digite a quantidade de carros a ser enfileirada: ");
        int nCarro =  sc.nextInt();

        for (int i = 1; i <= nCarro; i++) {
           resultado =  resultado * i;

        }
        System.out.println("O número de maneiras que os carros podem ser enfileirados são de " + resultado + " maneiras.");

        }
    }

