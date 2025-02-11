package Ex_02;

import java.util.Scanner;

public class Main2 {

    public static Veiculo criarVeiculo(){
        Scanner input = new Scanner(System.in);
        String veiculo;
        System.out.println("*** Qual tipo de veiculo você quer monstar?");
        System.out.println("Carro , mota ou Caminhão");
        veiculo = input.next();


         String marca;
         String modelo;
         String combustivel;
         int anoFrabricacao;
         int potencia;
         int cilindrada;
         TipoCombustivel tipoCombustivel = null;
         double litros100Km;

        System.out.println("Qual a marca:");
        marca = input.next();
        System.out.println("Qual o modelo:");
        modelo = input.next();
        System.out.println("Qual o ano de Fabricação:");
        anoFrabricacao = input.nextInt();
        System.out.println("Qual a potencia:");
        potencia = input.nextInt();
        System.out.println("Qual a cilindrada:");
        cilindrada = input.nextInt();
        System.out.println("Qual os litros aos 100:");
        litros100Km = input.nextDouble();

        switch (veiculo){
            case "carro":
                int quatPassageiros;
                System.out.println("Qual o tipo de combustivel:");
                combustivel = input.next();
                switch (combustivel){
                    case "gasolina":
                        tipoCombustivel = TipoCombustivel.GASOLINA;
                        break;
                    case "diesel":
                        tipoCombustivel = TipoCombustivel.DIESEL;
                        break;
                    case "gpl":
                        tipoCombustivel = TipoCombustivel.GPL;
                        break;
                    case "eletrico":
                        tipoCombustivel = TipoCombustivel.ELETRICO;
                        break;
                }
                System.out.println("Qual a quantidade de passageiros? ");
                quatPassageiros = input.nextInt();
                return  new Carro(marca, modelo,anoFrabricacao,potencia,cilindrada,tipoCombustivel,litros100Km,quatPassageiros);
            case "mota":
                System.out.println("Qual o tipo de combustivel:");
                combustivel = input.next();
                switch (combustivel){
                    case "gasolina":
                        tipoCombustivel = TipoCombustivel.GASOLINA;
                        break;
                    case "diesel":
                        tipoCombustivel = TipoCombustivel.DIESEL;
                        break;
                    case "gpl":
                        tipoCombustivel = TipoCombustivel.GPL;
                        break;
                    case "eletrico":
                        tipoCombustivel = TipoCombustivel.ELETRICO;
                        break;
                }
                return new Mota(modelo,marca,anoFrabricacao,potencia,cilindrada,tipoCombustivel,litros100Km);
            case "caminhão":
                double capacidadeCarga;
                System.out.println("Quala a capacidade máxiama de carga? ");
                capacidadeCarga = input.nextInt();
                System.out.println("Qual o tipo de combustivel:");
                combustivel = input.next();
                switch (combustivel){
                    case "gasolina":
                        tipoCombustivel = TipoCombustivel.GASOLINA;
                        break;
                    case "diesel":
                        tipoCombustivel = TipoCombustivel.DIESEL;
                        break;
                    case "gpl":
                        tipoCombustivel = TipoCombustivel.GPL;
                        break;
                    case "eletrico":
                        tipoCombustivel = TipoCombustivel.ELETRICO;
                        break;
                }
                return new Caminhao(marca, modelo,anoFrabricacao,potencia,cilindrada,tipoCombustivel,litros100Km,capacidadeCarga);

        }


return null;


    }


    public static void main(String[] args) {

        System.out.println("***** Monte o seu veiculo");
        criarVeiculo();


    }


}
