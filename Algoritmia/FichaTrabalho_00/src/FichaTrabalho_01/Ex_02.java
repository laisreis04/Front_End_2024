package FichaTrabalho_01;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int salario;
        double imposto;

        //Pedir ao user sálario
        System.out.println("Insira o seu salário: ");
        salario = input.nextInt();

        //Condição - verificar o valor para aplicar o imposto
        if(salario > 15000){
            imposto = salario * 0.3;
            salario *= 0.7;

        }else {
            imposto = salario * 0.2;
            salario *= 0.8;
        }

        System.out.println("O valor do seu salário apoós impostos é: " + salario);
        System.out.println("O valor do imposto é de : " + imposto);

    }
}
