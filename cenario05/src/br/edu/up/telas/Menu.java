package br.edu.up.telas;

import br.edu.up.Programa;
import br.edu.up.lib.Prompt;

public class Menu {
    public static void executar(){
        Prompt.separador();
        Prompt.imprimir("\n---Sistema de Agendamento---");
        Prompt.imprimir("\n1- Acessar Menu de Reservas");
        Prompt.imprimir("2- Acessar Menu de Eventos");
        Prompt.imprimir("3- Parar execução\n");
        Prompt.separador();

        int escolha = Prompt.lerInteiro();

        switch (escolha) {
            case 1:
                MenuReserva.executar();
                break;
            case 2:
                MenuEvento.executar();
                break;
            case 3:
                Programa.parar();
                break;
            default:
                Prompt.imprimir("Escolha invalida");
                executar();
                break;
        }
    }

}
