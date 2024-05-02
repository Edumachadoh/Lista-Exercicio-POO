package br.edu.up.telas;

import br.edu.up.Programa;
import br.edu.up.controles.AgendarCompromisso;
import br.edu.up.controles.VerificarBissexto;
import br.edu.up.controles.VerificarMesValido;
import br.edu.up.lib.Prompt;

public class Menu {

    public static void mostrarTela(int numeroCompromissos){

        System.out.println("=== Sistema de Agendamento ===");
        Prompt.separador();
        System.out.println("\n\n--Selecione a operação desejada:");
        System.out.println("1 - Agendar Compromisso");
        System.out.println("2 - Alterar compromisso");
        System.out.println("3 - Excluir compromisso");
        Prompt.separador();

        int escolha = Prompt.lerInteiro();

        switch (escolha) {
            case 1:
                menuAgendamento(numeroCompromissos);
                numeroCompromissos++;
            break;
            
            case 2:
                Prompt.lerInteiro("Qual Ano:");
                Prompt.lerLinha("Qual Mes:");
                Prompt.lerInteiro("Qual dia:");

                break;
            case 3:
                Prompt.lerInteiro("Qual Ano:");
                Prompt.lerLinha("Qual Mes:");
                Prompt.lerInteiro("Qual dia:");

                break;

            default:
                Programa.parar();
                break;
        }
        mostrarTela(numeroCompromissos);
    }

    public static void menuAgendamento(int n){
        
        int ano = Prompt.lerInteiro("Qual ano:");
        VerificarBissexto.executar(ano);
        String mes = mesValido();
        int dia = Prompt.lerInteiro("Qual dia:");
        int hora = Prompt.lerInteiro("Qual hora:");
        String pessoa = Prompt.lerLinha("Nome da pessoa:");
        String local = Prompt.lerLinha("Nome do local:");
        String assunto = Prompt.lerLinha("Assunto:");

        
        AgendarCompromisso.executar(ano,mes,dia,hora,pessoa,local,assunto);
    }

    public static String mesValido(){
        String mes = Prompt.lerLinha("Qual Mês");
        boolean valido = VerificarMesValido.executar(mes);

        if(valido == false){
            Prompt.imprimir("!Mês inválido!\n---Digite novamente---");
            mesValido();
        }

        return mes;
    }
}
