package Ex_04;

public class Main {

    public static void main(String[] args) {


        Imovel imovel1 = new Imovel("Ciriaco Cardoso", 147,"Porto", Tipo.MANSAO,Acabamento.NOVO,2500,10,15,100);
        Imovel imovel2 = new Imovel("Bolhao", 150,"Lisboa",Tipo.APARTAMENTO,Acabamento.RESTAURO,140,4,2,0);

        imovel1.imprimirDescricao();

        Imovel maisCaro = imovel1.comparImovel(imovel2);


        System.out.println("O imovel mais caro é: " + maisCaro.getRua() + maisCaro.getCidade());
    }




    //atributos

    //construtor

    //metodos


}
