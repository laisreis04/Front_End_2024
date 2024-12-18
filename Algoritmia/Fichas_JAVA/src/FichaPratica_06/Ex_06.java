package FichaPratica_06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) throws FileNotFoundException {

        //Ler o arquivo (ficheiro)
        File ficheiroNomesIdades = new File("Fichas_JAVA/Ficheiros_06/exercicio_06.txt");
        Scanner scanner = new Scanner(ficheiroNomesIdades);

        String nomePessoaMaisVelha = " ";
        int idadePessoaMaisVelha = 0;

        while(scanner.hasNextLine()){

            String linha = scanner.nextLine();
            //Separado por virgulas -> split
            String[] todasIdades = linha.split(",");

            String nomes = todasIdades[0];
            int idades = Integer.parseInt(todasIdades[1]);

            //Verificar a pessoa mais velha
            if(idades > idadePessoaMaisVelha){
                idadePessoaMaisVelha = idades;
                nomePessoaMaisVelha = nomes;
            }


        }
        //Imprimir o nome da pessoa mais velha

        System.out.println("A pessoa mais velha é " + nomePessoaMaisVelha + " e a sua idade é " + idadePessoaMaisVelha);


scanner.close();
    }


}
