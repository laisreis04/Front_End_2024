package Ex_09;

public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto("PC", 1500,15);


        produto1.comprar(5);

        produto1.vender(10);

        produto1.comprar(10);

        produto1.vender(35);

        produto1.comprar(40);


    }
}
