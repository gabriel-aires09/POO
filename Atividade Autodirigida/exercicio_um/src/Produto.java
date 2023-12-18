public class Produto {
    String nome;
    boolean perecivel;
    Integer quantidade;
    
    public Produto(String nome, boolean perecivel, Integer quantidade) {
        this.nome = nome;
        this.perecivel = perecivel;
        this.quantidade = quantidade;
    } 

    public String getNome() {
        return nome;
    }

    public boolean isPerecivel() {
        return perecivel; 
    }

    public int getQuantidade() {
        return quantidade;
    }
}
