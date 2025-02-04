package Ex_01;

public class Musica {

 ///Atributos
    private String titulo;
    private String genero;
    private String artista;
    private int duracao;


    //Construtor
    public Musica(String titulo, String genero, String artista, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void detalhesMusica(){
    System.out.println("Titulo: " + this.titulo + "| Gênero: " + this.genero + "| Artista: " + this.artista + "| Duração: " + this.duracao);

}

}
