import java.util.Scanner;

public class Exec5 {

public static void main (String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a medida em Metros: ");
    double numMetro = scan.nextDouble();

    double numCentimetro = numMetro * 100;

    System.out.println("A medida em Centímetros é: " + numCentimetro);


}

}
