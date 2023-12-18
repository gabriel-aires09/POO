/*
 * Faça um CRUD (Create, Read, Update, Delete) de funcionários considerando boas práticas de herança e polimorfismo. 
 * Crie um sistema simples de gerenciamento de funcionários que inclui diferentes tipos de funcionários, como funcionários em 
 * tempo integral e meio período, além de funcionários CLT e PJ.

Crie uma classe principal que gerencie uma lista de funcionários e realiza as operações de CRUD, como adicionar, listar, atualizar e excluir funcionários.

Use um ArrayList para armazenar os funcionários.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Funcionarios funcionario = new Funcionarios(null, null, null, null, 0, false, false, null);
        Funcionarios funcionario1 = new Funcionarios("Gabriel Aires", 19, "05222255100", "Analista de Sistemas", 5.500, true, true, null);
        funcionario.adicionar(funcionario1);

        System.out.println("CRUD - CREATE READE UPDATE DELETE");
        System.out.println("O aplicativo mais avançado de gerenciamento de funcionários");
        System.out.println("Digite o que você deseja fazer: \n1 - Listar funcionarios \n2 - Adicionar funcionarios \n3 - Remover funcionarios \n4 - Sair");
        String opcao = entrada.nextLine();

        while (true){
            if (opcao.equals("1")){
                funcionario.mostrarFuncionarios();
                break;
            } else if (opcao.equals("2")){
                funcionario.adicionarFuncionarios();
                System.out.println("Deseja continuar adicionando? S - N");
                opcao = entrada.nextLine().toUpperCase();
                if (opcao.equals("N")) {
                    break;
                }
            } else if (opcao.equals("3")){
                funcionario.removerFuncionarios();
                break;
            } else if (opcao.equals("4")){
                System.out.println("Obrigado por usar nosso app e ate mais");
                break;
            } else {
                System.out.println("Digite um valor valido");
                break;

            }
        }
        
    }

}
