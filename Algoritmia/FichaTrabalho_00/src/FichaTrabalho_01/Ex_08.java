package FichaTrabalho_01;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


        //Variaveis
        double nota1, nota2, nota3, media;

     //Entrada de dados
        System.out.print("Introduza a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.print("Introduza a segunda nota: ");
        nota2 = input.nextDouble();
        System.out.print("Introduza a terceira nota: ");
        nota3 = input.nextDouble();


     //Condição - Aprovação

        media = (nota1*0.25 + nota2*0.35 + nota3*0.40) / (0.25+0.35+0.40);

        if(media > 9.5){
            System.out.println("Parabéns você está aprovado");
        }else {
            System.out.println("Infelizmente não foi dessa vez - Reprovado");
        }

    }
}
