package FichaPratica_01;

import java.util.Scanner;

public class Ex_13 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        //Entrada de dados
        System.out.println("Insira a hora: ");
        int hora = input.nextInt();
        System.out.println("Insira os minutos:");
        int minutos = input.nextInt();

        //Conversão usando condição

        int horaPM_AM;

        if(hora >=12){
            horaPM_AM = hora - 12;
            System.out.println("São: " + horaPM_AM + ":" + minutos + "PM");
        }else {
            System.out.println("São: " + hora + ":" + minutos + "AM");
        }

    }
}
