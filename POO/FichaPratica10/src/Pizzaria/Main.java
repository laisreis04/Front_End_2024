package Pizzaria;

import Pizzaria.Enums.*;

public class Main {

    public static void main(String[] args) {
        //Instaciar Ingredientes
        Base base = new Base("1","Massa Fina",UnidadeMedida.GRAMAS,150, BasePizza.MASSA_BAIXA);
        Queijo ingrediente1 = new Queijo("2", "Queijo", UnidadeMedida.GRAMAS,4, OrigemIngrediente.IMPORTADO, TipoQueijo.CHEEDER);
        Carne ingrediente2 = new Carne("3", "Fiambre", UnidadeMedida.GRAMAS,4, OrigemIngrediente.IMPORTADO, TipoCarne.CARNE_PICADA);
        Vegetais ingrediente3 = new Vegetais("4", "Cogumelos",UnidadeMedida.GRAMAS,6,OrigemIngrediente.NACIONAL,TipoVegetais.AZEITONAS);
        Carne ingrediente4 = new Carne("5","Presunto",UnidadeMedida.UNIDADES, 15, OrigemIngrediente.IMPORTADO,TipoCarne.LINGUICA);
        FrutosMar ingrediente5 = new FrutosMar("6", "Camarão", UnidadeMedida.UNIDADES, 10, OrigemIngrediente.NACIONAL,TipoFrutoMar.ANCHOVAS);
        Vegetais ingrediente6 = new Vegetais("7","Tomate",UnidadeMedida.GRAMAS,5,OrigemIngrediente.NACIONAL,TipoVegetais.BROCULIS);
        Vegetais ingrediente7 = new Vegetais("8", "Pimento", UnidadeMedida.GRAMAS, 3, OrigemIngrediente.IMPORTADO, TipoVegetais.PIMENTOS);

        //Acrecentar ingredientes a lista
        IngredientesPizza massa = new IngredientesPizza(base, 200);
        IngredientesPizza queijo = new IngredientesPizza(ingrediente1,100);
        IngredientesPizza fiambre = new IngredientesPizza(ingrediente2,50);
        IngredientesPizza cogumelos = new IngredientesPizza(ingrediente3,30);
        IngredientesPizza presunto = new IngredientesPizza(ingrediente4, 10);
        IngredientesPizza camarões = new IngredientesPizza(ingrediente5,10);
        IngredientesPizza tomate = new IngredientesPizza(ingrediente6, 100);
        IngredientesPizza pimento = new IngredientesPizza(ingrediente7, 30);

        //Instaciar Pizza
        Pizza pizza1 = new Pizza(1,"Queijo e Carne Picada", "Deliciosa pizza de queijo com carne picada que leva uma pequena dose de azeitonas", 15,TamanhoPizza.MEDIA);

        pizza1.adicionarIngredientes(massa);
        pizza1.adicionarIngredientes(queijo);
        pizza1.adicionarIngredientes(pimento);
        pizza1.adicionarIngredientes(tomate);


        pizza1.removerIngrediente("4");

        pizza1.editarQuantidade(queijo,150);

        double caloriasPizza = pizza1.calcularKcalorias();
        System.out.println("KCal: " + caloriasPizza);

         pizza1.detalhesPizza();

    }



}
