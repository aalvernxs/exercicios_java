public class TesteContaCorrente {
    public static void main(String[] args) {
        contaCorrente conta1 = new contaCorrente();
        conta1.numConta = 12345;
         conta1.nomePossuidor = "João da Silva";
         conta1.saldo = 1000.0;
        conta1.limite = 500.0;
        conta1.tipoConta = 'S';


        System.out.println("Nome do Possuidor: " + conta1.nomePossuidor);
        System.out.println("Número da conta: " + conta1.saldo);
        System.out.println("Saldo da conta: " + conta1.saldo);
        System.out.println("Limite da conta: " + conta1.limite);
        System.out.println("Tipo da conta: " + conta1.tipoConta + " :Conta Special");


    }
}
