package Ex_05;

public class Carro {

private String marca;
private String modelo;
private int anoFabricacao;


    public Carro(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }


    public void ligar(){

        System.out.println("O carro está ligado !!!");
    }

}
