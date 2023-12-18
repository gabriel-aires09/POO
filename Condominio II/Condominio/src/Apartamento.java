public class Apartamento {
    public int numero;
    public boolean disponivel;
    public Locatario locatario;
    
    public Apartamento(int numero, boolean disponibilidade) {
        this.numero = numero;
        this.disponivel = disponibilidade;
    }

    public void alocarLocatario(Locatario l){
        this.locatario = l;
        this.disponivel = false;
    }
    
}