import java.util.Scanner;

public class Exec13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double consumo = 0;


        System.out.println("Digite o consumo do carro por litro para a Autonomia até 10km/l:");
        consumo = scan.nextDouble();

        for (int i = 1; i <=10; i++){
            System.out.println("A Autonomia do carro com " + i + " litros é de: " + consumo*i);
        }


    }
}
