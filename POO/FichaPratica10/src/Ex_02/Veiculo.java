package Ex_02;

public class Veiculo {
    private String marca;
    private String modelo;
    private int anoFrabricacao;
    private int potencia;
    private int cilindrada;
    private TipoCombustivel tipoCombustivel;
    private double litros100Km;


    public Veiculo(String marca, String modelo, int anoFrabricacao, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double litros100Km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFrabricacao = anoFrabricacao;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.litros100Km = litros100Km;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getLitros100Km() {
        return litros100Km;
    }

    public String getMarca() {
        return marca;
    }

    //metodo ligar()
    public void ligar(){
        int idade = 2025 - this.anoFrabricacao;
        if(idade > 30){
            if(this.tipoCombustivel.equals(TipoCombustivel.DIESEL)){
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }else{
                System.out.println("Custa a pegar...O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }
        }
        if(idade <= 30){
            if(this.potencia < 250){
                System.out.println("O carro está ligado!");
                System.out.println("Vrummmmmmmmm");
            }else {
                System.out.println("O carro está ligado!");
                System.out.println("VRUMMMMMMMMM");
            }
        }
    }

    //metodo corrida
    public Veiculo corrida(Veiculo adversario){
        if(this.potencia > adversario.potencia){
            return this;
        } else if (this.potencia < adversario.potencia) {
            return  adversario;
        }else if(this.potencia == adversario.potencia){
            if(this.cilindrada > adversario.cilindrada){
                return this;
            } else if (this.cilindrada < adversario.cilindrada) {
                return adversario;
            } else if (this.cilindrada == adversario.cilindrada) {
                if(this.anoFrabricacao > adversario.anoFrabricacao){
                    return this;
                } else if (this.anoFrabricacao < adversario.anoFrabricacao) {
                    return adversario;
                }
            }
        }
        return null;

    }

    //metodo consumo
public double consumoCombustivel(double distancia){
        double valorConsumo = this.litros100Km *(distancia/100);
        return valorConsumo;

}


}
