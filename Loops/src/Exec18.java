import java.util.Scanner;

public class Exec18 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int velocidade;
        int soma = 0;
        int menor = 0;
        int maior = 0;

        System.out.println("Digite a quantidade de velocidades a serem analisadas");
        int n = scan.nextInt();

        for (int i = 1; i <=n; i++){
            do {
                System.out.println("Digite a velocidade atingida");
                velocidade = scan.nextInt();
            } while(velocidade < 0 || velocidade > 300);

            soma+=velocidade;


                if (i == 1) {
                    maior = velocidade;
                    menor = velocidade;

                } else {
                    if (velocidade > maior) {
                        maior = velocidade;
                    }

                    if (velocidade < menor) {
                        menor = velocidade;
                    }

            }



        }

        System.out.println("A soma das velocidades é igual a " + soma);
        System.out.println("A maior velocidade é " + maior);
        System.out.println("A menor velocidade é  " + menor);
        
    }
}
