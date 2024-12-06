package FichaPratica_04;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


        int[][] matriz = new int[3][3];
        int soma = 0;

        // Ciclo Pedir user numeros para preenche a matriz

        for(int linha = 0; linha < matriz.length;linha++){
            for(int colunas = 0; colunas < matriz.length;colunas++){
                System.out.print("Insira um número [" + linha + "] " + "[" + colunas + "]");
                matriz[linha][colunas] = input.nextInt();
                soma += matriz[linha][colunas]; // soma = soma + matriz
            }
        }


        System.out.println("A soma total é = " + soma);


    }

}
