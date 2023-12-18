import java.util.Scanner;

// Uma biblioteca precisa de um sistema para registrar livros. Crie as classes, objetos dessas classes e armazene-os em uma lista.

public class SistemaBiblioteca {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("A Revolução do Bichos", "George Orwell", 667);
        Livro livro2 = new Livro("1984", "George Orwell", 666);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        System.out.println("Digite o nome do titulo: ");
        String titulo = teclado.nextLine();
        System.out.println("Digite o autor: ");
        String autor = teclado.nextLine();
        System.out.println("Digite o ISBN: ");
        Integer isbn = teclado.nextInt();

        Livro livro3 = new Livro(titulo, autor, isbn);
        biblioteca.adicionarLivro(livro3);

        for (Livro livro : biblioteca.getLivros()) {
            System.out.println(livro);
        }
        teclado.close();
    }
}
