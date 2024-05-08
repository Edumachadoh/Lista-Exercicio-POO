package br.edu.up.telas;

import java.util.List;

import br.edu.up.controles.Adicionar;
import br.edu.up.controles.Alterar;
import br.edu.up.controles.Excluir;
import br.edu.up.controles.Listar;
import br.edu.up.lib.Prompt;
import br.edu.up.modelos.Evento;

public class MenuReserva {
    public static void executar(List<Evento> eventos){
        Prompt.separador();
        Prompt.imprimir("\n---Reservas---");
        Prompt.imprimir("\n1- Realizar reserva (inclusão reserva)");
        Prompt.imprimir("2- Alterar reserva (alteração reserva)");
        Prompt.imprimir("3- Listar reserva (listagem reserva)");
        Prompt.imprimir("4- Excluir reserva (exclusão reserva)");
        Prompt.imprimir("5- Voltar\n");
        Prompt.separador();

        int escolha = Prompt.lerInteiro();
        
        switch (escolha) {
            case 1:
                Evento eventoSelecionado = escolherEvento(eventos);
                realizarReserva(eventoSelecionado);
                break;
            case 2:
                alterarReserva();
                break;
            case 3:
                listarReserva();
                break;
            case 4:
                listarReserva();
                break;
            case 5:
                Menu.executar(eventos);
                break;
            default:
                Prompt.imprimir("Escolha invalida");
                executar(eventos);
                break;
        }
    }
    public static Evento escolherEvento(List<Evento> eventos){
        Prompt.imprimir("Qual envento:");
        
        
        int escolha = Prompt.lerInteiro("\n-->Escolha:");
        Evento eventoSelecionado = eventos.get(escolha);

        return eventoSelecionado;
    }

    public static void realizarReserva(Evento eventoSelecionado){
        String nomeResponsavel = Prompt.lerLinha("Nome do Responsável pela reserva:");
        int qtdPessoas = Prompt.lerInteiro("Número de pessoas registradas na reserva:");
        String data = Prompt.lerLinha("Data da reserva:");
        
        //aqui eu preciso saber de qual evento estamos falando pra fazer o valor total
        //como eu vou selecionar um evento em específico?
        //pois aqui na hora de criar uma reserva eu preciso saber de qual
        //evento estamos falando:
        Adicionar.reserva(nomeResponsavel,qtdPessoas,data,eventoSelecionado);
    }

    public static void alterarReserva(){
       Alterar.reserva();
    }
    
    public static void listarReserva(){
        
        Listar.reserva();
    }

    public static void excluirReserva(){
        //como eu excluo uma reserva?
        Excluir.reserva();
    }
}
