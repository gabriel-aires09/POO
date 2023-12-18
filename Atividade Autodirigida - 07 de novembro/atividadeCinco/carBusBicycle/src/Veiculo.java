public abstract class Veiculo {
    protected double velocidadeMedia;

    public Veiculo(double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public abstract double calcularTempoDeViagem(double distancia);
    
}
