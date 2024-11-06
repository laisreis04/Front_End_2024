import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args){

        //Pedir ao user 2 numeros
        Scanner input = new Scanner(System.in);

        int num1, num2,soma,subtracao,multiplicacao, divisao;

        System.out.print("Insira um número: ");
        num1 = input.nextInt();
        System.out.print("Insira um número: ");
        num2 = input.nextInt();

        //Calcular soma
       soma = num1 + num2;

        //Calcular subtração
        subtracao = num1 - num2;

        //Calcular divisão
        divisao = num1 / num2;

        //Calcular multiplicação
        multiplicacao = num1 * num2;

        //Imprimir o resultado na consola

        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Divisão = " + divisao);
        System.out.println("Multiplicação = " + multiplicacao);
    }
}
