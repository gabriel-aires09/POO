import java.util.ArrayList;
import java.util.List;

public class Condominio {
    public String nome;
    public String endereco;
    List<Apartamento> apartamentos;
    
    public Condominio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    public void addApartamento(Apartamento apto) {
        this.apartamentos.add(apto);
    }
}
