package br.edu.up.telas;

import br.edu.up.controles.DefinirDiasValidos;
import br.edu.up.controles.DefinirNumMes;
import br.edu.up.controles.VerificarBissexto;
import br.edu.up.util.Prompt;

public class MenuAgendamento {
        public static void agendar(){
        
        int ano = Prompt.lerInteiro("Qual ano:");
        boolean bissexto = VerificarBissexto.executar(ano);
        String mes = Menu.mesValido();
        int numMes = DefinirNumMes.executar(mes);
        int numDias = DefinirDiasValidos.executar(numMes, bissexto);
        int dia = Prompt.lerInteiro("Qual dia:");
        int hora = Prompt.lerInteiro("Qual hora:");
        String pessoa = Prompt.lerLinha("Nome da pessoa:");
        String local = Prompt.lerLinha("Nome do local:");
        String assunto = Prompt.lerLinha("Assunto:");

        
        //AgendarCompromisso.executar(ano,mes,dia,hora,pessoa,local,assunto);
    }
}
