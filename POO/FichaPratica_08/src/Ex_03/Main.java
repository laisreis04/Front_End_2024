package Ex_03;

public class Main {

    public static void main(String[] args) {

        Animal cao = new Animal("Pandora", "Fiapinho de manga", "Brasil",5,new String[]{"Banana","racao","cenoura"});

        System.out.println("Peso = "+ cao.getPeso() );


        cao.comer("Banana", 300);

        System.out.println("Peso = "+ cao.getPeso() );

    }
}
