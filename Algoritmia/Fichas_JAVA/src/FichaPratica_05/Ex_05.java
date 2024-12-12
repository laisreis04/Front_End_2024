package FichaPratica_05;

public class Ex_05 {

    /**
     * Função para encontrar o maior valor de um array
     * @param array
     * @return - Maior valor
     */
    public static int maior(int[] array){

        int maior = array[0];

        //Ciclo para verificar todas as gavetas
        for(int i = 1; i < array.length; i++){
            if(array[i] > maior){
                maior = array[i];
            }
        }
        //Retornar um valor
        return maior;
    }

    /**
     * Função que verificar o menor valor de um array
     * @param array
     * @return - Menor valor
     */
    public static int menor (int[] array) {

        //Variavel para guardar o menor valor
        int menor = array[0];

        //Ciclo para verificar todos os valores do array
        for(int i = 1; i < array.length; i++){
            //Conferir e guardar o menor valor do array
            if(array[i] < menor){
                menor = array[i];
            }
        }
        //Retornar o menor numero
        return menor;
    }

    /**
     * Função que verifica se o array está em ordem crescente
     * @param array
     * @return - True se for crescente
     */
    public static boolean ordemCrescente (int[] array) {

        int numAnterior = array[0];

        //Ciclo para verificar se o valor anetrior é menor
        for(int i = 0; i < array.length; i++){
            //Verificar se na "gaveta" anterior o valor é menor
            if(array[i] < numAnterior){
                return false;
            }
            numAnterior = array[i];
        }
        return true;
    }




}
