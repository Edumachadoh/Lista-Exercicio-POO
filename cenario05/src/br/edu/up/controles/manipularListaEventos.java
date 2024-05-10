package br.edu.up.controles;

import br.edu.up.modelos.Evento;

public class manipularListaEventos {
    public static Evento[] adicionarEvento(Evento[] listaEventos){

        Evento[] vet1 = new Evento[listaEventos.length];

        for (int i = 0; i < vet1.length; i++){
            vet1[i] = listaEventos[i];
        }

        Evento[] vet2 = new Evento[listaEventos.length + 1];

        for (int i = 0; i < vet1.length; i++) {
            vet2[i] = vet1[i];
        }

        return vet2;

    }
}
