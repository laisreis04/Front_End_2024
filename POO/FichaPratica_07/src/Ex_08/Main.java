package Ex_08;

public class Main {


    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João Pedro", 29, "Restauro",18.9);

        String situacaoAluno;

        situacaoAluno = aluno1.situacao();
        System.out.println(situacaoAluno);


    }
}
