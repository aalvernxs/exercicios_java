import java.util.Scanner;
public class Exec8 {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        int num = 0;
        int soma = 0;
        int media = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite um número");
            num = scan.nextInt();
            soma += num;
        }
        media = soma / 5;
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);


    }
}
