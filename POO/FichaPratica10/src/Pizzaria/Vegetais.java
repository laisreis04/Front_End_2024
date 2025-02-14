package Pizzaria;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.TipoVegetais;
import Pizzaria.Enums.UnidadeMedida;

public class Vegetais extends Topping{

    private TipoVegetais tipoVegetais;

    public Vegetais(String codigo, String nome, UnidadeMedida unidadeMedida, double nCaloriasUnidadeMedida, OrigemIngrediente origemIngrediente, TipoVegetais tipoVegetais) {
        super(codigo, nome, unidadeMedida, nCaloriasUnidadeMedida, origemIngrediente);
        this.tipoVegetais = tipoVegetais;
    }
}
