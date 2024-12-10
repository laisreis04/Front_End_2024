package FichaPratica_04;

import java.util.Scanner;

public class Ex_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int soma = 0;

        for (int i = 0; i < 4; i++) {
            for (int col = 0; col < 4; col++) {
                System.out.println("Insira um numero: ");
                matriz[i][col] = input.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int col = 0; col < 4; col++) {
                if (i == col) {
                    soma += matriz[i][col];
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(matriz[i][col] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Soma da diagonal: " + soma);
    }

}
