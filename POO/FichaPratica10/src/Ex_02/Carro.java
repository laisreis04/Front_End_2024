package Ex_02;

public class Carro extends Veiculo{

     private int quantidadePassageiros;


    public Carro(String marca, String modelo, int anoFrabricacao, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double litros100Km, int quantidadePassageiros) {
        super(marca, modelo, anoFrabricacao, potencia, cilindrada, tipoCombustivel, litros100Km);
        this.quantidadePassageiros = quantidadePassageiros;
    }

    //Metodo para calcular o custo
    public double calcularCusto(double distancia){

        TipoCombustivel tipoCombustivel = this.getTipoCombustivel();
        double consumo = consumoCombustivel(distancia);
        double custoTotal = 0;

        switch (tipoCombustivel){
            case GASOLINA -> custoTotal = consumo * 2.10;
            case DIESEL -> custoTotal = consumo * 1.67;
            case GPL -> custoTotal = consumo * 1.10;
            case ELETRICO -> custoTotal = consumo * 0.12;
        }
        return custoTotal;


    }

}
