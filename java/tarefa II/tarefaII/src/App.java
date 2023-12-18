import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite um número: ");
        int a = input.nextInt();
        System.out.printf("Digite o operador aritmético: ");
        char operador = input.next().charAt(0);
        System.out.printf("Digite outro numero: ");
        int b = input.nextInt();

        if (operador == '+') {
            System.out.printf("%d + %d = %d", a, b, (a + b));
        } else if (operador == '-'){
            System.out.printf("%d - %d = %d", a, b, (a - b));
        } else if (operador == '*'){
            System.out.printf("%d * %d = %d", a, b, (a * b));
        } else {
            System.out.printf("%d / %d = %d", a, b, (a / b));
        }

        System.out.printf("Digite um numero: ");
        int contagem = input.nextInt();

        for (int i = contagem; i > 0; --i) {
            System.out.printf("%d ", i);
        }

        while (contagem > 1) {
            --contagem;
            System.out.printf("%d ", (contagem + 1));
        }
    input.close();
    }
}
