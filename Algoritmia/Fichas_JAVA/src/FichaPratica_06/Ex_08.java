package FichaPratica_06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) throws FileNotFoundException {

        //Ler um ficheiro
        File ficheiro8 = new File("Fichas_JAVA/Ficheiros_06/exercicio_08.txt");

        //Gravar um novo ficheiro
        File novoFicheiro = new File("Fichas_JAVA/Ficheiros_06/exercicio_08_New.txt");

        Scanner scanner = new Scanner(ficheiro8);

        //Escrever no ficheiro novo
        PrintWriter writeNovoFicheiro = new PrintWriter(novoFicheiro);

        String palavraChave = "turma";

        //Ciclo para ler o ficheiro
        while(scanner.hasNextLine()){

            String linhas = scanner.nextLine();
            String[] palavrasArray = linhas.split(" ");

            //Ciclo para percorre o arry e encontrar a palavra
            for (int i = 0;i < palavrasArray.length; i++){
                if(palavrasArray[i].equals(palavraChave)){
                    //Só vai impirmir na consola
                    System.out.println(linhas);
                    //Impirmir no Novo Ficheiro
                    writeNovoFicheiro.println(linhas);

                }

            }



        }

        //Fechar
        scanner.close();
        writeNovoFicheiro.close();


    }
}
