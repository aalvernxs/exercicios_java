import java.util.Scanner;
public class Exec22 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num = scan.nextDouble();

       if (num == Math.round(num)){
           System.out.println("O número " + num + " é inteiro.");

       } else {
           System.out.println("O número " + num + " é decimal.");
       }
    }
}
