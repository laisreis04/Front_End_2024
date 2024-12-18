package FichaPratica_06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_10 {

    public static void main (String[]args) throws FileNotFoundException {

        //Ler ficheiro
        File ficheiro10 = new File("Fichas_JAVA/Ficheiros_06/exercicio_10.csv");

        Scanner leitor = new Scanner(ficheiro10);

        String linha = leitor.nextLine(); //Linha de cabeçalho
        String tipoProduto, produto;
        double quantidade, valorUnitario, total = 0;

        //Ciclo para prenncher a matriz
        while(leitor.hasNextLine()){
            linha = leitor.nextLine();
            String[] itensLinha = linha.split(",");
            tipoProduto = itensLinha[0];
            produto = itensLinha[1];
            quantidade = Double.parseDouble(itensLinha[2]);
            valorUnitario = Double.parseDouble(itensLinha[3]);

            total += quantidade * valorUnitario;

        }

        System.out.println("O valor total das vendas é de " + total + "€");



        //Fechar
        leitor.close();

    }

}
