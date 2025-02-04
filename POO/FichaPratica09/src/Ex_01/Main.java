package Ex_01;

public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica("The Scientist", "Rock Alternativo", "Coldplay", 2600);
        Musica musica2 = new Musica("Bohemian Rapsody", "Rock", "Queen", 359);
        Musica musica3 = new Musica("Mestre da Culinária", "Pimba", "Quim Barreiros", 233);
        Musica musica4 = new Musica("As It Was", "Pop", "Harry Styles", 600);
        Musica musica5 = new Musica("You Belong With Me", "Pop", "Taylor Swift", 480);
        Musica musica6 = new Musica("Fix You", "Pop", "Coldplay", 580);

        MusicPlayer programacao = new MusicPlayer();

        programacao.adicionarMusica(musica1);
        programacao.adicionarMusica(musica2);
        programacao.adicionarMusica(musica3);
        programacao.adicionarMusica(musica4);
        programacao.adicionarMusica(musica5);
        programacao.adicionarMusica(musica6);


        programacao.imprimirRelatorio();

        programacao.trocarMusica(0,musica6);
        programacao.trocarMusica(5,musica1);

        programacao.removerMusica(3);

        programacao.imprimirRelatorio();

        programacao.duracao();


        programacao.removerTodasMusica();
        programacao.imprimirRelatorio();
    }
}
