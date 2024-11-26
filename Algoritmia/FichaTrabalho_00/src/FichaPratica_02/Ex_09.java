package FichaPratica_02;

import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args) {

        //Scanner
        Scanner inputUser = new Scanner(System.in);

        //Variaveis -> numUser (Input),numParaInciar (Numero para iniciar a contagem)

        int numUser, numParaInciar = 2;

        //Pedir ao utilizador
        System.out.print("Insira um número que seja maior que 2: ");
        numUser = inputUser.nextInt();

        //Ciclo - Condição *Só irá execuatr o ciclo enquanto o numInicial foi igual ao numUser
        while (numParaInciar <= numUser) {
            System.out.println(numParaInciar);
            //atualizar o numIncial
            numParaInciar += 2;

        }


    }
}
