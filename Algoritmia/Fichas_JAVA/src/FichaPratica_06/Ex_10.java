package FichaPratica_06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_10 {

    public static void main (String[]args) throws FileNotFoundException {

        //Indicar o caminho

        File ficheiro = new File("Fichas_JAVA/Ficheiros_06/exercicio_10.csv");

        //leitor 1

        Scanner scanner = new Scanner(ficheiro);

        String linha = scanner.nextLine();

        String tipo, produto;
        double preco, total = 0, quantidade;


        //Ciclo para ler all o ficheiro completo

        while(scanner.hasNextLine()){
           linha = scanner.nextLine();
           String[] itemLinha = linha.split(",");
           tipo = itemLinha[0];
           produto = itemLinha[1];
           quantidade = Double.parseDouble(itemLinha[2]);
           preco = Double.parseDouble(itemLinha[3]);

           double valorTotal = quantidade * preco;
           total = valorTotal ;

        }

        System.out.println("O total é: "  + total);

        //Fechar o leitor

        scanner.close();

    }
}
