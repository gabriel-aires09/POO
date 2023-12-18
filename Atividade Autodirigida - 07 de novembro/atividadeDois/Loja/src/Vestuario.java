public class Vestuario extends Produtos {

    public Vestuario(String nome, String categoria, Integer quantidade, double preco) {
        super(nome, categoria, quantidade, preco);
    }

    private double impostoVestuario;

    public double getImpostoVestuario(){
        return impostoVestuario;
    }
 
}
