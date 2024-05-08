package br.edu.up.telas;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.Programa;
import br.edu.up.lib.Prompt;
import br.edu.up.modelos.Evento;

public class Menu {
    public static void iniciar(){
        List<Evento> eventos = new ArrayList<>();
        executar(eventos);
    }   
    public static void executar(List<Evento> eventos){
        Prompt.separador();
        Prompt.imprimir("\n---Sistema de Agendamento---");
        Prompt.imprimir("\n1- Acessar Menu de Reservas");
        Prompt.imprimir("2- Acessar Menu de Eventos");
        Prompt.imprimir("3- Parar execução\n");
        Prompt.separador();

        int escolha = Prompt.lerInteiro();

        switch (escolha) {
            case 1:
                MenuReserva.executar(eventos);
                break;
            case 2:
                MenuEvento.executar(eventos);
                break;
            case 3:
                Programa.parar();
                break;
            default:
                Prompt.imprimir("Escolha invalida");
                executar(eventos);
                break;
        }
    }

}
