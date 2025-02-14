package Pizzaria;

import Pizzaria.Enums.OrigemIngrediente;
import Pizzaria.Enums.TipoFrutoMar;
import Pizzaria.Enums.UnidadeMedida;

public class FrutosMar extends Topping{

    private TipoFrutoMar tipoFrutoMar;

    public FrutosMar(String codigo, String nome, UnidadeMedida unidadeMedida, double nCaloriasUnidadeMedida, OrigemIngrediente origemIngrediente, TipoFrutoMar tipoFrutoMar) {
        super(codigo, nome, unidadeMedida, nCaloriasUnidadeMedida, origemIngrediente);
        this.tipoFrutoMar = tipoFrutoMar;
    }
}
