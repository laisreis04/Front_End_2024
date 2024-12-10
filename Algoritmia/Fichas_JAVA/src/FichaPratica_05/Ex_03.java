package FichaPratica_05;

public class Ex_03 {

    /**
     * Método que avalia se um numero é par
     * @param num Número a ser avaliado
     * @return True se par, False se impar
     */
    public static boolean numeroPar(int num) {
        if (num%2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Método que avalia se um numero é positivo
     * @param num Número a ser avaliado
     * @return True se positivo, False se negativo
     */
    public static boolean numeroPositivo(int num) {
        if (num>=0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que avalia se um numero é primo
     * @param num Número a ser avaliado
     * @return True se primo, False se não primo
     */
    public static boolean numeroPrimo(int num) {

        for (int divisor = 2; divisor<num; divisor++) {
            if(num%divisor==0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Método que avalia se um numero inteiro é perfeito
     * @param num
     * @return - True quando perfeito
     */
    public static boolean numeroPerfeito(int num){

        int soma = 0;

        for(int contador = 1; contador < num; contador++){

            if(num % contador == 0){
                soma += contador;    // soma = soma + contador
            }
        }
        if(soma == num){
            return true;
        }else {
            return false;
        }
}

public static boolean numeroTriangular(int num){

        int soma = 0;

        for(int contador = 1; contador < num; contador++){
            soma += contador;    //soma = soma + contador
            if(soma == num){
                return true;
            }
        }
        return false;
}


}
