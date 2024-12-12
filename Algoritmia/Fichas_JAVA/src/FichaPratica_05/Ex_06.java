package FichaPratica_05;

import FichaPratica_05.Ex_05.*;
import java.util.Scanner;

import static FichaPratica_05.Ex_05.*;

public class Ex_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Variaveis - Tamanho (do array) e Opção(para seleção do menu)
        int tamanhoArray, opcao;

        System.out.print("Insira o tamanho do seu array: ");
        tamanhoArray = input.nextInt();

        int[] vetor = new int[tamanhoArray];

        //Pedir ao user que coloque os valores em cada "gaveta"
        for(int i = 0; i < tamanhoArray;i++){
            System.out.print("Insira o valor da posição[ " + i + "]: ");
            vetor[i] = input.nextInt();
        }

        //Criar o menu de seleção

        do{
            System.out.println("******************");
            System.out.println("1. Maior Número");
            System.out.println("2. Menor Número");
            System.out.println("3. Crescente ou não Crescente ");
            System.out.println("4. Sair");
            System.out.print("Escolha a sua opção: ");
            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("******************");
                    System.out.println("Maior número é: " + maior(vetor));
                    break;
                    case 2:
                        System.out.println("******************");
                        System.out.println("Menor número é: " + menor(vetor));
                        break;
                        case 3:
                            if(ordemCrescente(vetor)){
                                System.out.println("******************");
                                System.out.println("É Crescente !");
                            }else {
                                System.out.println("******************");
                                System.out.println("Não é crescente");
                            }
                            break;
                default:
                    System.out.println("Opção não encontrada");
            }
        }while(opcao != 4);

    }
}
