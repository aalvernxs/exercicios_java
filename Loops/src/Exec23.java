import java.util.Scanner;
public class Exec23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de vistorias feitas no dia: ");
        int vistorias = scan.nextInt();

        double soma=0;
        double media =0;

        for (int i=1; i <= vistorias; i++) {
            System.out.println("Digite a nota da vistoria: ");
            double nota = scan.nextDouble();

            soma += nota;
        }

        media = soma / vistorias;

        System.out.println("A média das vistorias feitas hoje é " + media);




    }
}
