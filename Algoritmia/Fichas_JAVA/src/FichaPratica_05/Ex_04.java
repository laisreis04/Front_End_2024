package FichaPratica_05;

import java.util.Scanner;

import static FichaPratica_05.Ex_03.*;

public class Ex_04 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int numInteiro, opcao;

        System.out.print("Insira um número inteiro: ");
        numInteiro = input.nextInt();

    do{
        System.out.println("O que você quer analisar?");
        System.out.println("1. Para ou impar");
        System.out.println("2. Positivo ou Negativo");
        System.out.println("3. Número Primo");
        System.out.println("4. Número Perfeito");
        System.out.println("5. Número Triangular");
        System.out.println("0. Sair");
        opcao = input.nextInt();


        switch (opcao){
            case 1:
                if(numeroPar(numInteiro)){
                    System.out.println("É par\n");
                }else {
                    System.out.println("Ímpar\n");
                }
            case 2:
                if (numeroPositivo(numInteiro)){
                    System.out.println("Numero é Positivo\n");
                }else {
                    System.out.println("Não é Positivo\n");
                }
            case 3:
                if (numeroPrimo(numInteiro)){
                    System.out.println("Número Primo\n");
                }else {
                    System.out.println("Não é Primo\n");
                }
            case 4:
                if (numeroPerfeito(numInteiro)){
                    System.out.println("Número Perfeito\n");
                }else {
                    System.out.println("Não é Perfeito\n");
                }
            case 5:
                if(numeroTriangular(numInteiro)){
                    System.out.println("Número Triangular\n");
                }else {
                    System.out.println("Não é Triangular\n");
                }
            default:
                System.out.println("Insira uma opção válida");
        }



    }while(opcao != 0);


    }
}
