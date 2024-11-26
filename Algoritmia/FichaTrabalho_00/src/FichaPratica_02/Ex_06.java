package FichaPratica_02;

public class Ex_06 {

    public static void main(String[] args){


        //Varivais - Soma, num1, num100
        int num01 = 1,  soma = 0;

        //Ciclo

        while(num01 >= 1 && num01 <= 100){
            System.out.println(num01);
            soma = soma + num01;
            num01++;
        }
        System.out.println("Soma total é : " + soma);

    }
}
