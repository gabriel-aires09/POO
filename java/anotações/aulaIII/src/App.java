import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = new int[5];
        numeros[0] = 100;
        numeros[1] = 200;
        numeros[2] = 300;
        numeros[3] = 400;
        numeros[4] = 500;

        int[] numbers = {1, 2, 3, 4, 5};

        for (int numero : numbers) {
            System.out.print(numero + " ");
        }
        List<String> nomes = new ArrayList<>();
        nomes.add("Gabriel");
        nomes.add("Sonza");
        nomes.add("Admin");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        List<Double> alturas = new ArrayList<>();
        alturas.add(1.66);
        alturas.add(1.77);
        alturas.add(1.88);

        for (Double altura : alturas) {
            System.out.println(altura);
        }
        List<Double> alturasNew = List.of(1.77, 1.66, 1.78);

        // for (int i = 0; i < alturasNew.size(); ++i) {
        //     System.out.print(alturasNew.get(i) + " ");
        // }
        for (Double altura : alturasNew) {
            System.out.print(altura + " ");
        }
    }
}
