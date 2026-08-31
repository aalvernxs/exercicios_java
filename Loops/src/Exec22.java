import java.util.Scanner;

public class Exec22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int N = scan.nextInt();
        int divisoes = 0;

        for (int numero = 2; numero <= N; numero++) {
            boolean primo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                divisoes++;

                if (numero % i == 0) {
                    primo = false;

                }

            }

            if (primo) {
                System.out.println(numero);
            }

        }
        System.out.println("O número de divisões realizadas foi de " + divisoes);

    }
}
