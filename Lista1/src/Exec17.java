import java.util.Scanner;
public class Exec17 {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o  ano para saber se é bissexto ou não: ");
        int ano = scan.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }

    }

}
