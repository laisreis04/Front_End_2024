package Ex_11;

public class Conta {

//Atributos
    private int numeroConta;
    private double saldo;
    private String titularConta;

    //Construtor

    public Conta(int numeroConta, double saldo, String titularConta) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titularConta = titularConta;
    }

    //depositar

    /**
     * Método para calcular o deposito
     * @param valorDeposito
     */
    public void depositar(double valorDeposito){

        this.saldo += valorDeposito;
        System.out.println("Foram depositato: " + valorDeposito + "\nSaldo atual: " + this.saldo + "\n");
    }


    //Sacar

    /**
     * Método para calcular o valor levantado
     * @param valorLevantado
     */
    public void levantar(double valorLevantado){

        if(this.saldo >= valorLevantado){
            this.saldo -= valorLevantado; //Atualiza o valor
            System.out.println("Levantou: " + valorLevantado + "\nSaldo atual: " + saldo + "\n");
        }else {
            System.out.println("Saldo insificiente");
        }
    }

    //Mostar saldo
    public  void mostarSaldo(){
        System.out.println("******* BANCO CESAE ********");
        System.out.println("Nome do titular: " + this.titularConta);
        System.out.println("Saldo atualizado: " + this.saldo);

    }

    //Transferir

    /**
     * Método que realiza tranferencias para outras contas
     * @param valorTranferido
     * @param contaDestino
     */
    public void transferencia(double valorTranferido, Conta contaDestino){

        if(this.saldo >= valorTranferido){
            this.saldo -= valorTranferido; //Saldo atualizado
            contaDestino.saldo += valorTranferido;
            System.out.println("Tranferencia bem sucedida !!");
            System.out.println(this.titularConta + ", tranferiu para " + contaDestino.titularConta);
        }

}

}
