package Ex_01;

public class Carro {

//Atributos

    private String marca;
    private String modelo;
    private int ano;
    private int potencia;
    private int cilindrada;
    Tipo_Combustivel tipoCombustivel;
    private double consumo100;


    public Carro(String marca, String modelo, int ano, int potencia, int cilindrada, Tipo_Combustivel tipoCombustivel, double consumo100) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.consumo100 = consumo100;
    }
}
