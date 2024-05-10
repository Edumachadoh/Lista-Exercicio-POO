package br.edu.up.controles;

import br.edu.up.modelos.Evento;
import br.edu.up.modelos.Reserva;
import br.edu.up.telas.Menu;
import br.edu.up.util.Prompt;

public class Adicionar {
    public static void evento(Evento[] listaEventos,String nome, String data, String local, double precoIngresso, int lotacaoMax){

            if(listaEventos[0] == null){
                listaEventos[0] = new Evento(nome, data, local, precoIngresso, lotacaoMax);
                Prompt.imprimir("vetor 0  ----------------------------------------------------");
            }else{

            Evento[] vet1 = new Evento[listaEventos.length + 1];
            vet1 = manipularListaEventos.adicionarEvento(listaEventos);

            listaEventos = new Evento[listaEventos.length + 1];
            
                for(int i = 0; i < vet1.length; i++){
                    listaEventos[i] = vet1[i];
                }

            listaEventos[vet1.length - 1] = new Evento(nome, data, local, precoIngresso, lotacaoMax); 
            }
        Menu.executar(listaEventos);
    }
    
    public static void reserva(String nomeResponsavel , int qtdPessoas , String data, Evento eventoSelecionado){
        
        double valorTotal = eventoSelecionado.getPrecoIngresso() * qtdPessoas;
        int numReserva = eventoSelecionado.getLotacaoMax() - eventoSelecionado.getNumReservasFeitas();
        Reserva reserva = new Reserva(nomeResponsavel, qtdPessoas, valorTotal, data, eventoSelecionado);
        eventoSelecionado.adicionarReserva(reserva, numReserva);
    }
}
