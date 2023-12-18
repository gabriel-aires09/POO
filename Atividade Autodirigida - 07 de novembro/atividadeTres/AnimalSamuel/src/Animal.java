import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String nome;
    private Integer idade;
    private double tamanho;
    private String dieta;
    private String habitat;
    private List<Mamifero> mamiferos; 
    private List<Reptil> reptil;
    private List<Ave> ave;
    
    public Animal(String nome, Integer idade, double tamanho, String dieta, String habitat) {
        this.nome = nome;
        this.idade = idade;
        this.tamanho = tamanho;
        this.dieta = dieta;
        this.habitat = habitat;
        this.mamiferos = new ArrayList<>();
        this.reptil = new ArrayList<>();
        this.ave = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public double getTamanho(){
        return tamanho;
    }

    public String getDieta(){
        return dieta;
    }

    public String habitat(){
        return habitat;
    }

    public List<Mamifero> getMamiferos() {
        return mamiferos;
    }

    public List<Reptil> getReptil() {
        return reptil;
    }

    public List<Ave> getAve() {
        return ave;
    }

    public void addMamiferos(Mamifero mamifero){
        this.getMamiferos().add(mamifero);
    }

    public void addReptil(Reptil reptil){
        this.getReptil().add(reptil);
    }
    
    public void addAve(Ave ave){
        this.getAve().add(ave);
    }

    public void mostrarMamiferos(){
        for (Animal mamifero : getMamiferos()){
            System.out.println("Nome: " + mamifero.nome + "\nTamanho: " +mamifero.tamanho + "\nDieta: " + mamifero.dieta + "\nHabitat: " + mamifero.habitat);
        }
    }

    public void mostrarReptil(){
        for (Animal reptil : getReptil()){
            System.out.println("Nome: " + reptil.nome + "\nTamanho: " + reptil.tamanho + "\nDieta: " + reptil.dieta + "\nHabitat: " + reptil.habitat);
        }
    }

    public void mostrarAve(){
        for (Animal ave : getAve()){
            System.out.println("Nome: " + ave.nome + "\nTamanho: " +ave.tamanho + "\nDieta: " + ave.dieta + "\nHabitat: " + ave.habitat);
        }
    }
} 
