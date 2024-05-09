package br.edu.up.controles;

import br.edu.up.metodos.Ano;
import br.edu.up.metodos.Compromisso;
import br.edu.up.metodos.Dia;
import br.edu.up.metodos.Mes;

public class AgendarCompromisso {
    
    public static void executar(Ano objetoAno, String mes, int dia,int hora, String pessoa, String local, String assunto,int numMes, int numDias){ 
        
        Compromisso objCompromisso = new Compromisso(pessoa, local, assunto, hora);
        Dia objetoDia = new Dia(dia);
        Mes objetoMes = new Mes(dia, mes);

        
        objetoAno.adicionarMes(objetoMes);
        objetoMes.adicionarCompromisso(objCompromisso, dia);
        objetoDia.adicionarCompromisso(objCompromisso);
        
    }
    
}
