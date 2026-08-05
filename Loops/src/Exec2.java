import java.util.Objects;
import java.util.Scanner;

public class Exec2 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String nome;
        String senha;

        do {
            System.out.println("Digite o seu nome: ");
            nome = scan.nextLine();

            System.out.println("Digite a sua senha: ");
            senha = scan.nextLine();

        } while (!Objects.equals(nome, senha));
            System.out.println("Acesso autorizado");



    }
}
