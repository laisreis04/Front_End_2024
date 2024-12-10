package FichaTrabalho_01;

import java.util.Scanner;

public class Ex_16 {


    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        //Entrada de dados
        System.out.print("Insira um valor:");
        int valor = input.nextInt();


        int notas = 0;

        //Condição
        if(valor % 5 == 0){
            //Notas 200
            notas = valor/200;
            System.out.println("Notas de 200:" + notas);
            valor = valor % 200;

            //Notas 100

            notas = valor / 100;
            System.out.println("Notas de 100: " + notas);
            valor = valor % 100;
            //Notas 50
            notas = valor /50;
            System.out.println("Notas de 50: " + notas);
            valor = valor % 50;

            //Notas 20
            notas = valor /20;
            System.out.println("Notas de 20: " + notas);
            valor = valor % 20;

            //Notas 10
            notas = valor /10;
            System.out.println("Notas de 10: " + notas);
            valor = valor % 10;

            //Notas 5
            notas = valor /5;
            System.out.println("Notas de 5: " + notas);
            valor = valor % 5;

        }else {
            System.out.println("Não é multiplo de 5 !!!");
        }





    }
}
