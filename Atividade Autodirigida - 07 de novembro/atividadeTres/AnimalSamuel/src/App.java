/*
 * Crie uma classe Animal com atributos como nome e idade. Crie subclasses como Mamífero, Réptil e 
 * Ave que herdam de Animal e implementam métodos específicos para exibir informações sobre cada tipo de animal.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Animal animalMamifero = new Animal(null, null, 0, null, null);
        Animal animalReptil = new Animal(null, null, 0, null, null);
        Animal animalAve = new Animal(null, null, 0, null, null);
        Scanner entrada = new Scanner(System.in);
        
        Mamifero mamifero1 = new Mamifero("Samuel", 20, 1.66, "Arroz, feijao, carne", "Das profundezas do Project Zomboid");
        animalMamifero.addMamiferos(mamifero1);

        Reptil reptil1 = new Reptil("Largato", 2, 1.20, "isentos", "Floresta");
        animalReptil.addReptil(reptil1);

        Ave ave1 = new Ave("Passaro", 3, 0.60, "Frutas", "Floresta");
        animalAve.addAve(ave1);

        System.out.println("Bem-vindo ao zoológico da Catolouca!");
        System.out.println("\nQuais especies de animais você deseja ver?\n 1 - Mamiferos \n2 - Reptil \n3 - Aves");

        String opcao = entrada.nextLine();


        switch (opcao) {
            case "1":
                animalMamifero.mostrarMamiferos();
                break;
            case "2":
                animalReptil.mostrarReptil();
                break;
            case "3":
                animalAve.mostrarAve();
                break;
            default:
                System.out.println("Digite um valor valido: ");
                break;
        }
        entrada.close();    
    }
}
