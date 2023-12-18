public class Retangulo extends FiguraGeometrica {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularArea(){
        return largura * altura;
    }

    public double calcularPerimetro(){
        return 2 * (largura + altura);
    }
    

    
}
