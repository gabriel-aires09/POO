import java.util.ArrayList;
import java.util.List;

public class Produtos {
    private String marca;
    private String modelo;
    private Integer numeroSerie;
    private double preco;
    private List<Produtos> produtos;

    
    public Produtos(String marca, String modelo, Integer numeroSerie, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.preco = preco;
        this.produtos = new ArrayList<>();
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getNumeroSerie() {
        return numeroSerie;
    }

    public double getPreco() {
        return preco;
    }

    public List<Produtos> getProdutos(){
        return produtos;
    }

    public void addProdutos(Produtos produto){
        this.getProdutos().add(produto);    
    }

    public void aplicarDescontos(){
        for (Produtos produto : getProdutos()){
            if (produto.marca == "Samsung"){
                double desconto = produto.preco * 0.25;
                System.out.println("Desconto Samsung: " + desconto);
                produto.preco -= desconto;
            } else if (produto.marca == "Apple") {
                double desconto = produto.preco * 0.10;
                System.out.println("Desconto Apple: " + desconto);
                produto.preco -= desconto;     
            } else if (produto.marca == "TCL") {
                double desconto = produto.preco * 0.40;
                System.out.println("Desconto TCL: " + desconto);
                produto.preco -= desconto;
            }
            System.out.println("----------------------------------------");
            System.out.println("Marca: " + produto.marca + "\nModelo: " + produto.modelo + "\nN de serie: " + produto.numeroSerie  + "\nPreco com desconto: " + produto.preco);
        }
    }
}
