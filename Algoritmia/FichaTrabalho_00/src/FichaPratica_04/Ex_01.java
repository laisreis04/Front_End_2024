package FichaPratica_04;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args){


        //Pedir ao user

        Scanner input = new Scanner(System.in);

        //Criar um vetor
        int[] vetor = new int[10];


        //Imprimir -Ciclo corra 10x
        for (int i = 0; i < 10; i++){
            System.out.println("Insira um número no Array[" + i +  "]");
            vetor[i] = input.nextInt();
        }

    }
}
