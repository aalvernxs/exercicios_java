import java.util.Scanner;

public class Exec5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String resposta;

        do {

            double populacaoA;
            double populacaoB;
            double taxaA;
            double taxaB;
            int anos = 0;

            do {
                System.out.print("Digite a população A: ");
                populacaoA = input.nextDouble();

                if (populacaoA <= 0) {
                    System.out.println("População inválida!");
                }

            } while (populacaoA <= 0);

            do {
                System.out.print("Digite a população B: ");
                populacaoB = input.nextDouble();

                if (populacaoB <= 0) {
                    System.out.println("População inválida!");
                }

            } while (populacaoB <= 0);

            do {
                System.out.print("Digite a taxa de crescimento da população A (%): ");
                taxaA = input.nextDouble();

                if (taxaA <= 0) {
                    System.out.println("Taxa inválida!");
                }

            } while (taxaA <= 0);

            do {
                System.out.print("Digite a taxa de crescimento da população B (%): ");
                taxaB = input.nextDouble();

                if (taxaB <= 0) {
                    System.out.println("Taxa inválida!");
                }

            } while (taxaB <= 0);

            taxaA /= 100;
            taxaB /= 100;

            while (populacaoA < populacaoB) {

                populacaoA += populacaoA * taxaA;
                populacaoB += populacaoB * taxaB;
                anos++;

            }

            System.out.println("\nSerão necessários " + anos + " anos.");

            System.out.print("\nDeseja realizar outro cálculo? (S/N): ");
            resposta = input.next();

        } while (resposta.equalsIgnoreCase("S"));

        input.close();
    }
}