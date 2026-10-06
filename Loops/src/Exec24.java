import java.util.Scanner;

public class Exec24 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o número de carros da frota:  ");
        int frota =  scanner.nextInt();

        double soma = 0;
        double media = 0;

        for (int i = 1; i <= frota; i++){
            System.out.println("Digite quantos anos de uso tem o carro: ");
            double anos = scanner.nextDouble();

            soma += anos;
        }
        media = soma / frota;

        if (media <= 5){
            System.out.println("A frota é nova, com média de " + media + " anos de uso.");
        } else if ( media <= 10){
            System.out.println("A frota é madura, com média de " + media + " anos de uso.");
        } else {
            System.out.println("A frota é antiga, com média de " + media + " anos de uso.");
        }

    }
}
