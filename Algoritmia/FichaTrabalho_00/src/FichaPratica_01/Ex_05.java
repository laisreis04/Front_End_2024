package FichaPratica_01;

import java.util.Scanner;

public class Ex_05 {


    public static void main(String[] args){


        Scanner inputUser = new Scanner(System.in);

        //Variaveis
        int valor1, valor2;

        //Pedir ao usuário insirir numeros
        System.out.print("Introduza um número: ");
        valor1 = inputUser.nextInt();

        System.out.println("Introduza o segundo número: ");
        valor2 = inputUser.nextInt();


        //Condição
        if(valor1 < valor2){
            System.out.println("Menor= " + valor1 + " Maior = " + valor2);
        }
        if(valor2 < valor1){
            System.out.println("Menor = " + valor2 +  " Maior = " + valor1);
        }
        if(valor1 == valor2){
            System.out.println("São Iguais !!!");
        }



    }
}
