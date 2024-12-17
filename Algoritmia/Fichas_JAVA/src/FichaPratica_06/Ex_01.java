package FichaPratica_06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) throws FileNotFoundException {

        //Caminho
        File ficheiro = new File("Fichas_JAVA/Ficheiros_06/exercicio_01.txt");

        //Leitor
        Scanner scanner = new Scanner(ficheiro);
        //Leitor para ficheiro 2

        String linha;

        //Ciclo para ler  o ficheiro completo
        while(scanner.hasNextLine()){
            linha = scanner.nextLine();
            System.out.println(linha);
        }

        //Fechar o leitor

        scanner.close();

    }

}
