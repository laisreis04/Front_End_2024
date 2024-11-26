package FichaPratica_03;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args){

        //Scanner  - dois jogadores
        Scanner inputPlayer = new Scanner(System.in);

        System.out.println("JOGADOR 1");
        System.out.print("Insira um número de 0 a 100:");
        int numjogador1 = inputPlayer.nextInt();

        int tentativas = 0, numJogador2;



        //Ciclo do jogo

        do{
            System.out.println("JOGADOR 2");
            System.out.print("Jogador 2 é a sua vez, tente acerta o número:");
            numJogador2 = inputPlayer.nextInt();


            //Indicar se for maior
            if(numjogador1 > numJogador2){
                System.out.println("O número é maior");
            }
            //indicar se for menor
            if (numjogador1 < numJogador2){
                System.out.println("O número é menor");
            }

            tentativas++;

        }while (numjogador1 != numJogador2);

        //Imprimir - numero de tentaivas

        System.out.println("Número de tentativas = " +tentativas);
    }
}
