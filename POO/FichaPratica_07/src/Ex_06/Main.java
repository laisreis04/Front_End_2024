package Ex_06;

public class Main {

    public static void main(String[] args) {


        //Criar um novo objeto
        Calculadora cal1  = new Calculadora();

        //Imprimir os valores

        System.out.println("Soma = " + cal1.adicao(5,8));
        System.out.println("Subtração = " + cal1.subtracao(5,8));
        System.out.println("Divisão = " + cal1.divisao(5,8));
        System.out.println("Multiplicação = " + cal1.multiplicacao(5,8));

    }
}
