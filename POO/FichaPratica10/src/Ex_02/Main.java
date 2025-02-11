package Ex_02;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Carro fiatPanda = new Carro("Fiat","Panda", 2020,250,1200,TipoCombustivel.GASOLINA,6.5,5);
        Carro mini = new Carro("Mini", "Cooper", 2008, 200, 100, TipoCombustivel.DIESEL, 5.5,4);
        Mota mota1 = new Mota("Volkswagen", "M-3", 2015, 250, 120, TipoCombustivel.GASOLINA, 3);
        Caminhao camiao1 = new Caminhao("Audi", "C8", 2005, 200, 100, TipoCombustivel.DIESEL,18,500);

        Veiculo race1 = fiatPanda.corrida(mini);

        if(race1 != null){
            System.out.println("O vencedor é : " + race1.getMarca());
        }else {
            System.out.println("Empate");
        }

        Veiculo race2 = mota1.corrida(camiao1);
        if(race2 != null){
            System.out.println("O vencedor é : " + race2.getMarca());
        }else {
            System.out.println("Empate");
        }

        double custoViagem  = fiatPanda.calcularCusto(300);
        System.out.println(" O valor total da viagem é de: " + custoViagem + " €");

        camiao1.viagem(300,450);
        camiao1.viagem(300,600);


        mota1.imprimirMotinha();

    }
}
