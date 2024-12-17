package FichaPratica_04;

import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //Tamanho do array = 10
        int[] array = new int[3];
        int maiorValor = 0;

        //Input - User (for)
        for(int contador = 0; contador < array.length; contador++){
            System.out.print("Insira um valor na gaveta [" + contador + "]: ");
            array[contador] = input.nextInt();
        }

        maiorValor = array[0];


        for(int contador = 0 ; contador < array.length; contador++){
            //verificar qual o maior valor
            if(array[contador] > maiorValor){
                maiorValor = array[contador];
            }
        }

        //Imprimir se não houver numero par

       if(maiorValor % 2 == 0){
           System.out.println("O maior numero par é: " +maiorValor);
       }else {
           System.out.println("O maior número não é par");
       }
    }
}
