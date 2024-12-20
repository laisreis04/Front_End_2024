package FichaPratica_06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_11 {

    /**
     * Função que procyra muscias por genero
     * @param matriz
     * @param genero
     */
    public static void procurarPorGenero(String[][] matriz, String genero)throws FileNotFoundException {

        for(int i = 0; i < matriz.length;i++){
            if(matriz[i][2].equals(genero)){
                System.out.println(matriz[i][0]);
            }

        }


    }


    /**
     *Função que procura muscias por nome dos artistas
     * @param matriz
     * @param artista
     * @throws FileNotFoundException
     */
    public static void procurarPorArtista(String[][] matriz, String artista)throws FileNotFoundException{

        for(int i = 0; i < matriz.length; i++){
            if(matriz[i][1].equals(artista)){
                System.out.println(matriz[i][0]);
            }
        }

    }

    //Exibir musica com maior duração
    public static String maiorDuracao(String[][] matriz)throws FileNotFoundException{

        String maiorMusica = " ";
        int minutos = 0, segundos = 0, duracao = 0, maiorDuracao = 0;

        String[][] tempo = new String[matriz.length][2];

        for(int i = 0; i < matriz.length;i++){
            tempo[i] = matriz[i][3].split(":");
            minutos = Integer.parseInt(tempo[i][0])/100;
            segundos = Integer.parseInt(tempo[i][1]);
            duracao = minutos + segundos;
            if(duracao > maiorDuracao){
                maiorDuracao = duracao;
                maiorMusica = matriz[i][0];
            }
        }

        System.out.println("A maior musica é " + maiorMusica + " e tem a duaração de : " + maiorDuracao);
        return maiorMusica;
    }

    /**
     * Função que verifica as musicas acima do tempo passado pelo Utilizador
     * @param matriz
     * @param minutos
     * @param segundos
     * @throws FileNotFoundException
     */
    //Exibir musica  maior duração especifico
    public static void duracaoValorAcima(String[][]matriz, int minutos, int segundos)throws FileNotFoundException{

        int minMusica, segMusica;

        //Criar uma nova matriaz que vai guardar os minutos e segundos
        String[][] tempo = new String[matriz.length][2];


        for(int i = 0; i < matriz.length; i++){
            tempo[i] = matriz[i][3].split(":");
            minMusica = Integer.parseInt(tempo[i][0]);
            segMusica = Integer.parseInt(tempo[i][1]);
            if (minMusica > minutos){
                System.out.println(matriz[i][0]);
            }
            if(minMusica == minutos){
                System.out.println(matriz[i][0]);
            }
        }

    }


    //total de musicas



    //Criar um menu - Main

    public static void main(String[] args) throws FileNotFoundException{

        Scanner input = new Scanner(System.in);

        //Usar para devolver o numero de linhas
        File ficheiro11 = new File("Fichas_JAVA/Ficheiros_06/exercicio_11.csv");
        Scanner leitorParaLinhas = new Scanner(ficheiro11);

        //Usar para ler o fiehiro normalmente
        Scanner leitor = new Scanner(ficheiro11);


        String linha, linha2, nomeArtista, genero,nomeMusica;
        int numLinhas = 0, opcaoUser;

        linha = leitorParaLinhas.nextLine();

        while(leitorParaLinhas.hasNextLine()){
            linha = leitorParaLinhas.nextLine();
            numLinhas++;
        }

        String[][] matrizMain = new String[numLinhas][4];


        //cabeçalho
        linha2 = leitor.nextLine();


        while(leitor.hasNextLine()){
            for(int i = 0; i < numLinhas; i++){
                linha2 = leitor.nextLine();
                String[] itensDaLinha = linha2.split(",");
                for(int col = 0;col < itensDaLinha.length; col++){
                    matrizMain[i][col] = itensDaLinha[col];
                    System.out.print(matrizMain[i][col] + " "); // tirar o ln
                }
                System.out.println(" ");
            }

        }
    leitor.close();
        leitorParaLinhas.close();



        //menu
        do{
            System.out.println("*****Menu*****");
            System.out.println("1. Pesquisar por genero");
            System.out.println("2. Pesquisar por artistas");
            System.out.println("3. Pesquisar muscia com maior duração");
            System.out.println("4. Pesquisar musica com uma duração acima");
            System.out.println("5. Sair");

            System.out.println("***********");
            System.out.print("Escolha a opção: ");
            opcaoUser = input.nextInt();

            switch (opcaoUser){

                case 1:
                    System.out.print("Insira o gênero: ");
                    input.nextLine();
                    genero = input.nextLine();
                    procurarPorGenero(matrizMain,genero);
                    break;
                case 2:
                    System.out.print("Insira o gênero: ");
                    input.nextLine();
                    nomeArtista = input.nextLine();
                    procurarPorArtista(matrizMain, nomeArtista);
                    break;

            }



        }while(opcaoUser != 5);


    }
}
