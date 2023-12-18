public class Mamifero extends Animal {
    public Mamifero(String nome, Integer idade, double tamanho, String dieta, String habitat) {
        super(nome, idade, tamanho, dieta, habitat);
    }
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }


}
