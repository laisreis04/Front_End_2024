package Ex_10;

public class Funcionario {

    //Atributos
    private String nome;
    private double salario;
    private String departamento;

    //Construtor

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    //aumentar o salario


    /**
     * Método que aumentar o valor finaç do salário do funcionário
     * @param valor (Percentagem a ser aumentada)
     */
    public void aumentarSalario(double valor){
        this.salario = salario +(salario * valor);
        System.out.println("O salário foi aumentado. Salário: " + this.salario);
    }

    //Exibir os dados

public void exibirDetalhes(){

    System.out.println("****** Dados do Funcionário ******");
    System.out.println("Nome: " + nome);
    System.out.println("Salário: " + salario);
    System.out.println("Departamento: " + departamento);
    System.out.println("**********************************");

}
}
