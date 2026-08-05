import java.util.Scanner;

public class Exec15 {
    public static void main ( String[] args){
        Scanner scan = new Scanner (System.in);

        int placa;
        int par = 0;
        int impar = 0;

        for (int i= 1; i <= 10 ; i++){
            System.out.println("Digite os números finais da placa do carro:  ");
            placa = scan.nextInt();

            if (placa % 2 == 0){
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("O número de carros com placas pares é: " + par);
        System.out.println("O número de carros com placas ímpares é: " + impar);

    }
}
