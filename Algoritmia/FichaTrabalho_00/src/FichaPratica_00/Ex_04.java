package FichaPratica_00;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //Variaveis
        double raio, area, pi = 3.14;

        //Pedir raio
        System.out.println("Inisira o raio em cm: ");
        raio = input.nextDouble();

        //Calcular área
        area = pi * (raio*raio);

        //Imprimir

        System.out.println("Área = " + area + " cm");
    }
}
