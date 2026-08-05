import java.util.Scanner;
public class Exec1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;

     do {
         System.out.println("Digite um número inteiro entre 0 e 10 ");
          num = scan.nextInt();
     } while (num < 0 || num > 10);

     System.out.println("Numero válido: " + num);

    }
}