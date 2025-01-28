package Ex_05;

public class Main {

    public static void main(String[] args) {

        //Criar dois novo objetos (Pessoas)
        Pessoa pessoa1 = new Pessoa("Lais", 38,"lala@gamil.com", 99999999);
        Pessoa pessoa2 = new Pessoa("Pedro", 30,"pedroMusic@gmail.com", 96666666);


        //Criar uma nova agenda
        Agenda minhaAgenda = new Agenda();

        //Adicionar pessoas à agenda

        minhaAgenda.adicionarPessoa(pessoa1);
        minhaAgenda.adicionarPessoa(pessoa2);

        //Imprimir os detalhes da Agenda
        minhaAgenda.listarPessoas();
    }
}
