package FichaTrabalho_01;

import java.util.Scanner;

public class Ex_12 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        //Entrada de dados
        System.out.println("Escolha uma opção: \n1.Criar \n2.Atualizar \n3.Eliminar \n4.Sair");
        int opcaoUser = input.nextInt();

        //Criar o menu com opções
        switch (opcaoUser){

            case 1:
                System.out.println("Criar selecionado");
                break;
            case 2:
                System.out.println("Atualizar selecionado");
                break;
                case 3:
                    System.out.println("Eliminar selecionado");
                    break;
            case 4:
                System.out.println("Sair selecionado");
                break;

            default:
                System.out.println("Opção Inválida");

        }

    }

}
