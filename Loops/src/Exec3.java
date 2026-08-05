import java.util.Scanner;
public class Exec3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;

        do{
            System.out.println("Digite o seu nome: ");
            nome = scan.nextLine();

            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();

            System.out.println("Digite seu salário: ");
            salario = scan.nextDouble();

            System.out.println("Digite seu sexo: ");
            sexo = scan.next().charAt(0);

            System.out.println("Digite seu estado civil: ");
            estadoCivil = scan.next().charAt(0);

        } while(nome.length() <= 3 || idade < 0 || idade > 150 || salario <= 0 || sexo != 'f' && sexo != 'm' || estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');






    }
}
