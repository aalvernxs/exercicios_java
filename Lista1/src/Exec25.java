import java.util.Scanner;
public class Exec25 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o combustivel a ser usado (A parAa Alcol ou G para Gasolina): ");
        String combustivel = scan.nextLine();

        System.out.println("Digite a quantidade de litros a ser abastecida: ");
        double litros = scan.nextDouble();

        double precolitro = 0;
        double valorBruto = 0;
        double desconto = 0;
        double valorFinal;

        if (combustivel.equalsIgnoreCase("A")){
            precolitro = 1.90;
        } else if  (combustivel.equalsIgnoreCase("G")){
            precolitro = 2.50;
        }

        if (litros <=  20 && combustivel.equalsIgnoreCase("A")){
            desconto = 0.03;
        } else if (litros > 20 && combustivel.equalsIgnoreCase("A")){
            desconto = 0.05;
        } else if (litros <= 20 && combustivel.equalsIgnoreCase("G")){
            desconto = 0.04;
        } else if (litros > 20 && combustivel.equalsIgnoreCase("G")){
            desconto = 0.06;
        }

        valorBruto = litros * precolitro;

        valorFinal = valorBruto - (valorBruto * desconto);

        System.out.println("O valor a ser pago é: R$ " + valorFinal);


    }
}
