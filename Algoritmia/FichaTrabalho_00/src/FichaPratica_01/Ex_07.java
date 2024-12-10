package FichaPratica_01;

import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        //Variaveis
        int num;

        //Entrada de dados
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        //Condição - Par ou Ímpar

        if( num % 2 == 0){
            System.out.println("É par - Uhulll");
        }else {
            System.out.println("É Ímpar");
        }

    }
}
