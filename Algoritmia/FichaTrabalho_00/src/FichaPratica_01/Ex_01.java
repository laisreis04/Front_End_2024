package FichaTrabalho_01;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);


        //Variaveis
        int valor1input, valor2input, resultadoMaiorNumero;

        //Pedir input user
        System.out.print("Insira o primeiro valor: ");
        valor1input = input.nextInt();

        System.out.print("Insira o segundo valor: ");
        valor2input = input.nextInt();


        //Condição - verificar o maior número
        if(valor1input > valor2input){

            System.out.println("Maior número: " + valor1input );
        }else {
            System.out.println("Maior número: " + valor2input);
        }

//        if(valor1input > valor2input){
//            System.out.println("Maior número: " + valor1input);
//        }
//        if(valor2input > valor1input){
//            System.out.println("Maior número: " + valor2input);
//        }




        //Imprimir na consola


    }

}
