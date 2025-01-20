package Ex_09;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade = 0;


    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void comprar(int quantidadeDesejada){

        this.quantidade += quantidadeDesejada;
        System.out.println("A compra foi bem sucedida. \nO estoque foi atualizado. Quantidade: " + this.quantidade);

    }


    public void vender(int quantidadeDesejada){

        if(this.quantidade >= quantidadeDesejada){
            this.quantidade -= quantidadeDesejada;
            System.out.println("Foram vendidos: " + quantidadeDesejada + "\nO estoque foi atualizado. Quantidade: " + quantidade);
        }else {
            System.out.println("Estoque insuficiente");
        }

    }


}
