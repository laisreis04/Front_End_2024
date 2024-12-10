package FichaTrabalho_01;

import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //Entrada de dados - 2 numeros reais (double)
        System.out.print("Introduza um número:");
        double num1 = input.nextDouble();
        System.out.print("Introduza um número:");
        double num2 = input.nextDouble();
        System.out.print("Introduza o tipo de operação qur desaja fazer\n(Use apenas (+ , - , / , *):");
        String operadorAritimetico = input.next();

        double resultado;

        //Menu de seleção
        switch (operadorAritimetico){
            case "+":
                resultado = num1 + num2;
                System.out.println("Resultado = " + resultado);
                break;

            case "-":
                resultado = num1 - num2;
                System.out.println("Resultado = " + resultado);
                break;

            case "/":
                resultado = num1/num2;
                System.out.println("Resultado = " + resultado);
                break;

            case "*":
                resultado = num1 * num2;
                System.out.println("Resultado = " + resultado);
                break;

            //Apresentar um erro - quando inválido
            default:
                System.out.println("Operador inválido");
        }



    }


}
