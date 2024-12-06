package FichaPratica_05;

public class Ex_03 {

    /**
     * Função para verificar se o número é par
     * @param numero
     * @return - True -> se par | False -> Impar
     */
    public static boolean numeroPar(int numero) {

        if(numero % 2  == 0){
            return true;
        }else{
            return false;
        }

    }

    /**
     * Função para verificar se o número é positivo
     * @param numero
     * @return True -> Numeros positivos
     */
    public static boolean numeroPositivo(int numero) {
        if(numero >= 0){
            return true;
        }else {
           return false;
        }
    }

    /**
     * Função para avaliar se o número é primo
     * @param numero
     * @return - True para numeros primos
     */
    public static boolean numeroPrimo(int numero){
        for(int divisor = 2; divisor < numero; divisor++){
           //Verifica que NÂO é primo
            if(numero % divisor == 0){}
            return false;
        }
        return true;
    }


}