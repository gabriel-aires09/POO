public class App {
    public static void main(String[] args) throws Exception {
        Estoque estoque_supermercado = new Estoque();



        Produto leite = new Produto("Leite Itambé", true, 30);
        Produto extrato_tomate = new Produto("Extrato de Tomate Quero", true, 50);
        Produto arroz = new Produto("Arroz Tio João", true, 100);
        Produto feijao = new Produto("Feijão Carioca Camil", true, 40); // Corrigida a falta da vírgula
        Produto manteiga = new Produto("Manteiga Porto Alegre", true, 10); // Corrigida a falta da vírgula
        Produto vassoura = new Produto("Vassoura Real", false, 15);
        Produto rodo = new Produto("Rodo Limpol", false, 15);
        Produto saco_lixo = new Produto("Saco de Lixo Preto 20L", false, 35);
        Produto miojo = new Produto("Miojo Nissan", true, 0);
        Produto novoProduto = estoque_supermercado.inserirProduto();


        estoque_supermercado.cadastrarProduto(leite);
        estoque_supermercado.cadastrarProduto(extrato_tomate);
        estoque_supermercado.cadastrarProduto(arroz);
        estoque_supermercado.cadastrarProduto(feijao);
        estoque_supermercado.cadastrarProduto(manteiga);
        estoque_supermercado.cadastrarProduto(vassoura);
        estoque_supermercado.cadastrarProduto(rodo);
        estoque_supermercado.cadastrarProduto(saco_lixo);
        estoque_supermercado.cadastrarProduto(miojo);
        estoque_supermercado.cadastrarProduto(novoProduto);
        estoque_supermercado.exibirProdutosPereciveis();
        estoque_supermercado.exibirProdutosNaoPereciveis(); // Corrigida a chamada do método
        estoque_supermercado.exibirProdutosEmFalta();
        estoque_supermercado.exibirQuantidadeProdutosCadastrados();
    }

}
