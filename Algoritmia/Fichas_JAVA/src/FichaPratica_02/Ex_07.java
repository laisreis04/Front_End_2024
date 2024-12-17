package FichaPratica_02;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args){

        //Input do user
        Scanner inputUser = new Scanner(System.in);

        //Variaveis
        int numAbaixo, numAcima, numUser;

        System.out.print("Insira um número: ");
        numUser = inputUser.nextInt();

        numAbaixo = numUser - 5;
        numAcima = numUser + 5;


        //5 numeros abaixo
        while (numUser > numAbaixo){
            System.out.println(numAbaixo);
            numAbaixo++;
        }

        numUser++;

        //5 numeros acima

while(numUser <= numAcima){

    System.out.println(numUser);
    numUser++;

}

    }
}
