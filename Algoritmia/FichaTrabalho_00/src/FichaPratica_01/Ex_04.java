package FichaPratica_01;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //Ler um valor

        System.out.print("Insira a sua classificação: ");
        int posicao = input.nextInt();


        switch (posicao){

            case 1:
                System.out.println("Parabéns você somou 10 pontos!");
                break;
            case 2:
                System.out.println("Parabéns você somou 8 pontos!");
                break;
            case 3:
                System.out.println("Parabéns você somou 6 pontos!");
                break;
            case 4:
                System.out.println("Parabéns você somou 5 pontos!");
                break;
            case 5:
                System.out.println("Parabéns você somou 4 pontos!");
                break;
            case 6:
                System.out.println("Parabéns você somou 3 pontos!");
                break;
            case 7:
                System.out.println("Parabéns você somou 2 pontos!");
                break;
            case 8:
                System.out.println("Parabéns você somou 1 pontos!");
                break;

            default:
                System.out.println("Que pena não somou nada, ande mais rápido na próxima");
        }


    }
}
