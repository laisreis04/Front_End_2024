package Pizzaria;

import Pizzaria.Enums.TamanhoPizza;

import java.util.ArrayList;

public class Pizza {

    //Atributos da classe
    private int codigo;
    private String nome, descricao;
    private double preco;
    private TamanhoPizza tamanho;

    private ArrayList<IngredientesPizza> ingredientes;

    //Construtor para instaciar um objeto (pizza)


    public Pizza(int codigo, String nome, String descricao, double preco, TamanhoPizza tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.ingredientes = new ArrayList<IngredientesPizza>();
    }

    //adicionar
    public void adicionarIngredientes(IngredientesPizza ingredientesPizza){
        if(ingredientesPizza.getIngrediente() instanceof Base){  //Para verificar se é base
            if(this.ingredientes.size() < 1){
                this.ingredientes.add(ingredientesPizza);// Adicionei 1 base para a minha pizza - Vai ser adicionada no ArrayList
            }else {
                System.out.println("Você já escolheu 1 base, não pode acrescentar outra");
            }
        }
        if(ingredientesPizza.getIngrediente() instanceof Topping){ //Para verificar se o tipo de ingrediente é um topping
            if(this.ingredientes.size() < 5){
                this.ingredientes.add(ingredientesPizza);  //Adicionar o topping a minha arrayList
            }else {
                System.out.println("Não pode acrescentar mais Toppings");
            }
        }else {
            System.out.println("Escolha primeiro um topping");
        }
    }

    //Remover
    public void removerIngrediente(String codigo){
        for(int i = 0; i < ingredientes.size();i++){
            if(ingredientes.get(i).getIngrediente().getCodigo().equals(codigo)){
                ingredientes.remove(i);
                return;
            }
        }
    }

    //Editar
    public void editarQuantidade(IngredientesPizza ingredientesPizza, double quatidade){
        ingredientesPizza.setQuantidade(quatidade);
    }

    //Somar Calorias
public double calcularKcalorias(){
        double quantidade, calorias, totalCalorias = 0;
        for(int i = 0; i < ingredientes.size();i++){
            calorias = ingredientes.get(i).getIngrediente().getnCaloriasUnidadeMedida();
            quantidade = ingredientes.get(i).getQuantidade();
            totalCalorias += calorias * quantidade;
        }
        return totalCalorias;
}


    //Imprimir detalhes da pizza
    public void detalhesPizza(){
        int contador = 1;
        System.out.println("******** Pizzaria Cesae******");
        System.out.println("Pizza " + this.nome);
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço: " + preco);
        System.out.println("Tamnho: " + tamanho);
        for(IngredientesPizza ingredientesPizzaAtual: this.ingredientes){
            System.out.print("Ingrediente " + contador + ": ");
            ingredientesPizzaAtual.detalhesIngredientesPizza();
            contador++;
        }

    }

    //Tipo Pizza
public void definirTipoPizza(){
        int contador = 0;
        boolean carne = true;
        for(int i = 0; i < ingredientes.size();i++){
            if(ingredientes.get(i).getIngrediente() instanceof Carne){
                carne = true;
            }else {
                carne = false;
                break;
            }
        }
        if(carne){
            System.out.println("Tipo: Pizza de Carne");
        }

        boolean frutosMar = true;
        for(int i = 0; i < ingredientes.size();i++){
            if(ingredientes.get(i).getIngrediente() instanceof FrutosMar){
                frutosMar = true;
            }else {
                frutosMar = false;
                break;
            }

            }
    if(frutosMar){
        System.out.println("Tipo: Pizza de Fruto do Mar");
    }
    boolean vegetariana = true;
    for(int i = 0; i < ingredientes.size();i++){
        if(ingredientes.get(i).getIngrediente() instanceof Vegetais){
            vegetariana = true;
        }else {
            vegetariana = false;
            break;
        }

    }
    if(vegetariana){
        System.out.println("Tipo: Pizza de Vegetais");
    }

    for(int i = 0; i < ingredientes.size(); i++){
        if(ingredientes.get(i).getIngrediente() instanceof Carne){
            contador++;
        } else if (ingredientes.get(i).getIngrediente() instanceof Queijo) {
            contador++;
        }else if(ingredientes.get(i).getIngrediente() instanceof Vegetais){
            contador++;
        } else if (ingredientes.get(i).getIngrediente() instanceof FrutosMar) {
            contador++;
        }
    }

    if(contador >= 4){
        System.out.println("Tipo: Pizza completa");
    } else if (!carne && !frutosMar && !vegetariana && contador < 4) {
        System.out.println("Tipo: Piza Mista");
    }
}

}
