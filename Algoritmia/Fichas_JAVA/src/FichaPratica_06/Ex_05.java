package FichaPratica_06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) throws FileNotFoundException {


        //Indicar o caminho do Ficheiro
        File file = new File("Fichas_JAVA/Ficheiros_06/exercicio_05_31.txt");

        //Ler o ficheiro
        Scanner sc = new Scanner(file);

        //Guardar o conteudo numa variavel
        int soma = 0;

        ////Ciclo para somar
        while (sc.hasNextInt()){
            soma += sc.nextInt();
        }

        System.out.println("Soma dos números é = " + soma);

        sc.close();

    }
}
