package br.edu.up.telas;

import br.edu.up.controles.Adicionar;
import br.edu.up.controles.Alterar;
import br.edu.up.controles.Excluir;
import br.edu.up.controles.Listar;
import br.edu.up.lib.Prompt;
import br.edu.up.modelos.Evento;

public class MenuReserva {
    public static void executar(){
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
                realizarReserva();
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
                Menu.executar();
                break;
            default:
                Prompt.imprimir("Escolha invalida");
                executar();
                break;
        }
    }

    public static void realizarReserva(){
        String nomeResponsavel = Prompt.lerLinha("Nome do Responsável pela reserva:");
        int qtdPessoas = Prompt.lerInteiro("Número de pessoas registradas na reserva:");
        String data = Prompt.lerLinha("Data da reserva:");
        
        //aqui eu preciso saber de qual evento estamos falando pra fazer o valor total
        double valorTotal = 

        //como eu vou selecionar um evento em específico?
        //pois aqui na hora de criar uma reserva eu preciso saber de qual
        //evento estamos falando:
        Evento evento = 
        Adicionar.reserva(nomeResponsavel,qtdPessoas,valorTotal,data,evento);
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
