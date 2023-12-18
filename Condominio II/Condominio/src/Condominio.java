import java.util.ArrayList;
import java.util.List;

public class Condominio {
    public String nome;
    public List<Apartamento> apartamentos;

    public Condominio(String nome) {
        this.nome = nome;
        apartamentos = new ArrayList<>();
    }
    
    public void addApto(Apartamento apto){
        this.apartamentos.add(apto);
    }

    public void retornarAptosDisponiveis() {
        for (Apartamento apartamento : apartamentos) {
            if(apartamento.disponivel == true){
                System.out.println("Apartamento nº "+ apartamento.numero);
            }   
        }
    }

    public void ocuparUnidade(String numeroApto, Locatario loc){

        for (Apartamento apartamento : apartamentos) {
            if(apartamento.numero == Integer.parseInt(numeroApto)){
                apartamento.alocarLocatario(loc);
            }
        }

    }
}
