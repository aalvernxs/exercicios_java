import java.util.Scanner;

public class Exec13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double pesoIdeal = 0;

        System.out.println("Digite a sua altura: ");
        double h = scan.nextDouble();
        
        System.out.println("Digite o seu sexo (M/F): ");
        char sexo = scan.next().charAt(0);

        if (sexo == 'M' || sexo == 'm'){
             pesoIdeal = (72.7 * h ) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
             pesoIdeal  = (62.1 * h) - 44.7;
        } else {
            System.out.println("Sexo inválido. Por favor, digite 'M' para masculino ou 'F' para feminino.");
        }

        System.out.println("O seu peso ideal é: " + String.format("%.2f", pesoIdeal));

        System.out.println("Digite o seu peso atual: ");
        double pesoAtual = scan.nextDouble();



        if (pesoAtual > pesoIdeal ){
            System.out.println("Você está acima do peso ideal.");
        } else if (pesoAtual < pesoIdeal ) {
            System.out.println("Você está abaixo do peso ideal.");
        } else {
            System.out.println("Você está no peso ideal.");

        }




        
    }
}
