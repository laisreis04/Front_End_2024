package FichaPratica_02;

public class Ex_02 {

    public static void main(String[] args){


        //Iniciar variavel
        int numero = 1;


        //Condição 1 - 1 a 400
        while(numero >= 1 && numero <= 400){

            //Condição 2 - Numeros pares
            if(numero % 2 == 0){
                System.out.println(numero);
            }
            numero++;

        }

    }
}
