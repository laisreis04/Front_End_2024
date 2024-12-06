package FichaPratica_04;

import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][5];
        int numeroIgual,contador = 0;

        //Pedir ao user para preencher a matriz
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz.length; coluna++){
                System.out.print("Insira um número [" + linha + "] " + "[" + coluna + "]");
                matriz[linha][coluna] = input.nextInt();
            }
        }
        //Pesquisar numero igual

        System.out.print("Qual numero você quer pesquisar? :");
        numeroIgual = input.nextInt();

        for(int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                if(numeroIgual == matriz[linha][coluna]){
                    contador++;
                }

            }
        }

        System.out.println("O seu numero igual é " + numeroIgual + " foi encotrado " + contador + " vezes");

    }

}
