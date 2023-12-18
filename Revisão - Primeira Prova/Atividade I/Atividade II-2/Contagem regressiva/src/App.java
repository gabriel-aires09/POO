// Peça ao usuário para digitar um número e faça uma contagem regressiva a partir desse número até 1.
import java.lang.Thread;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        Integer numero = teclado.nextInt();

        for (Integer i = 1; numero >= i; --numero){
            Thread.sleep(1000);
            System.out.println(numero);
        }
    teclado.close();
    }
} 
