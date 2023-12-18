
import java.util.ArrayList;
import java.util.List;

public class Consessionaria {

    public List<Carro> carros;
    

    public Consessionaria() {
        carros = new ArrayList<>();
    }

    public void adicionarCarros(Carro carro) {
        carros.add(carro);
    }

    public List<Carro> getCarros(){
        return carros;
    }
}
