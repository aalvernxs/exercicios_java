import java.util.Scanner;

public class Exec20 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int nCarro;
        String continuar = "s";


        do {
            do {
                System.out.println("Digite a quantidade de carros:");
                nCarro = scan.nextInt();
            } while (nCarro <= 0 || nCarro >= 16);

            int resultado = 1;

            for (int i = 1; i <= nCarro; i++) {
                resultado = resultado * i;

            }
            System.out.println("O número de maneiras que os carros podem ser enfileirados são de " + resultado + " maneiras.");
            System.out.println("Deseja continuar? (s/n)");
            continuar = scan.next();
        } while (continuar.equalsIgnoreCase("s"));


    }
}

