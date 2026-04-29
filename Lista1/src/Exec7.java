import java.util.Scanner;

public class Exec7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double ganhoHora = scan.nextDouble();

        System.out.println("Quantas horas você trabalhou nesse mês? ");
        double horas = scan.nextDouble();

        double salario = ganhoHora * horas;

        System.out.println("Seu salário mensal é: " + salario);

    }
}
