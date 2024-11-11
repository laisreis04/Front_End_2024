package FichaPratica_00;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args){

        Scanner inputUser = new Scanner(System.in);

        //Pedir dados aos usuários - 3 variaveis
        double valor1, valor2, valor3;
        double per20 = 0.20, per30= 0.30, per50 = 0.50;

        System.out.print("Insira valor 1: ");
        valor1 = inputUser.nextDouble();
        System.out.print("Insira valor 2: ");
        valor2 = inputUser.nextDouble();
        System.out.print("Insira valor 3: ");
        valor3 = inputUser.nextDouble();
        System.out.println("****************");

        //Calcular média ponderada
        double mediaPonderada;

        mediaPonderada = (valor1 *per20 + valor2 * per30 + valor3 * per50) /(per20 +per30+per50 );

        //Imprimir resultado

        System.out.println("Média ponderada = " + mediaPonderada);



    }
}
