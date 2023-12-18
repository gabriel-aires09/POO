public class Carro {
    String marca;
    String modelo;
    String cor;
    Integer ano;


    
    public Carro(String marca, String modelo, String cor, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getCor(){
        return cor;
    }

    public Integer getAno(){
        return ano;
    }

    @Override
    public String toString() {
        return "Marca: "+ marca + " Modelo: " + modelo + " Cor: " + cor +  " Ano: " + ano;
    }
    
}
