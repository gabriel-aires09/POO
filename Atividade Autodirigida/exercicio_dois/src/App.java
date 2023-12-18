import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do animal: ");
        String nome = scanner.nextLine();
        
        System.out.println();
        System.out.println("Informe a classe do animal: ");
        String classe = scanner.nextLine();

        System.out.println("Informe a família do animal: ");
        String familia = scanner.nextLine();

        AnimalVirtual animal = new AnimalVirtual(nome, classe, familia, 0, true, 10, 10);


        while (animal.estaVivo()) {
            System.out.println("\nSelecione uma ação:\n1. Comer\n2. Correr\n3. Dormir\n4. Exibir estado do animal");
            int opcao = 0;
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido.");
            }

            switch (opcao) {
                case 1:
                    animal.comer();
                    break;
                case 2:
                    animal.correr();
                    break;
                case 3:
                    animal.dormir();
                    break;
                case 4:
                    animal.exibirEstado();
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }

            if (animal.calorias <= 0 || animal.forca <= 0) {
                animal.morrer();
            }
        }

        System.out.println("Fim do jogo.");
        scanner.close();
    }   
}
