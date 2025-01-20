package Ex_10;

public class Main {

    public static void main(String[] args) {


        Funcionario funcionario1 = new Funcionario("Nicolau",2000,"Cibersegurança" );


        funcionario1.exibirDetalhes();

        System.out.println();

        funcionario1.aumentarSalario(0.10);

        System.out.println();

        funcionario1.exibirDetalhes();

    }
}
