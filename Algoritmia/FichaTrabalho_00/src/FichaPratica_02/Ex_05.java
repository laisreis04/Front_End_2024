package FichaPratica_02;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args){

        Scanner inputUser_Inicio = new Scanner(System.in);
        Scanner inputUser_Fim = new Scanner(System.in);


        //Variaveis
        int numInicio, numFinal;

        //Ler dois numeros - 2 inputs
        System.out.print("Insira um número para iniciar a contagem:");
        numInicio = inputUser_Inicio.nextInt();

        System.out.print("Insira um número para finalizar a contagem: ");
        numFinal = inputUser_Fim.nextInt();


        //Ciclo para contar os numeors e imprimir
        while(numInicio <= numFinal){
            System.out.println(numInicio);
            numInicio++;
        }


    }
}
