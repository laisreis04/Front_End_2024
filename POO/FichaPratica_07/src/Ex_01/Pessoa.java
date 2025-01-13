package Ex_01;

public class Pessoa {


    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void ImprimirDados(){

        System.out.println("******Dados do novo aluno******");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade" + idade);
        System.out.println("Altura"  + altura);

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
}
