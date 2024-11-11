package FichaPratica_00;

import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args){

        Scanner inputUsuario = new Scanner(System.in);

        //Input user
        int valor1, valor2, valorExtra;

        System.out.println("Insira um valor 1: ");
        valor1 = inputUsuario.nextInt();
        System.out.println("Insira um valor 2: ");
        valor2 = inputUsuario.nextInt();

        //Primeira troca c/ variavel extra

//        valorExtra = valor1;
//        valor1 = valor2;
//        valor2 = valorExtra;
//
//        System.out.println("Primeira Troca valor 1 =" + valor1 );
//        System.out.println("Primeira Troca valor 2 =" + valor2);

        //Segunda troca sem extra

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        //Imprimir Resultado
        System.out.println("Primeira Troca valor 1 =" + valor1 );
        System.out.println("Primeira Troca valor 2 =" + valor2);

    }
}
