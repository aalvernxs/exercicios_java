import java.util.Scanner;

public class Exec16 {
    public static void main (String[] args){
        Scanner scan = new  Scanner(System.in);

        int termo1 = 1;
        int termo2 = 1;
        int proximo = 0;
        int n;

        System.out.println("Digite o número de repetições: ");
        n =  scan.nextInt();

        for (int i = 1; i <= n; i++){
            if (i <= 2){
                System.out.println(termo1);

            } else {
                proximo = termo1 + termo2;
                System.out.println(proximo);
                termo1 = termo2;
                termo2 = proximo;
            }


        }
    }
}
