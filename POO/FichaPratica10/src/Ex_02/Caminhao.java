package Ex_02;

public class Caminhao extends Veiculo{

    private double capacidadeCargaKg;

    public Caminhao(String marca, String modelo, int anoFrabricacao, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double litros100Km, double capacidadeCargaKg) {
        super(marca, modelo, anoFrabricacao, potencia, cilindrada, tipoCombustivel, litros100Km);
        this.capacidadeCargaKg = capacidadeCargaKg;
    }

    //Metodo para calcular a viagem
    public void viagem(double distancia, double carga){
        if(this.capacidadeCargaKg < carga){
            System.out.println("O caminhão não tem capacidade para levar a carga");
        }else {
            double aumentoCarga = carga/100;
            double consumo = (this.getLitros100Km() + (aumentoCarga*10)) * (distancia/100);
            double custoTotal = consumo * 1.67;
            System.out.println("O caminhão consumiu durante a viagem " + consumo + " Litros");
            System.out.println("O custo total da viagem é de " + custoTotal + " €");
        }
    }


}
