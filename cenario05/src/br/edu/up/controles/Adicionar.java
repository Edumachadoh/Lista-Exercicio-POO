package br.edu.up.controles;

import br.edu.up.modelos.Evento;
import br.edu.up.modelos.Reserva;

public class Adicionar {
    public static void evento(){
        
    }
    
    public static void reserva( String nomeResponsavel , int qtdPessoas , double valorTotal , String data, Evento evento ){
        
        Reserva reserva = new Reserva(nomeResponsavel, qtdPessoas, valorTotal, data, evento);
        //como é que eu crio uma reserva nova toda a vez sem depender de um vetor,
        //pois vetor sempre precisa ser criado com um limite, oq eu faço?
        
    }
}
