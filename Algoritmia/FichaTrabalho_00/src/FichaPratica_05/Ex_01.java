package FichaPratica_05;

import java.util.Scanner;

public class Ex_01 {


public static void fazerBarulho(String animal){
    
    animal.equalsIgnoreCase(animal);

    switch (animal) {
        case "cao":
            System.out.println("Au, au , au!");
            break;

            case "gato":
            System.out.println("Miau!");
            break;

            case "peixe":
            System.out.println("Glub, glub!");
            break;

            case "vaca":
            System.out.println("Muuuu!");
            break;

            case "porco":
            System.out.println("Oinc! Oinc!");
            break;
    
        default:
        System.out.println("Animal desconhecido!");
            break;
    }
}

public static void main(String[] args){
        
    Scanner input = new Scanner(System.in);

    String animalEscolhido;

    System.out.print("Escolha um animal:");
    animalEscolhido = input.next();

    fazerBarulho(animalEscolhido);

}
   
}
