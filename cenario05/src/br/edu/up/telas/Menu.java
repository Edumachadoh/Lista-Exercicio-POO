package br.edu.up.telas;

import br.edu.up.Programa;
import br.edu.up.controles.AlterarReserva;
import br.edu.up.controles.ExcluirEvento;
import br.edu.up.controles.ExcluirReserva;
import br.edu.up.controles.ListarEvento;
import br.edu.up.controles.ListarReserva;
import br.edu.up.controles.RealizarReserva;
import br.edu.up.lib.Prompt;

public class Menu {
    public static void executar(){
        Prompt.imprimir("---Sistema de Agendamento evento---");
        Prompt.imprimir("\n1- Realizar reserva (inclusão)");
        Prompt.imprimir("\n2- Alterar reserva (alteração)");
        Prompt.imprimir("\n5- Listar evento (listagem evento)");
        Prompt.imprimir("\n6- Listar reserva (listagem reserva)");
        Prompt.imprimir("\n5- Excluir evento (exclusão evento)");
        Prompt.imprimir("\n6- Excluir reserva (exclusão reserva)");
        Prompt.imprimir("\n7- Parar execução");

        int escolha = Prompt.lerInteiro();
        switch (escolha) {
            case 1:
                realizarReserva();
                break;
            case 2:
                alterarReserva();
                break;
            case 3:
                listarEvento();
                break;
            case 4:
                listarReserva();
                break;
            case 5:
                excluirEvento();
                break;
            case 6:
                excluirReserva();
                break;
            case 7:
                Programa.parar();
                break;
            default:
                Prompt.imprimir("Escolha invalida");
                executar();
                break;
        }
    }
    public static void realizarReserva(){
        String nome = Prompt.lerLinha("Nome do Responsável pela reserva:");
        int nPessoas = Prompt.lerInteiro("Número de pessoas registradas na reserva:");
        RealizarReserva.executar(nome, nPessoas);
    }

    public static void alterarReserva(){
        String nome = Prompt.lerLinha("Nome do Responsável pela reserva:");
        int nPessoas = Prompt.lerInteiro("Número de pessoas registradas na reserva:");
        AlterarReserva.executar(nome, nPessoas);
    }
    
    public static void listarReserva(){
        String nome = Prompt.lerLinha("Nome do Responsável pela reserva:");
        int nPessoas = Prompt.lerInteiro("Número de pessoas registradas na reserva:");
        ListarReserva.executar(nome, nPessoas);
    }

    public static void excluirReserva(){
        String nome = Prompt.lerLinha("Nome do Responsável pela reserva:");
        int nPessoas = Prompt.lerInteiro("Número de pessoas registradas na reserva:");
        ExcluirReserva.executar(nome, nPessoas);
    }

    public static void listarEvento(){
        ListarEvento.executar();
    }

    public static void excluirEvento(){
        ExcluirEvento.executar();
    }
}
