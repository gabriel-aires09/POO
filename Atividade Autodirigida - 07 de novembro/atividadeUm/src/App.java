import java.util.Scanner;

/*Crie uma classe para representar uma conta corrente, com métodos para depositar uma quantia, sacar uma quantia e obter o saldo. Para cada saque será debitada 
também uma taxa de operação equivalente à 0,5% do valor sacado. Crie, em seguida, uma subclasse desta classe anterior para representar uma conta corrente de um cliente 
especial. Clientes especiais pagam taxas de operação de apenas 0,1% do valor sacado. Faça testes com as duas classes e verifique seus resultados.
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Conta conta = new Conta(6214, 7777, 0);
        ContaEspecial contaEspecial = new ContaEspecial(6214, 7777, 0);

        System.out.println("Digite uma das seguintes opções:  \n1 - Mostrar informações da conta\n2 - Realizar saque\n3 - Depositar\n");

        String opcao = teclado.nextLine();

        switch(opcao) {
            case "1":
                System.out.println("Conta: " + conta.getConta() + "\nAgencia: " + conta.getAgencia() + "\nSaldo: " + conta.getSaldo());
                break;
            case "2":
                System.out.println("É conta especial? ");
                String entradaConta = teclado.nextLine().toUpperCase();

                if (entradaConta == "SIM"){
                    System.out.println("Conta especial");
                    System.out.println("Digite um valor para saque: ");
                    double saqueEspecial = teclado.nextDouble();
                    contaEspecial.sacarContaEspecial(saqueEspecial);

                }
                else{
                    System.out.println("Conta normal.\n");
                    System.out.println("Digite o valor para saque: ");
                    double saque = teclado.nextDouble();
                    conta.sacar(saque);
                }
            case "3":
                System.out.println("Digite um valor para deposito");
                double deposito = teclado.nextDouble();
                conta.depositar(deposito);
        }
        teclado.close();
    }
 
}
