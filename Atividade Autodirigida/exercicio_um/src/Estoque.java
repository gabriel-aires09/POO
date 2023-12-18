import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Estoque {
    public List<Produto> produtos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void cadastrarProduto(Produto produto){
        produtos.add(produto);
    }

    public void exibirProdutosPereciveis() {
        System.out.println("Produtos perecíveis: ");
        for (Produto p : produtos) {
            if (p.isPerecivel()) {
                System.out.println(p.getNome());
            }
        }
    }

    public void exibirProdutosNaoPereciveis() {
        System.out.println("\nProdutos não perecíveis: ");
        for (Produto p : produtos) {
            if (!p.isPerecivel()) {
                System.out.println(p.getNome());
            }
        }
    }

    public void exibirProdutosEmFalta() {
        System.out.println("\nProdutos em falta: ");
        for (Produto p : produtos) {
            if (p.getQuantidade() == 0) {
                System.out.println(p.getNome());
            }
        }
    }

    public void exibirQuantidadeProdutosCadastrados() {
        System.out.println("\nQuantidade de produtos cadastrados: " + produtos.size());
    }


    public Produto inserirProduto() {
        System.out.println("Cadastre um novo produto: ");
        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("\nÉ perecível? (Digite true ou false): ");
        boolean perecivel = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("\nQuantidade: ");
        Integer quantidade = scanner.nextInt();

        Produto novoProduto = new Produto(nome, perecivel, quantidade);
        return novoProduto;
            
    }
}
