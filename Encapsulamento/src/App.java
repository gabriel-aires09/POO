public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();
        
        conta.numero_de_conta = 6677;
        conta.titular = "Francisco";
        



        boolean resultado = conta.sacar(50.00f);

        if (resultado) {
            System.out.println("Saque realizado com sucesso.");
            System.out.println("Numero de conta: " + conta.numero_de_conta + "\n" + "Titular: " + conta.titular + "\n" + "Saldo: R$" + conta.getSaldo());
        }
    }
}
