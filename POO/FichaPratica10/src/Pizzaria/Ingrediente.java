package Pizzaria;

import Pizzaria.Enums.UnidadeMedida;

public class Ingrediente {

    private String codigo, nome;
    private UnidadeMedida unidadeMedida;
    private double nCaloriasUnidadeMedida;

    //Construtor para instaciar um ingrediente


    public Ingrediente(String codigo, String nome, UnidadeMedida unidadeMedida, double nCaloriasUnidadeMedida) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.nCaloriasUnidadeMedida = nCaloriasUnidadeMedida;
    }

    public String getNome() {
        return nome;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getnCaloriasUnidadeMedida() {
        return nCaloriasUnidadeMedida;
    }

    //Imprimir detalhes dos ingredientes
public void detalhesIngredientes(){

    System.out.print("[" + this.codigo + "| " + this.unidadeMedida + "| " + nCaloriasUnidadeMedida + "Kcal ] :");
}


}
