import java.util.Scanner;

public class Exec16 {
    public static void main(String[] args){

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite a área em Metros quadrados a ser pintada: ");
        double area = scan.nextDouble();

        double areaEmLitros = area / 3.0;


        // double areaDeTinta = (int) Math.ceil(areaEmLitros / 18.0);
        //Arredodamento para cima via metodo


        //arrendondamento para cima via lógica
        int areadeTinta = (int) (areaEmLitros / 18.0);
        if (areaEmLitros % 18 != 0) {
            areadeTinta++;
        }

        double custoTotal = areadeTinta * 80;

        System.out.println("Deverá ser comprado " + areaEmLitros + " latas de tinta.");
        System.out.println("O custo total é de R$ " + custoTotal);


    }
}
