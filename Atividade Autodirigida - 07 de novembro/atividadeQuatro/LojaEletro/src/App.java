/*
 * Crie classes para diferentes produtos eletrônicos, como Smartphone, Laptop e Smart TV. 
 * Implemente métodos para calcular o desconto com base na marca e modelo.
 */



public class App {
    public static void main(String[] args) throws Exception {
        Produtos produto = new Produtos(null, null, null, 0);

        Smartphone smartphone = new Smartphone("Samsung", "S23", 011123456, 2.500);
        Laptop laptop = new Laptop("Apple","Air M3", 66666678, 7.999);
        SmartTV smartv = new SmartTV("TCL", "50P635", 235509000, 1.899);

        produto.addProdutos(smartphone);
        produto.addProdutos(laptop);
        produto.addProdutos(smartv);
        
        produto.aplicarDescontos();

    }
}
