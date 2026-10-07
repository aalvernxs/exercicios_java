import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Sistema Estundantil ");
        System.out.println("Digite o nome do aluno: ");
        aluno.nome = Scan.nextLine();
        System.out.println("Digite a matricula do aluno: ");
        aluno.numMatricula = Scan.nextDouble();
        Scan.nextLine();

        System.out.println("Digite o sexo do aluno (M - Masculino, F - Feminino): ");
        aluno.sexo = Scan.nextLine();
        System.out.println("Digite o curso do aluno: ");
        aluno.curso = Scan.nextLine();
        System.out.println("Digite a disciplina 1 do aluno: ");
        aluno.disciplina1 = Scan.nextLine();
        System.out.println("Digite a disciplina 2 do aluno: ");
        aluno.disciplina2 = Scan.nextLine();
        System.out.println("Digite a disciplina 3 do aluno: ");
        aluno.disciplina3 = Scan.nextLine();
        System.out.println("Digite a nota 1 do aluno: ");
        aluno.nota1 = Scan.nextDouble();
        System.out.println("Digite a nota 2 do aluno: ");
        aluno.nota2 = Scan.nextDouble();
        System.out.println("Digite a nota 3 do aluno: ");
        aluno.nota3 = Scan.nextDouble();

        System.out.println("OUTPUT DO ALUNO ");
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Matricula: " + aluno.numMatricula);
        System.out.println("Sexo: " + aluno.sexo);
        System.out.println("Curso: " + aluno.curso);
        if (aluno.estaAprovado(aluno.nota1)) {
            System.out.println(aluno.disciplina1 + ": Aprovado");
        } else {
            System.out.println(aluno.disciplina1 + ": Reprovado");
        }

        if (aluno.estaAprovado(aluno.nota2)) {
            System.out.println(aluno.disciplina2 + ": Aprovado");
        } else {
            System.out.println(aluno.disciplina2 + ": Reprovado");
        }

        if (aluno.estaAprovado(aluno.nota3)) {
            System.out.println(aluno.disciplina3 + ": Aprovado");
        } else {
            System.out.println(aluno.disciplina3 + ": Reprovado");
        }





    }
}
