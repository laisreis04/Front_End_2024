package FichaPratica_06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex_02 {

    public static void main(String[] args) throws FileNotFoundException {

        //Caminho onde vou guardar o ficheiro
        File ficheiroNovo = new File("Fichas_JAVA/Ficheiros_06/exercicio_02.txt");

        //Máquina para escrever no meu ficheiro
        PrintWriter maquinaEsrever = new PrintWriter(ficheiroNovo);


        //Conteudo do ficheiro - mensagem
        String minhaMensagem = "Deu certo!!!!! Uhulllllll";

        //Impirmir no ficheiro
        maquinaEsrever.println(minhaMensagem);

        //Fechar a máquina
        maquinaEsrever.close();


    }
}
