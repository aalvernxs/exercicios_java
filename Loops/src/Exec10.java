import java.util.Scanner;
public class Exec10 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int km1;
        int km2;
        int soma = 0;

        System.out.println("Digite a primeira quilometragem");
        km1 = scan.nextInt();

        System.out.println("Digite a segunda quilometragem");
        km2 = scan.nextInt();

        for  (int i = km1 + 1; i < km2; i++) {
            System.out.println(i);
            soma += i;

        }

        System.out.println("A soma dos números é: " + soma);

    }
}
