package FichaPratica_02;

import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {

        //Scanner para ler 2 numeros
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Insira o limite do contador: ");
        int limite = inputUser.nextInt();

        System.out.print("Insira o salto do contador: ");
        int salto = inputUser.nextInt();

        //Variaveis -> contador para ser impresso na consola
        int contador = 0;

        //Ciclo
        while (contador <= limite) {
            System.out.println(contador);
            contador = contador + salto;
        }

    }
}
