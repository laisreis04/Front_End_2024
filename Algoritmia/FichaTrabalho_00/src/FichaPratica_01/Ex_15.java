package FichaPratica_01;

import java.util.Scanner;

public class Ex_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3, menor = 0, maior = 0, medio = 0;


        System.out.print("Número A: ");
        num1 = input.nextInt();

        System.out.print("Número B: ");
        num2 = input.nextInt();

        System.out.print("Número C: ");
        num3 = input.nextInt();

        System.out.print("Escolha a ordem dos números. \nUse 'C' para crescente, e 'D' para descrecente.\nSua ordem = ");
        char ordem = input.next().charAt(0);

        if (ordem == 'C') {
            if (num1 <= num2 && num1 <= num3) {
                menor = num1;
                if (num2 <= num3) {
                    medio = num2;
                    maior = num3;
                } else {
                    medio = num3;
                    maior = num2;
                }
            } else if (num2 <= num1 && num2 <= num3) {
                menor = num2;
                if (num1 <= num3) {
                    medio = num1;
                    maior = num3;
                } else {
                    medio = num3;
                    maior = num1;
                }

            } else {
                menor = num3;
                if (num1 <= num2) {
                    medio = num1;
                    maior = num2;
                } else {
                    medio = num2;
                    menor = num3;
                }
            }
            System.out.print("Ordem crescente é :" + menor + "," + medio + "," + maior);
        } else if (ordem == 'D') {
            if (num1 >= num2 && num1 >= num3) {
                maior = num1;
                if (num2 >= num3) {
                    medio = num2;
                    menor = num3;
                } else {
                    medio = num3;
                    maior = num2;
                }
            } else if (num2 >= num1 && num2 >= num3) {
                maior = num2;
                if (num1 >= num3) {
                    medio = num1;
                    menor = num3;
                } else {
                    medio = num3;
                    menor = num1;
                }

            } else {
                maior = num3;
                if (num1 >= num2) {
                    medio = num1;
                    menor = num2;
                } else {
                    medio = num2;
                    menor = num3;
                }

            }

            System.out.print("Ordem Decrescente é :" + maior + "," + medio + "," + menor);
        }
    }
}
