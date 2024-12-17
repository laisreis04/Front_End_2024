package FichaPratica_04;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args){


        //Input user
        Scanner inputUser = new Scanner(System.in);

        //Vetor tamanho = 12;
        double[] comissoes = new double[12];
        double totalComissoes = 0;

        //Somar as comições;
        for(int i = 0; i < 12; i++){
            System.out.print("Insira a sua comissão [" + i + "]");
            comissoes[i] = inputUser.nextDouble();
            totalComissoes = totalComissoes + comissoes[i];
        }
        System.out.println("Total de comissões = " + totalComissoes);


    }
}
