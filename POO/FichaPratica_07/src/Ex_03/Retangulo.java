package Ex_03;

public class Retangulo {


    double largura;
    double altura;


    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }


    public double calcularArea(){
        return  this.largura * this.altura;
    }

    public double calcularPerimetro(){

        return (this.altura*2) + (this.largura*2);
    }



}
