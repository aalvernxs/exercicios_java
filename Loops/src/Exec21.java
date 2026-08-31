import java.util.Scanner;
public class Exec21 {
    public static void main (String[] args){

        Scanner scan = new Scanner (System.in);

        int chassi;

        System.out.print("Digite o número do chassi: ");
        chassi = scan.nextInt();

        boolean primo = true;

        for(int i = 2; i < chassi; i++){

            if(chassi % i == 0){
                primo = false;
                System.out.println("O número é divisivel por " + i);

            }

            }
        if (primo){
            System.out.println("O número do chassi " + chassi + " é primo.");
        } else {
            System.out.println("O número do chassi " + chassi + " não é primo.");
        }
        }

    }


