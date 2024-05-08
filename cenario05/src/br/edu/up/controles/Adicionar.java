package br.edu.up.controles;

import java.util.List;

import br.edu.up.modelos.Evento;
import br.edu.up.modelos.Reserva;
import br.edu.up.telas.MenuEvento;

public class Adicionar {
    public static void evento(List<Evento> eventos, String nome, String data, String local, double precoIngresso, int lotacaoMax){
        Evento evento = new Evento(nome, data, local, precoIngresso, lotacaoMax);
        eventos.add(evento);
        MenuEvento.executar(eventos);
    }
    
    public static void reserva(String nomeResponsavel , int qtdPessoas , String data, Evento eventoSelecionado){
        
        double valorTotal = eventoSelecionado.getPrecoIngresso() * qtdPessoas;
        int numReserva = eventoSelecionado.getLotacaoMax() - eventoSelecionado.getNumReservasFeitas();
        Reserva reserva = new Reserva(nomeResponsavel, qtdPessoas, valorTotal, data, eventoSelecionado);
        eventoSelecionado.adicionarReserva(reserva, numReserva);
    }
}
