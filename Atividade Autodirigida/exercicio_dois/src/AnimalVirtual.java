public class AnimalVirtual {
    String nome;
    String classe;
    String familia;
    Integer idade;
    boolean estadoVivo;
    Integer calorias;
    Integer forca;
   
    public AnimalVirtual(String nome, String classe, String familia, Integer idade, boolean estadoVivo, Integer calorias, Integer forca) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = idade;
        this.estadoVivo = estadoVivo;
        this.calorias = calorias;
        this.forca = forca;
    }

    public void comer() {
        if (estadoVivo && calorias < 100) {
            calorias += 10;
            forca -= 2;
            System.out.println(nome + " comeu!");
        }
        else if (!estadoVivo){
            System.out.println(nome + " está morto e não pode comer.");
        }
        else {
            System.out.println(nome + " está saciado.");
        }
    }
    public void correr (){
        if (estadoVivo && calorias > 0 && forca > 0){
            calorias -= 5;
            forca -= 5;
            System.out.println(nome + " correu!");
        }
        else {
            System.out.println(nome + " está exausto e ou morto e não pode correr.");
        }
    }

    public void dormir() {
        if (estadoVivo) {
            forca += 10;
            calorias -= 2;
            System.out.println(nome + " dormiu.");
        } else {
            System.out.println(nome + " está morot e não pode dormir.");
        }
    }

    public void morrer() {
        estadoVivo = false;
        forca = 0;
        System.out.println(nome + " morreu.");
    }

    public void exibirEstado() {
        System.out.println("Nome: " + nome);
        System.out.println("Estado: "+ (estadoVivo ? "Vivo" : "Morto"));
        System.out.println("Calorias: " + calorias);
        System.out.println("Força: " + forca);
    }

    public boolean estaVivo() {
        return estadoVivo;
    }
}
