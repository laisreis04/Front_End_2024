package Ex_03;

public class Animal {

    private  String nome;
    private String especie;
    private String paisOrigem;
    private double peso;
    private String[] listaAlimentos;


    public Animal(String nome, String especie, String paisOrigem, double peso, String[] listaAlimentos) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.listaAlimentos = listaAlimentos;
    }

    public void comer(String alimento, double pesoGramas){

        for(int i = 0; i< listaAlimentos.length; i++){
            if(alimento.equals(this.listaAlimentos[i])){
                this.peso += (pesoGramas/1000);
                System.out.println("Animal Comeu");
            }else {
                System.out.println(" Animal recusou a comida");
            }

        }

    }

    public double getPeso() {
        return peso;
    }
}
