public class Eletronico extends Produtos {

    public Eletronico(String nome, String categoria, Integer quantidade, double preco) {
        super(nome, categoria, quantidade, preco);
    }

    private double impostoEletronico;

    public double getImpostoEletronico(){
        return impostoEletronico;
    }
}
