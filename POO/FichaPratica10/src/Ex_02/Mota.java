package Ex_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mota extends Veiculo{


    public Mota(String marca, String modelo, int anoFrabricacao, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double litros100Km) {
        super(marca, modelo, anoFrabricacao, potencia, cilindrada, tipoCombustivel, litros100Km);
    }


    //Imprimir Imagem
    public void imprimirMotinha() throws FileNotFoundException{

        File file = new File("Ficheiros/Mota (1).txt");
        Scanner sc = new Scanner(file);

        String linha;
        while (sc.hasNextLine()){
            linha = sc.nextLine();
            System.out.println(linha);
        }

    }
}
