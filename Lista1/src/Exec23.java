import java.util.Scanner;
public class Exec23 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = scan.nextDouble();


        System.out.println("Digite a operação a ser realizada (1 - Par ou ímpar, 2 - positivo ou negativo e 3 -inteiro ou decimal");
        int escolha = scan.nextInt();

        double resultado = 0;

        switch (escolha) {
            case 1:
                if (num % 2 == 0) {
                    System.out.println("O número " + num + " é par.");
                } else {
                    System.out.println("O número " + num + " é ímpar.");
                }
                break;

            case 2:
                if (num > 0) {
                    System.out.println("O número " + num + " é positivo.");
                } else if (num < 0) {
                    System.out.println("O número " + num + " é negativo.");
                } else {
                    System.out.println("O número " + num + " é zero.");
                }
                break;

            case 3:
                if (num == Math.round(num)) {
                    System.out.println("O número " + num + " é inteiro.");
                } else {
                    System.out.println("O número " + num + " é decimal.");
                }
                break;

            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 3.");

        }





        }

    }

