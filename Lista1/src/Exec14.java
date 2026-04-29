import java.util.Scanner;
public class Exec14 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        double pesoPeixes = 0;
        double excesso = 0;
        double multa = 0;


        System.out.println("Digite o peso dos peixes pescados: ");
        pesoPeixes = scan.nextDouble();

        if (pesoPeixes > 50){
        excesso = pesoPeixes - 50;

       multa = excesso * 4;

       System.out.println("O excesso de peixes foi de : " + excesso + "kg");
       System.out.println("A multa a ser paga é de R$" + multa );


        }else {
            System.out.println("Não houve excesso e nem multa");
        }


    }
}
