public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro(80);
        Onibus onibus = new Onibus(60);
        Bicicleta bicicleta = new Bicicleta(10);

        double distancia = 100;

        System.out.println("Carro: " + carro.calcularTempoDeViagem(distancia) + " horas");
        System.out.println("Ônibus: " + onibus.calcularTempoDeViagem(distancia) + " horas");
        System.out.println("Bicicleta: " + bicicleta.calcularTempoDeViagem(distancia) + " horas");
    }
}
