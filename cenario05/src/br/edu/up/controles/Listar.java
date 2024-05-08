package br.edu.up.controles;

import java.util.List;

import br.edu.up.lib.Prompt;
import br.edu.up.modelos.Evento;
import br.edu.up.modelos.Reserva;

public class Listar {
    public static void evento(List<Evento> eventos){
        String listarEventos = new String();
        
        for (Evento evento : eventos) {
            listarEventos += evento.toString() + "\n";
        }

        Prompt.imprimir(listarEventos);
    }

    public static void reserva(){
        //eu uso o to string para listar uma reserva?
        
    }
}
