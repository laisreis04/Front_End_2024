package Ex_02;

public class Conta {

    private int numConta;
    private double saldo;
    private String titularConta;
    private int anoAbertura = 2023;
    private double margimEmprestimo = 0.9;
    private double valorDivida;


    public Conta(int numConta, double saldo, String titularConta) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titularConta = titularConta;
    }

    public boolean pedirEmprestimo(double valor){
        if(this.valorDivida == 0){
            if(this.saldo * margimEmprestimo >= valor){
                this.saldo += valor;
                this.valorDivida = valor;
                System.out.println("Emprestimo aprovado");
                return true;
            }

        }else if(valorDivida > 0){
            System.out.println("Não foi possivel fazer o emprestimo, pois já consta dividas");
        }else {
            System.out.println("Emprestimo negado");
            return  false;
        }
    return false;
    }


}
