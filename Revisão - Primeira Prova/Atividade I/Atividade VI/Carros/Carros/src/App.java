public class App {
    public static void main(String[] args) throws Exception {
       Consessionaria consessionaria = new Consessionaria();

        Carro carro1 = new Carro("Fiat", "Uno", "Azul", 2013);

        consessionaria.adicionarCarros(carro1);

        for (Carro carro : consessionaria.getCarros()){
            System.out.println(carro);
        }
    }
}
