package br.edu.up.controles;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.metodos.Ano;
import br.edu.up.metodos.Compromisso;
import br.edu.up.metodos.Dia;
import br.edu.up.metodos.Mes;

public class AgendarCompromisso {
    
    public static void executar(List<Ano> anos, int ano, String mes, int dia,int hora, String pessoa, String local, String assunto,int numMes, int numDias, boolean bissexto){ 
        
        Ano objetoAno = new Ano(ano, bissexto);
        Mes objetoMes = new Mes(dia, mes);
        Dia objetoDia = new Dia(dia);
        Compromisso objCompromisso = new Compromisso(pessoa, local, assunto, hora);
        
        anos.add(objetoAno);
    }
    
}
