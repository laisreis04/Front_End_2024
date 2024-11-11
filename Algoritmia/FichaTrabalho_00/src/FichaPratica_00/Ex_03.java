package FichaPratica_00;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Insira largura
        System.out.println("Insira a largura: ");
        double largura = input.nextDouble();

        //Insira altura
        System.out.println("Insira altura: ");
        double altura = input.nextDouble();

        //Calcular área

        double area = largura * altura;

        //Calcular Perimetro
        double perimetro = 2 * (largura) + 2 * (altura);

        //Imprimir o resultado
        System.out.println("Área = " + area);
        System.out.println("Perimetro = " + perimetro);

    }
}
