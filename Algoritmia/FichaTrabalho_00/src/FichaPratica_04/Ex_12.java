package FichaPratica_04;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[][] matriz = new int[3][2];

        System.out.println("**** Preencha o array 1 ****");
        //Ler array 1
    for(int i = 0; i < array1.length; i++){
        System.out.print("Insira o valor [ " + i + "]: ");
        array1[i] = input.nextInt();
        matriz[i][0] = array1[i];
    }
        System.out.println("****Preencha o array 2 ****");
        //Ler array2
        for(int linha = 0; linha < array2.length; linha++){
            System.out.print("Insira o valor [ " + linha + "]: ");
            array2[linha] = input.nextInt();
            matriz[linha][1] = array2[linha];
        }
    //Preencher a matriz - Impressão

        for(int linha = 0; linha < array2.length;linha++ ){
            for(int coluna = 0; coluna < 2; coluna++ ){
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}
