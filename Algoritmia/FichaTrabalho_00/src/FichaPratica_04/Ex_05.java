package FichaPratica_04;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        //Array tamanho 10
        int[] gaveta = new int[10];
        int soma = 0, media = 0;


        //Ciclo para pedir ao user 10 numeros
        for(int i = 0; i < gaveta.length; i++){
            System.out.print("Insira um valor na gaveta [" + i + "]:");
            gaveta[i] = input.nextInt();
            //Soma e depois a média
            soma = soma + gaveta[i];
        }

        media = gaveta.length;

        System.out.println("A média é = " + soma/media);



    }
}
