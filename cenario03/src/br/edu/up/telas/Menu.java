package br.edu.up.telas;

import br.edu.up.Programa;
import br.edu.up.controles.AgendarCompromisso;
import br.edu.up.controles.DefinirDiasValidos;
import br.edu.up.controles.DefinirNumMes;
import br.edu.up.controles.VerificarBissexto;
import br.edu.up.util.Prompt;

public class Menu {
    

    public static void iniciar(){
        
    }

    public static void mostrarTela(){

        Prompt.separador();
        System.out.println("=== Sistema de Agendamento ===");
        Prompt.separador();
        System.out.println("--Selecione a operação desejada:--");
        System.out.println("1 - Agendar Compromisso");
        System.out.println("2 - Alterar compromisso");
        System.out.println("3 - Excluir compromisso");
        Prompt.separador();

        int escolha = Prompt.lerInteiro();

        switch (escolha) {
            case 1:
                agendar();
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
        mostrarTela();
    }

    public static String mesValido(){
        String mes = Prompt.lerLinha("Qual Mês:");
        VerificarMes.executar(mes);

        return mes;
    }

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

        
        AgendarCompromisso.executar(ano,mes,dia,hora,pessoa,local,assunto,numMes, numDias ,bissexto);
    }
}
