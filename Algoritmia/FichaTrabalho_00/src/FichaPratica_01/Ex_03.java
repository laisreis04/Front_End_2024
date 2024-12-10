package FichaTrabalho_01;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


        double imposto, salario;

        //Pedir user salário
        System.out.println("Insira o seu salário:");
        salario = input.nextInt();

        System.out.println("Salario bruto :" + salario + "€");

        //Condição 1 - imposto 20%
        if(salario <= 15000){
            imposto = salario * 0.2;
            salario *= 0.8;
        }

        //Condição 2 - imposto 30%
        if(salario > 15000 && salario <= 20000){
            imposto = salario * 0.30;
            salario *= 0.7;
        }

        //Condição 3 - imposto 35%
        if(salario > 20000 && salario <= 25000){
            imposto = salario * 0.35;
            salario *= 0.65;
            //Condição 4 - imposto 40%
        } else{
            imposto = salario *0.4;
            salario *= 0.60;
        }

        System.out.println("Salário após impostos: " + salario + "€");
        System.out.println("Total de imposto pago: " + imposto + "€");

    }
}
