package FichaPratica_03;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int numUser1, numUser2, resultado = 0;
        String continuar;


        do{
            System.out.println("Insira o primeiro número: ");
            numUser1 = input.nextInt();

            System.out.println("Insira um operador (+,-,*,/): ");
            String operador=input.next();

            System.out.println("Insira o segundo número: ");
            numUser2 = input.nextInt();

            switch (operador) {
                case "+":
                    resultado= numUser1 + numUser2;
                    System.out.println("Total: " + resultado);
                    break;
                case "-":
                    resultado= numUser1 - numUser2;
                    System.out.println("Total: " + resultado);
                    break;
                case "*":
                    resultado= numUser1 * numUser2;
                    System.out.println("Total: " + resultado);
                    break;
                case "/":
                    resultado= numUser1 / numUser2;
                    System.out.println("Total: " + resultado);
                    break;

                default:
                    System.out.println("Operador inválido!!!!");
                    break;
            }
            do{
                System.out.println("Deseja continuar? (s/n): ");
                continuar = input.next();
            }while( !continuar.equals("s") && !continuar.equals("n"));

        } while (continuar.equals("s"));






    }
}
