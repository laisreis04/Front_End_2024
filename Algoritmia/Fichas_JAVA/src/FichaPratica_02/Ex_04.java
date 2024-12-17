package FichaPratica_02;

import java.util.Scanner;

public class Ex_04 {


    public static void main(String[] args){

        //Numero lido - Scanner
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numUser = inputUser.nextInt();

        //Vatiaveis - Int

        int contador = 0;

        //Ciclo
        while(contador <= numUser){
            System.out.println(contador);
            contador++;
        }

    }
}
