package Ex_07;

public class Livro {

    private String titulo;
    private String autor;
    private String categoria;
    private int numPaginas;
    private String isbn;


    //Construtor

    public Livro(String titulo, String autor, String categoria, int numPaginas, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numPaginas = numPaginas;
        this.isbn = isbn;
    }


    public void exibirDetalhes(){

        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Número de páginas: " + this.numPaginas);
        System.out.println("ISBN: " + this.isbn);
    }
}
