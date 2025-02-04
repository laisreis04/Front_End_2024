package Ex_05;

public class Pessoa {

    private String nome;
    private int idade;
    private String email;
    private int numTelefone;

    public Pessoa(String nome, int idade, String email, int numTelefone) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.numTelefone = numTelefone;
    }

    public void exibirDetalhes(){

         System.out.println("Nome: " + nome);
         System.out.println("Idade: " + idade);
         System.out.println("Email : " + email);
         System.out.println("Nº Telefone: " + numTelefone);
        System.out.println("*********************************");
}
}
