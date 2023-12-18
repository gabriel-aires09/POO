public class Livro {
    String titulo; 
    String autor;
    Integer isbn;
    
    public Livro(String titulo, String autor, Integer isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public Integer getISBN(){
        return isbn;
    }
}
