package Ex_01;

public class Aviao {

    //Atributos
    private int numSerie;
    private String modelo;
    private int anoFrabrico;
    private double peso;
    private double comprimentoFuselagem;
    private double envergaduraAsas;
    private double alturaCalda;
    private int numMotores;
    private double autonomia;
    private double velocidadeMax;
    private double preco;


    //Construtor


    public Aviao(int numSerie, String modelo, int anoFrabrico, double peso, double comprimentoFuselagem, double envergaduraAsas, double alturaCalda, int numMotores, double autonomia, double velocidadeMax, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFrabrico = anoFrabrico;
        this.peso = peso;
        this.comprimentoFuselagem = comprimentoFuselagem;
        this.envergaduraAsas = envergaduraAsas;
        this.alturaCalda = alturaCalda;
        this.numMotores = numMotores;
        this.autonomia = autonomia;
        this.velocidadeMax = velocidadeMax;
        this.preco = preco;
    }


    public double getPreco() {
        return preco;
    }

    public void imprimirDetalhesAviao(){
        System.out.println("NºSerie: " + numSerie);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano Fabricação: " + anoFrabrico);
        System.out.println("Preço: " + preco);

    }

}
