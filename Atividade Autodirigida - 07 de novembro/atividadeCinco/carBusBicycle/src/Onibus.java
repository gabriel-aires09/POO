public class Onibus extends Veiculo {
    public Onibus(double velocidadeMedia) {
        super(velocidadeMedia);
    }

    @Override
    public double calcularTempoDeViagem(double distancia) {
        return distancia / velocidadeMedia * 1.1;
    }
    
}
