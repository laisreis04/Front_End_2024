package FichaPratica_00;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int faixa1Min1, faixa1Sec1,faixa2Min2, faixa2Sec2, faixa3Min3, faixa3Sec3, faixa4Min4, faixa4Sec4, faixa5Min5, faixa5Sec5;


        System.out.println("Vamos calcular o tempo de duração do disco, insira o tempo em minutos e segundos.");


        //Pedir ao usuário inserir o tempo (minutos e segundos) de cada faixa
        System.out.print("Faixa 1 - Minutos: ");
        faixa1Min1 = input.nextInt();
        System.out.print("Faixa 1 - Segundos: ");
        faixa1Sec1 = input.nextInt();

        System.out.print("Faixa 2 - Minutos: ");
        faixa2Min2 = input.nextInt();
        System.out.print("Faixa 2 - Segundos: ");
        faixa2Sec2 = input.nextInt();

        System.out.print("Faixa 3 - Minutos: ");
        faixa3Min3 = input.nextInt();
        System.out.print("Faixa 3 - Segundos: ");
        faixa3Sec3 = input.nextInt();

        System.out.print("Faixa 4 - Minutos: ");
        faixa4Min4 = input.nextInt();
        System.out.print("Faixa 4 - Segundos: ");
        faixa4Sec4 = input.nextInt();

        System.out.print("Faixa 5 - Minutos: ");
        faixa5Min5 = input.nextInt();
        System.out.print("Faixa 5 - Segundos: ");
        faixa5Sec5 = input.nextInt();

        //Trabnsformar em minutos e segundos

//        //Minutos para segundos
        int minToSec = (faixa1Min1 + faixa2Min2 + faixa3Min3 + faixa4Min4 + faixa5Min5) * 60;
//
//        //Somar todos os segundos
        int totalSegundos = minToSec + (faixa1Sec1 + faixa2Sec2 + faixa3Sec3 + faixa4Sec4 + faixa5Sec5);
//
//        //Calcular hora
//        int hora = totalSegundos /3600;
//        totalSegundos = totalSegundos % 3600;
//
//        //Calcular minutos
//        int minutos = totalSegundos /60;
//
//        // Calcular segundos
//        totalSegundos = totalSegundos % 60;


        //Outra forma de resolver

        int hora = totalSegundos /3600;
        int minutos = (totalSegundos/60) - (hora*60);
        totalSegundos = totalSegundos -(hora*3600) - (minutos*60);


        System.out.println("Total de tempo do album: " + hora +":" + minutos + ":" + totalSegundos);




    }

}
