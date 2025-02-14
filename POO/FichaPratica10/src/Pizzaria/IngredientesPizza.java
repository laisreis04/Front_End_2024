package Pizzaria;

import Pizzaria.Enums.UnidadeMedida;

public class IngredientesPizza {

    private Ingrediente ingrediente;
    private double quantidade;

    public IngredientesPizza(Ingrediente ingrediente, double quantidade) {
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }

    //Para passar aa informação para outras classes

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void detalhesIngredientesPizza(){
       if(this.ingrediente.getUnidadeMedida() == UnidadeMedida.GRAMAS){
           ingrediente.detalhesIngredientes();
           System.out.print(this.quantidade + " g\n");
       } else if (this.ingrediente.getUnidadeMedida() == UnidadeMedida.UNIDADES) {
           ingrediente.detalhesIngredientes();
           System.out.print(this.quantidade + " uni\n");
       } else if (this.ingrediente.getUnidadeMedida() == UnidadeMedida.LITROS) {
           ingrediente.detalhesIngredientes();
           System.out.print(this.quantidade + " L\n");
       }

    }

}
