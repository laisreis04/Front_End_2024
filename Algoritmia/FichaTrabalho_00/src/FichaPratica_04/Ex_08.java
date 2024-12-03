package FichaPratica_04;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        //Matriz 3x3 -> int
        int[][] matriz = new int[3][3];

        // Input user

        for(int linha = 0; linha < 3;linha++ ){
            for(int coluna = 0; coluna < 3;coluna++){
                System.out.print("Insira um valor [" + linha + "]" + "[" + coluna + "]");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        //Imprimir
        for(int linha = 0; linha < 3; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }



    }
}
