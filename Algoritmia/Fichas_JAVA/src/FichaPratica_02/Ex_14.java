package FichaPratica_02;

import java.util.Scanner;

public class Ex_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, aux, res;

        System.out.println("Insira um número: ");
        num = input.nextInt();

        res = num;
        aux = num - 1;

        while (aux < num && aux > 0) {
            res = res * aux;
            aux--;
        }

        System.out.println(res);

    }
}
