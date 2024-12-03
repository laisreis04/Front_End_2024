package FichaPratica_04;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        //Array - tamanho 10
        int[] array = new int[10];
        int maiorNumero = 0;


        //Ciclo para pedir ao user 10 numeros
        for(int i = 0; i < 10; i++){
            System.out.print("Insira um número na gaveta [" + i + "]:");
            array[i] = input.nextInt();
        }

        maiorNumero = array[0];

        //Verificar o maior valor
        for(int i = 0; i < 10; i++){
            if(array[i]> maiorNumero){
                //System.out.println("Maior numero subtituido por :" + array[i]);
                maiorNumero = array[i];
            }

        }

        System.out.println("O maior valor é: " + maiorNumero);


    }
}
