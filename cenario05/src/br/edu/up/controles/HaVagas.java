package br.edu.up.controles;

import br.edu.up.modelos.Evento;

public class HaVagas {
    public static boolean verificar(Evento evento){

        if(evento.getLotacaoMax() == evento.getNumReservasFeitas()){
            return false;
        }
        return true;
    }
}
