public class Mamifero extends Animal {
    private String corDePele;
    private Integer numeroPatas;
    private String TipoDePelo;
    private String temGlandulasMamarias;
    private Integer periodoGestacao;

    // Constructor
    public Mamifero(String nome, Integer idade, double peso, String habitat, String corDePele, Integer numeroPatas,
        String tipoDePelo, String temGlandulasMamarias, Integer periodoGestacao) {
        super(nome, idade, peso, habitat);
        this.corDePele = corDePele;
        this.numeroPatas = numeroPatas;
        TipoDePelo = tipoDePelo;
        this.temGlandulasMamarias = temGlandulasMamarias;
        this.periodoGestacao = periodoGestacao;
    }

    // Getters
    public String getCorDePele() {
        return corDePele;
    }

    public Integer getNumeroPatas() {
        return numeroPatas;
    }

    public String getTipoDePelo() {
        return TipoDePelo;
    }

    public String getTemGlandulasMamarias() {
        return temGlandulasMamarias;
    }

    public Integer getPeriodoGestacao() {
        return periodoGestacao;
    }  
}
