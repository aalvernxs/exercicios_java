import java.util.Scanner;
public class Exec14 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int base = 0;
        int expoente = 1;
        int resultado = 1;

        System.out.println("Digite a potência do motor: ");
        base = scan.nextInt();

        System.out.println("Digite o expoente/multiplicador: ");
        expoente = scan.nextInt();

        for (int i = 1; i <= expoente; i++){
            resultado  = resultado *base;
        }

        System.out.println("O resultado da potência é: " + resultado);

    }

}
