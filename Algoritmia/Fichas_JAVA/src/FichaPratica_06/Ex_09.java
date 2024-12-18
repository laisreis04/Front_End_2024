package FichaPratica_06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args)throws FileNotFoundException {


        //Ler o ficheiro
        File ficheiro9 = new File("Fichas_JAVA/Ficheiros_06/exercicio_09.txt");
        Scanner leitor = new Scanner(ficheiro9);
        Scanner leitor2 = new Scanner(ficheiro9);

        //Variaveis
        String linha, linha2, palavraMaisFrequente = " ";
        int contador = 0, numRepeticoes = 0, maisFrequente = 0;


        //Ciclo para percorrer o meu ficheiro - Linha anterior
        while(leitor.hasNextLine()){
          linha = leitor.nextLine();
          String[] palavras = linha.split(" ");

          for(int i = 0; i < palavras.length;i++){
              contador++;

          }

        }

        //Ciclo para percorrer o meu ficheiro - Proxima Linha
        String[] array = new String[contador];
        int contador2 = 0;

        while(leitor2.hasNextLine()){
            linha2 = leitor2.nextLine();
            String[] palavras2 = linha2.split(" ");


            for(int i = 0; i< palavras2.length;i++){
                array[contador2]= palavras2[i];
                contador2++;

            }

        }

        //Comparação entre linhas
        for(int primeiro = 0; primeiro < array.length;primeiro++){
            for(int segundo = 0;segundo< array.length;segundo++){
                if(array[primeiro].equals(array[segundo])){
                    numRepeticoes++;
                }

            }

            if(numRepeticoes > maisFrequente){
                maisFrequente = numRepeticoes;
                palavraMaisFrequente = array[primeiro];
            }
            numRepeticoes = 0;
        }

        System.out.println("A palavra mais repetida é " + palavraMaisFrequente);
        System.out.println("Aparece " + maisFrequente + "x");


        //Fechar

leitor2.close();
leitor.close();

    }
}
