import java.util.Scanner;
public class Exec19 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno: ");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        double nota2 = scan.nextDouble();

        System.out.println("Digite a terceira nota do aluno: ");
        double nota3 = scan.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        if (media == 10){
            System.out.println("Aprovado com distinção e média " + media);
        } else if (media > 7) {
            System.out.println("Aprovado com média " + media);
        } else  {
            System.out.println("Reprovado com média " + media);
        }


    }
}
