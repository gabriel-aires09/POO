/*
 * Crie classes para diferentes tipos de produtos, como Alimento, 
 * Eletrônico e Vestuário. Implemente um método para calcular o preço 
 * final considerando impostos específicos para cada categoria.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Produtos produtos = new Produtos(null, null, null, 0);
        Alimento alimento1 = new Alimento("Maçã", "Alimento", 10, 4.99);
        produtos.adicionarProdutos(alimento1);

        Eletronico laptop1 = new Eletronico("Acer Nitro 5", "Eletronico", 2, 3.999);
        produtos.adicionarProdutos(laptop1);

        Vestuario vestuario1 = new Vestuario("Bermuda", "Vestuario", 30, 39.99);
        produtos.adicionarProdutos(vestuario1);

        Scanner teclado = new Scanner(System.in);
        System.out.println("A MAGALU é aqui antes de falir!\n");
        System.out.println("Digite a opção desejada: \n1 - Mostrar alimentos disponiveis \n2 - Aplicar imposto e mostrar preço final [1-2]: ");
        String opcao = teclado.nextLine();


        switch(opcao){
            case "1":;
                produtos.mostrarProdutos();
                break;
            case "2":
                produtos.aplicarImposto();
                break;
            default:
                System.out.println("Selecione uma opção disponível!");
        }
        teclado.close();
    }
}
