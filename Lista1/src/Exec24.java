import java.util.Scanner;
public class Exec24 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Responda, já telefonou para a vítima?");
       String resposta = scan.nextLine();

       System.out.println("Responda, já esteve no local do crime?");
        String resposta2 = scan.nextLine();


        System.out.println("Responda, mora perto da vítima?");
        String resposta3 = scan.nextLine();


        System.out.println("Responda, devia para a vítima?");
        String resposta4 = scan.nextLine();


        System.out.println("Responda, já trabalhou com a vítima?");
        String resposta5 = scan.nextLine();

        int contador = 0;



        if (resposta.equalsIgnoreCase("sim")){
            contador++;
        }

        if (resposta2.equalsIgnoreCase("sim")){
            contador++;
        }

        if (resposta3.equalsIgnoreCase("sim")){
            contador++;
        }
        if (resposta4.equalsIgnoreCase("sim")){
            contador++;
        }
        if (resposta5.equalsIgnoreCase("sim")){
            contador++;
        }


        if (contador < 2){
            System.out.println("Inocente");
        } else if (contador == 2){
            System.out.println("Suspeito");
        } else if (contador == 3 || contador == 4) {
            System.out.println("Suspeito");
        } else {
            System.out.println("Culpado");
        }
    }



    }

