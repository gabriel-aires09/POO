
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import java.util.Scanner;

public class tarefaTres {
    public static void main(String[] args) throws Exception {

        // Atividade I
        //Scanner input = new Scanner(System.in);
        List<Integer> listaInteiros = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // Atividade II
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o indice para substituição: ");
        int index = input.nextInt();
        System.out.println("Agora digite o número a ser substituído: ");
        int inteiro = input.nextInt();
    
        listaInteiros.add(index, inteiro);

        // Atividade III
        List<Integer> listaDaBaguncinha = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Lista normal: " + listaDaBaguncinha);
        Collections.shuffle(listaDaBaguncinha);
        System.out.println("Lista do mal: " + listaDaBaguncinha);

        // Atividade IV
        List<Integer> lista1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> lista2 = new ArrayList<>(List.of(1, 4, 5, 7, 0, 10, 11, 12, 14,5));
        List<Integer> intersecction = encontrarIntersecao(lista1, lista2);

        System.out.println("Numeros de interseção entre as listas: " + intersecction);


        // Atividade V
        List<Double> media = List.of(2.0, 3.0, 4.0, 5.0, 6.0);
        double calculoMedia = calcularMedia(media);
        System.out.println("O calculo da média = " + calculoMedia);


        // Atividade VI
        for (int i = listaInteiros.size() - 1; i >= 0; --i) {
            if (listaInteiros.get(i) % 2 != 0) {  // Verificar se o número é ímpar
                listaInteiros.remove(i);  // Remover o número ímpar
            }
        }
        System.out.println("Lista Filtrada = " + listaInteiros);

    input.close();
    }

    public static List<Integer> encontrarIntersecao(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> intersecao = new ArrayList<>();
    
        for (Integer num1 : lista1) {
            for (Integer num2 : lista2) {
                if (num1.equals(num2)) {
                    intersecao.add(num1);
                    break;
                }
            }
        }
    
            return intersecao;
    }

    public static double calcularMedia(List<Double> numeros) {
  
        if (numeros == null || numeros.size() == 0) {
            return 0;
        }

        double soma = 0;

        for (double num : numeros) {
            soma += num;
        }

        return soma / numeros.size();
    }
}
