package FichaPratica_06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) throws FileNotFoundException {

        //Ler o ficheiro
        File ficheiro7 = new File("Fichas_JAVA/Ficheiros_06/exercicio_07.txt");
        Scanner in = new Scanner(ficheiro7);


        int contadorLinhas = 0, contadorPalavras = 0;
        String linha = " ";


        //Ciclo para contar linha e palavras
        while(in.hasNextLine()){
            contadorLinhas++;
            linha = in.nextLine();
            String[] arrayPalavras = linha.split(" ");
            contadorPalavras += arrayPalavras.length;

        }

        //Imprimir
        System.out.println("Numero de linhas = " + contadorLinhas);
        System.out.println("Numero de palavras = " + contadorPalavras);


        //Fechar o scanner
        in.close();

    }

}
