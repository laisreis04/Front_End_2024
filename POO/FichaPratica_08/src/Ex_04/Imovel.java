package Ex_04;

public class Imovel {

    private String rua;
    private int numPorta;
    private String cidade;
    private Tipo tipo;
    private Acabamento acabamento;
    private double area;
    private int numQuartos;
    private int numBanheiros;
    private double areaPiscina;


    //Construtor


    public Imovel(String rua, int numPorta, String cidade, Tipo tipo, Acabamento acabamento, double area, int numQuartos, int numBanheiros, double areaPiscina) {
        this.rua = rua;
        this.numPorta = numPorta;
        this.cidade = cidade;
        this.tipo = tipo;
        this.acabamento = acabamento;
        this.area = area;
        this.numQuartos = numQuartos;
        this.numBanheiros = numBanheiros;
        this.areaPiscina = areaPiscina;
    }

public double valorImovel(){
        double valorTotal = 0;

        switch (this.tipo){
            case APARTAMENTO -> valorTotal += this.area*1000;
            case CASA -> valorTotal += this.area*3000;
            case MANSAO -> valorTotal += this.area*5000;
        }

        switch (this.acabamento){
            case RESTAURO -> valorTotal -= (valorTotal*0.5);
            case USADO -> valorTotal -= (valorTotal*0.1);
            case NOVO -> valorTotal = valorTotal;
            case NOVO_COM_ALTO_ACABAMENTO -> valorTotal += (valorTotal*0.25);
        }

        valorTotal += numQuartos*7500;
        valorTotal+= numBanheiros*10500;
        valorTotal += areaPiscina*1000;

        return valorTotal;

}

    public void setAcabamento(Acabamento acabamento) {
        this.acabamento = acabamento;
    }

    public void imprimirDescricao(){
        System.out.println("************* IMOVEL *************");
        System.out.println(" Rua: " + this.rua);
        System.out.println(" Nº da porta: " + this.numPorta);
        System.out.println(" Cidade: " + this.cidade);
        System.out.println(" Tipo: " + this.tipo);
        System.out.println(" Acabamento : " + this.acabamento);
        System.out.println(" Área: " + this.area);
        System.out.println(" Nº Quartos: " + this.numQuartos);
        System.out.println(" Nª Banheiros: " + this.numBanheiros);
        System.out.println(" Área da Piscina: " + this.areaPiscina);
    }

    public Imovel comparImovel(Imovel imovel2){
        if(this.valorImovel() > imovel2.valorImovel()){
            return this;
        }else {
            return imovel2;
        }

    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }
}
