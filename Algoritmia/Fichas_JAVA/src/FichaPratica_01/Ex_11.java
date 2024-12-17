package FichaPratica_01;

import java.util.Scanner;

public class Ex_11 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        //Entrada de dados
        System.out.print("Introduza o seu saldo: ");
        double saldo = input.nextDouble();

        System.out.print("Montante a ser retirado/Acrescido: ");
        double montante = input.nextDouble();


        //Condição - Saldo negativo ou Positivo

        double saldoFinal = saldo + montante;

        if(montante >=0){
            System.out.println("Seu saldo atual é de (Positivo): " + saldoFinal);
        }else {
            System.out.println("Boa tentativa, mas tu tá liso (nagativo)");
        }


    }

}
