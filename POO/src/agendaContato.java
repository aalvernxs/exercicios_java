public class agendaContato {
    public static void main(String[] args) {

        Contato contato1 = new Contato();

        contato1.nome = "Eduardo";
        contato1.email="DuduMaxxing@gmail.com";

         contato1.telefones = new String[5];

        contato1.telefones[0] = "456-1234";
        contato1.telefones[1] = "456-1235";

        System.out.println(contato1.nome);
        System.out.println(contato1.email);
        System.out.println(contato1.telefones[0]);
        System.out.println(contato1.telefones[1]);


    }
}
