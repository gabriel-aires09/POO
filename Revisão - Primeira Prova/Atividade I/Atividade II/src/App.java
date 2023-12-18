// Crie uma calculadora simples que permite ao usuário realizar operações básicas (+, -, *, /) entre dois números.
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Calculadora do mal. Cuidado que a bicha é mais perigosa que o software SUEDE!!!!! \n");
        System.out.println("Digite o primeiro número: \n");
        Integer numeroUm = teclado.nextInt();

        System.out.println("Digite a operação desejada [+ - * /]: \n");
        String operacao = teclado.next();
        Operacoes opera = new Operacoes();

        System.out.println("Digite o segundo número: \n");
        Integer numeroDois = teclado.nextInt();

        switch(operacao){
            case "+":
                opera.adicao(numeroUm, numeroDois);
                break;
            case "-":
                opera.subtracao(numeroUm, numeroDois);
                break;
            case "*":
                opera.multiplicacao(numeroUm, numeroDois);
                break;
            case "/":
                opera.divisao(numeroUm, numeroDois);
                break;
        }
        teclado.close();
    }
}
