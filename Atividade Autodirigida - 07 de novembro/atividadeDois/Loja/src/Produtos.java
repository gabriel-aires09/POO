import java.util.ArrayList;
import java.util.List;

public class Produtos {
    private String nome;
    private String categoria;
    private Integer quantidade;
    private double preco;
    private List<Produtos> produto;
    
    public Produtos(String nome, String categoria, Integer quantidade, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria(){
        return categoria;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }
    public List<Produtos> getProdutos(){
        return produto;
    }

    public void adicionarProdutos(Produtos produto){
        this.getProdutos().add(produto);
    }

    public void aplicarImposto(){
        for (Produtos produto : getProdutos()){
            if (produto.categoria == "Alimento"){
                double imposto = produto.preco * 0.10;
                produto.preco += imposto;
                System.out.println("Preço final Alimento com imposto: " + produto.preco);
            } else if (produto.categoria == "Eletronico") {
                double imposto = produto.preco * 0.17;
                produto.preco += imposto;
                System.out.println("Preço final Eletronico com imposto: " + produto.preco);     
            } else if (produto.categoria == "Vestuario") {
                double imposto = produto.preco * 0.15;
                produto.preco += imposto;
                System.out.println("Preço final Vestuario com imposto: " + produto.preco);
            }
        }
    }

    public void mostrarProdutos(){
        for (Produtos produto : getProdutos()){
            System.out.println("-----------------------------------------\n");
            System.out.println("Nome: " + produto.nome + "\nCategoria: " + produto.categoria + "\nQuantidade: " + produto.quantidade + "\nPreco: " + produto.preco);
        }
    }

}
