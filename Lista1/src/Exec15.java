import java.util.Scanner;

public class Exec15 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quanto você ganha por hora: ");
        double ganhoHora = scan.nextDouble();

        System.out.println("Digite quantos horas você trabalhou esse mês: ");
        double horaDoMes = scan.nextDouble();

        double salarioBruto = ganhoHora * horaDoMes;
        double impostoRenda = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;

        System.out.println("O seu salário bruto é de R$" + salarioBruto);
        System.out.println("O valor do imposto de renda é de R$" + impostoRenda);
        System.out.println("O valor do INSS é de R$" + inss);
        System.out.println("O valor do sindicato é de R$" + String.format("%.1f", sindicato));
        System.out.println("O seu salário líquido é de R$" + salarioLiquido);
    }
}
