package Ex_05;

public class Agenda {

    private Pessoa[] agenda;

    public Agenda(){
        agenda = new Pessoa[10]; //Vou dizer qual o tamanho que a minha agenda irá ter, nesse caso até 10 posições
    }


    public void adicionarPessoa(Pessoa pessoa){

        for (int i = 0; i< agenda.length;i++){
            if(this.agenda[i] == null){ //Verifico qual é a primeira "gaveta" vazia e preencho com um valor
                this.agenda[i] = pessoa; //Atribuo a essa gaveta uma pessoa.
                return;
            }
        }
    }

    public void listarPessoas(){
        for (int i = 0; i < agenda.length; i++){ //Ciclo para verificar o conteudo de cada "gaveta".
            if(this.agenda[i] != null){ //Condição para verificar se a não estiver vaiza ela deve imprimir os dados que lá está
                this.agenda[i].exibirDetalhes(); //Chama o metodo para imprimir os detalhes da pessoa
            }

        }
    }
}
