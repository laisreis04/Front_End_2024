package Ex_06;

public class Atleta {

    private String nome;
    private String modalidade;
    private double altura;
    private double peso;
    private String paisOrigem;

    public Atleta(String nome, String modalidade, double altura, double peso, String paisOrigem) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
        this.paisOrigem = paisOrigem;
    }

    public void detalhesAtletas(){
        System.out.println("Nome: " + this.nome + " | Modalidade Desportiva: " + this.modalidade + " | Altura: " + this.altura + " | Peso: " + this.peso + " | País de Origem: " + this.paisOrigem);
    }
}
