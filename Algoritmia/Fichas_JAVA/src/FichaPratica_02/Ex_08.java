package FichaPratica_02;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args){


        //Scanner para ler numeros
        Scanner inputUser = new Scanner(System.in);


        int numUser, soma = 0, contadorMedia = 0;


        System.out.print("Insira um número: ");
        numUser = inputUser.nextInt();


        //Ciclo - Soma e média
        while (numUser != -1){
            contadorMedia = contadorMedia + 1;
            System.out.println("contador atualizado= "+ contadorMedia);
            soma = soma + numUser;
            System.out.println("soma atualizada= " + soma);
            System.out.println("Insira outro numero, ou carregue -1 para parar: ");
            numUser = inputUser.nextInt();
        }

        System.out.println(soma);
        System.out.println(contadorMedia);
        System.out.println("Média = " + soma/contadorMedia);

    }
}
