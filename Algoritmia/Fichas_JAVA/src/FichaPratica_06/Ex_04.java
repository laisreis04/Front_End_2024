package FichaPratica_06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_04 {

    public static void main(String[]  args) throws FileNotFoundException{


        File ficheiroCsv = new File("Fichas_JAVA/Ficheiros_06/exercicio_04.csv");

        Scanner lerCsv = new Scanner(ficheiroCsv);

        while(lerCsv.hasNextLine()){
            String linha = lerCsv.nextLine();
            System.out.println(linha);
        }

        lerCsv.close();

    }
}
