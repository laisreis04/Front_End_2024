package Ex_06;

public class Competicao {

    private String nomeCompeticao;
    private String paisRealizado;

    private Atleta[] listaCOmpetidores;

    public Competicao(String nomeCompeticao, String paisRealizado) {
        this.nomeCompeticao = nomeCompeticao;
        this.paisRealizado = paisRealizado;
        listaCOmpetidores = new Atleta[6]; //Iniciamos o tamanho do nosso array
    }

    public void adicionarAtleta(Atleta atleta){
        for(int i = 0; i < listaCOmpetidores.length; i++){
            if(this.listaCOmpetidores[i] == null){ //Verifico qual a próximo "gaveta" uqe etsá livre para preencher com um valor
                listaCOmpetidores[i] = atleta;  //preencho a "gaveta" do array vazio , com o valor do atleta
                return;
            }
        }
    }

    /**
     * Metodo para imprimir as informções dos participantes da competição
     */
    public void informacoesCompeticao(){
        System.out.println("Nome da Competição: " + this.nomeCompeticao);
        System.out.println("País: " + this.paisRealizado);
        System.out.println();
        System.out.println("Atletas:\n");
        for (int i = 0; i < listaCOmpetidores.length; i++){
            if (this.listaCOmpetidores[i] != null){
                listaCOmpetidores[i].detalhesAtletas();
                System.out.println();
            }
        }
        System.out.println();
    }

}
