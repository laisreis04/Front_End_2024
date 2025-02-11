package Ex_06;

public class Main {

    public static void main(String[] args) {


        //Criar novo objetos (Atletas)
        Atleta atleta1 = new Atleta("Mario", "Futebol", 1.80, 80, "Portugal");
        Atleta atleta2 = new Atleta("Rita", "Voleibol", 1.70, 65, "Espanha");
        Atleta atleta3 = new Atleta("Joao", "Basquetebol", 1.85, 82, "Portugal");
        Atleta atleta4 = new Atleta("Maria", "Andebol", 1.68, 60, "Italia");
        Atleta atleta5 = new Atleta("Afonso", "Atletismo", 1.90, 80, "Espanha");
        Atleta atleta6 = new Atleta("Leonor", "Voleibol", 1.65, 58, "França");

        //Ciração de duas competições diferentes
        Competicao competicao1 = new Competicao("Liga Portugal", "Portugal");
        Competicao competicao2 = new Competicao("Liga Espanha", "Espanha");

        //Adicionando atletas
        competicao1.adicionarAtleta(atleta1);
        competicao1.adicionarAtleta(atleta2);
        competicao1.adicionarAtleta(atleta3);

        //Adicionando atletas ás competições
        competicao2.adicionarAtleta(atleta4);
        competicao2.adicionarAtleta(atleta5);
        competicao2.adicionarAtleta(atleta6);


        //Imprimindo detalhes do atleta
        competicao1.informacoesCompeticao();

        competicao2.informacoesCompeticao();

    }
}
