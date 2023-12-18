public class Triangulo extends FiguraGeometrica {

    private double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double calcularArea(){
        return (Math.sqrt(3)/ 4) * lado * lado;
    }

    public double calcularPerimetro(){
        return 3 * lado;
    }

}
