package Ex_01;

import java.util.ArrayList;

public class AviaoCombate extends Aviao {

private String paisOrigem;
private boolean camuflagem;
private ArrayList<Armas> armas;


//Construtor


    public AviaoCombate(int numSerie, String modelo, int anoFrabrico, double peso, double comprimentoFuselagem, double envergaduraAsas, double alturaCalda, int numMotores, double autonomia, double velocidadeMax, double preco, String paisOrigem, boolean camuflagem) {
        super(numSerie, modelo, anoFrabrico, peso, comprimentoFuselagem, envergaduraAsas, alturaCalda, numMotores, autonomia, velocidadeMax, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.armas = new ArrayList<Armas>();
    }

    //Inserir Armas - array
    public void adicionarArma(Armas arma){
        armas.add(arma);
    }

    public void removerArma(Armas armaRemovida){
        armas.remove(armaRemovida);
    }

    //Imprimir detalhe das armas
    public void imprimirArmas(){
        System.out.println("***** ARMAS ******");
        for(int i = 0; i < armas.size();i++){
            System.out.println("Arma (" + i + "): " + armas.get(i));
        }
    }

    //Imprimir detalhes aviao
    public void impirmirDetalheAviaoComabate(){
        System.out.println("País de Origem: " + this.paisOrigem);
        System.out.println("Camuflagem: " + this.camuflagem);

    }

}
