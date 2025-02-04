package Ex_01;

import java.util.ArrayList;

public class MusicPlayer {


   private ArrayList<Musica> programacao;

   public MusicPlayer(){
       programacao = new ArrayList<>();
   }

   public void adicionarMusica(Musica musica){
       programacao.add(musica);
   }

   public void  trocarMusica(int index, Musica musica){
       programacao.set(index,musica);
   }

   public void removerMusica(int index){
       programacao.remove(index);
   }

   public void removerTodasMusica(){
       programacao.clear();
   }

public void imprimirRelatorio(){
    System.out.println("******* Músicas ********");
       for(int i = 0; i < programacao.size(); i++){
           System.out.println("Música: \n");
           programacao.get(i).detalhesMusica();
       }
}


public void duracao(){
       int somaSegundos = 0;
       int segundos, minutos , horas;

       for(int i = 0; i < programacao.size(); i++){
           somaSegundos += programacao.get(i).getDuracao();
       }


       minutos = somaSegundos/60;
       horas = minutos / 60;
       segundos = somaSegundos%60;

    System.out.println("Duração do programa é: " + horas + ":" + minutos + ":" + segundos  );

}


}
