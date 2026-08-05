import java.util.Scanner;
public class Exec7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int num = 0;
       int maior = 0;

       for (int i = 1; i <= 5; i++) {
           System.out.println("Digite um número");
            num = scan.nextInt();

           if  (num > maior) {
               maior = num;
           }

       }
        System.out.println("O maior número é: " + maior);
    }
}
