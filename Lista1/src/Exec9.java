import java.util.Scanner;

public class Exec9 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite a temperatura em Farenheit: ");
        double tempFaren = scan.nextDouble();

        double celsius = (tempFaren - 32) * 5 / 9;

        System.out.println("A temperatura em Celsius é: " + celsius);



    }
}
