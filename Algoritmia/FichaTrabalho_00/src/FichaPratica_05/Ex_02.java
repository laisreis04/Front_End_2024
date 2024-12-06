package FichaPratica_05;

import java.util.Scanner;

public class Ex_02 {

    /**
     * Método para ler número inteiro e positivos
     * @return - Numero Inteiro e Positivo
     */
    public static int lerNumeroPositivo(){

        Scanner input = new Scanner(System.in);

        int numero;

        do{
            System.out.print("Digite um numero positivo: ");
            numero = input.nextInt();
        }while(numero <= 0);

        return numero;
    }

    /**
     * Função para imprirmir os asteristicos
     * @param numeroAsteristicos
     */
    public static void imprimirAsteristicos(int numeroAsteristicos){
        //Ciclo para imprimir os asteritiscos até o numero que o usário colocou
        for(int i=0; i < numeroAsteristicos; i++){
            System.out.print("*");
        }
    }

    public static void main(String[] args) {

        int numLido = lerNumeroPositivo();

        imprimirAsteristicos(numLido);
    }

}
