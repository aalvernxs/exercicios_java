import java.util.Scanner;

public class Exec10 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double tempCelsius = scan.nextDouble();

        double tempFar = (tempCelsius * 9 / 5) + 32;

        System.out.println("A temperatura em Farenheit é: " + tempFar);

    }
}
