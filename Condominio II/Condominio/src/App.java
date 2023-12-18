import java.util.Scanner;
import java.util.concurrent.locks.Condition;

public class App {
    public static void main(String[] args) throws Exception {
        Condominio ambience = new Condominio("Ambience");
        Apartamento apt1 = new Apartamento(1, true);
        Apartamento apt2 = new Apartamento(2, false);
        Apartamento apt3 = new Apartamento(3, false);
        Apartamento apt4 = new Apartamento(4, true);
        Apartamento apt5 = new Apartamento(5, true);

        ambience.addApto(apt1);
        ambience.addApto(apt2);
        ambience.addApto(apt3);
        ambience.addApto(apt4);
        ambience.addApto(apt5);

        Scanner teclado = new Scanner(System.in);

        System.out.println("------ Menu -----");
        System.out.println("Digite a opção desejada:");
        System.out.println("1 - Reservar unidade \n2 - Ver todas as unidades");

        String opcao = teclado.next();
        System.out.println("Opcao digitada " +opcao);

        switch(opcao){
            case "1":
            System.out.println("Você seleciou a opção "+ opcao);
            ambience.retornarAptosDisponiveis();
            System.out.println("Informe o nº do apartamento que deseja ocupar: ");
            String aptoSelecionado = teclado.next();

            System.out.println("Prossiga com as informações do Locatário/Proprietário");
            System.out.println("Digite 1 para aluguel ou 2 para cadastrar o dono do apartamento");

            String locatarioOuDono = teclado.next();

            System.out.println("Digite o nome: ");
            String nome = teclado.next();
            System.out.println("Digite o cpf: ");
            String cpf = teclado.next();
            System.out.println("Digite o telefone: ");
            String telefone = teclado.next();
            System.out.println("Digite o endereco: ");
            String endereco = teclado.next();

            Locatario locatario = new Locatario(nome, endereco, telefone, cpf);

            ambience.ocuparUnidade(aptoSelecionado, locatario);

            locatario.exibirInformacoes();
            break;
        }
    }
  
}
