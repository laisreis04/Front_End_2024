package Ex_11;

public class Main {
    public static void main(String[] args) {


        Conta conta1 = new Conta(001,500,"Ricardo");
        Conta conta2 = new Conta(002,300,"Camões");
        Conta conta3 = new Conta (003,200,"Super Mário");


        conta1.depositar(2000);
        conta1.mostarSaldo();
        conta1.levantar(200);

        System.out.println();


        conta1.transferencia(500,conta2);
        System.out.println();
        conta1.mostarSaldo();
        System.out.println();
        conta2.mostarSaldo();




    }
}
