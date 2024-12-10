package FichaPratica_01;

import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        //Variaveis
        int valor1, valor2;

        //Entrada de dados
        System.out.print("Introduza um número:");
        valor1 = input.nextInt();

        System.out.print("Introduza o segundo número: ");
        valor2 = input.nextInt();

        //Condições

        if(valor1 > valor2){
            System.out.println(valor1 + " " + valor2);
        } else if (valor2 > valor1) {
            System.out.println(valor2 + " " + valor1);
        }else {
            System.out.println("Números iguais");
        }


    }



}
