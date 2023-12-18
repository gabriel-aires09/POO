public class Carro extends Veiculo {

    public Carro(double velocidadeMedia) {
        super(velocidadeMedia);

    }
    @Override
    public double calcularTempoDeViagem(double distancia) {
        return distancia / velocidadeMedia;
    }

    
}
