package Pizzaria;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.UnidadeMedida;

public class Topping extends Ingrediente{

    private OrigemIngrediente origemIngrediente;

    public Topping(String codigo, String nome, UnidadeMedida unidadeMedida, double nCaloriasUnidadeMedida, OrigemIngrediente origemIngrediente) {
        super(codigo, nome, unidadeMedida, nCaloriasUnidadeMedida);
        this.origemIngrediente = origemIngrediente;
    }
}
