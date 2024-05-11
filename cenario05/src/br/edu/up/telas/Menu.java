package br.edu.up.telas;

import br.edu.up.Programa;
import br.edu.up.util.Prompt;
import br.edu.up.modelos.Evento;

public class Menu {
    public static void iniciar(){
        Evento[] listaEventos = new Evento[1];
        executar(listaEventos);

    }
    public static void executar(Evento[] listaEventos){
        Prompt.separador();
        Prompt.imprimir("\n---Sistema de Agendamento---");
        Prompt.imprimir("\n1- Acessar Menu de Reservas");
        Prompt.imprimir("2- Acessar Menu de Eventos");
        Prompt.imprimir("3- Parar execução\n");
        Prompt.separador();

        int escolha = Prompt.lerInteiro();

        switch (escolha) {
            case 1:
                MenuReserva.executar(listaEventos);
                break;
            case 2:
    
                MenuEvento.executar(listaEventos);
                break;
            case 3:
                Programa.parar();
                break;
            default:
                Prompt.imprimir("Escolha invalida");
                executar(listaEventos);
                break;
        }
    }

        public static int escolherEvento(Evento[] listaEventos){
        Prompt.imprimir("Qual envento:");
        MenuEvento.listarEvento(listaEventos);
        
        int escolha = (Prompt.lerInteiro("\n-->Escolha:") - 1);
        int eventoSelecionado = 0;
        
        if(escolha <= listaEventos.length){
            for (int i = 0; i < listaEventos.length; i++) {
                if(escolha == i){
                    eventoSelecionado = i;
                }    
            }
        }else{
            Prompt.imprimir("Evento invalido");
            Menu.executar(listaEventos);
        }
        Prompt.imprimir("Evento escolhido:" + (eventoSelecionado + 1));
        return eventoSelecionado;
    }

}
