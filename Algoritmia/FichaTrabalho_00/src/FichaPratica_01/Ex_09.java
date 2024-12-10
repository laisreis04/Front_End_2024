package FichaTrabalho_01;

import java.util.Scanner;

public class Ex_09 {


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //Variaveis
        int num1, num2, num3;

        //Entrada de dados
        System.out.print("Introduza o primeiro número: ");
        num1 = input.nextInt();
        System.out.print("Introduza o segundo número: ");
        num2 = input.nextInt();
        System.out.print("Introduza o terceiro número: ");
        num3 = input.nextInt();

        //Avaliar condições
        if(num1 < num2 && num1 < num3){
            System.out.println("O menor número é: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("O menor número é: " + num2);
        }else {
            System.out.println("O menor número é: " + num3);
        }


    }
}
