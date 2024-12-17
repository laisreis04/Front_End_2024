package FichaPratica_01;

import java.util.Scanner;

public class Ex_14 {


    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        //Entrada de dados
        System.out.print("Insira o primeiro número (a):");
        int num1 = input.nextInt();
        System.out.print("Insira o segundo número (b):");
        int num2 = input.nextInt();
        System.out.print("Insira o terceiro número (c):");
        int num3 = input.nextInt();


        int menor = 0, meio = 0 , maior = 0 ;

        //Condição - Verificar os numero e colocar em ordem crescente

        //Entra nessa condição se o Primeiro numero for o menor de todos
        if (num1 < num2 && num1 < num3) {
            menor = num1;
            if(num2 < num3){
                meio = num2;
                maior = num3;
            }else{
                meio = num3;
                maior = num2;
            }
        }

        //Verificar se o segundo numero é o menor de todos
        if(num2 < num1 && num2 < num3){
            menor = num2;
            //Verificar qual o segundo menor numero - entre A e C
            if(num1<num3){
                meio = num1;
                maior = num3;
            }else {
                meio = num3;
                maior = num1;
            }
        }


        //Condição para verificar se o terceiro numero (c) é o menor de todos
        if(num3 < num1 && num3 < num2){
            //Verificar quem é o segundo menor numero
            if(num1 < num2){
                meio = num1;
                maior = num2;
            }else {
                meio = num2;
                maior = num1;
            }

        }

        System.out.println("A ordem crescente é: " + menor + " " + meio + " " + maior);

    }
}
