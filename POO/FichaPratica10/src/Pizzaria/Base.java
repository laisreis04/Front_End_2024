package Pizzaria;

import Pizzaria.Enums.BasePizza;
import Pizzaria.Enums.UnidadeMedida;

public class Base extends Ingrediente{

    private BasePizza basePizza;

    public Base(String codigo, String nome, UnidadeMedida unidadeMedida, double nCaloriasUnidadeMedida, BasePizza basePizza) {
        super(codigo, nome, unidadeMedida, nCaloriasUnidadeMedida);
        this.basePizza = basePizza;
    }
}
