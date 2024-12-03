package FichaPratica_04;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        //Array  - tamanho 10
        int[] gavetas = new int[10];
        int menorValor = 0;

        //Ciclo para pedir ao User

        for(int i = 0;i < gavetas.length; i++){
            System.out.print("Insira o valor na gaveta [" + i + "]");
            gavetas[i] = input.nextInt();
        }

        menorValor = gavetas[0];
        //Verificar o MENOR valor

        for(int i = 0;i < gavetas.length; i++){
            if(gavetas[i]< menorValor){
                menorValor = gavetas[i];
            }

        }

        System.out.println(" O menor valor é: " + menorValor);

    }
}
