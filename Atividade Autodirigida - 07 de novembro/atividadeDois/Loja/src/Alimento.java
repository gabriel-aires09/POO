public class Alimento extends Produtos{
    public Alimento(String nome, String categoria, Integer quantidade, double preco) {
        super(nome, categoria, quantidade, preco);
    }

    private double impostoAlimento;
   
    public double getImposto() {
        return impostoAlimento;
    }
}
