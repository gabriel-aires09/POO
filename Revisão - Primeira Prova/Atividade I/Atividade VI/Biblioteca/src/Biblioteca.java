import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public List<Livro> getLivros(){
        return livros;
    }

}
