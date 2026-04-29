import java.util.Scanner;
public class Exec11 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro inteiro: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo inteiro: ");
        int num2 = scan.nextInt();

        System.out.println("Digite o número real: ");
        double num3 = scan.nextDouble();

        double resultadoA = (num1 * 2) * (num2 / 2);
        double resultadoB = (num1 * 3) + num3;
        double resultadoC = (num3 * num3 * num3);

        System.out.println("Os resultados são: " + resultadoA + ", " + resultadoB + " e " + String.format("%.1f", resultadoC));
    }

}
