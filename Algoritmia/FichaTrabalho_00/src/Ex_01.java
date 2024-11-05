import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        //Iniserir numeros - variaveis
        int numero1, numero2;

        System.out.println("Insira um número:");
        numero1 = input.nextInt();
        System.out.println("Insira um número:");
        numero2 = input.nextInt();

        //Execução da soma
        int soma;

        soma = numero1 + numero2;

        //Imprimir na consola

        System.out.println("Resultado é : " + soma);

    }
}
