public class Animal {
    private String nome;
    private Integer idade;
    private double peso;
    private String habitat;
    
    // Constructor
    public Animal(String nome, Integer idade, double peso, String habitat) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.habitat = habitat;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public String getHabitat() {
        return habitat;
    } 
}
