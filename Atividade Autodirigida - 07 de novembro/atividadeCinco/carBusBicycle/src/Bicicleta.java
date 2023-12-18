public class Bicicleta extends Veiculo {
    public Bicicleta(double velocidadeMedia) {
        super(velocidadeMedia);
    }

    @Override
    public double calcularTempoDeViagem(double distancia) {
        return distancia / velocidadeMedia * 2;
    }
}
