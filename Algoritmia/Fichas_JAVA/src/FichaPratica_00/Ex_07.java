package FichaPratica_00;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args){

        Scanner inputUser = new Scanner(System.in);
        //Pedir os preços dos produtos

        System.out.println("Informe o primeiro valor: ");
        double preco1 = inputUser.nextDouble();
        System.out.println("Informe o segundo valor: ");
        double preco2 = inputUser.nextDouble();
        System.out.println("Informe o terceiro valor: ");
        double preco3 = inputUser.nextDouble();

        System.out.println("******************");

        //Aplicar o desconto de 10%

        double totalDesconto = (preco1 +preco2 +preco3) * 0.9;

        //Imprimir na consola
        System.out.println("O seu total com desconto é: " + totalDesconto);
    }
}
