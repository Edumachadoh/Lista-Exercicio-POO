package br.edu.up.telas;

import br.edu.up.Programa;
import br.edu.up.controles.AgendarCompromisso;
import br.edu.up.controles.DefinirDiasValidos;
import br.edu.up.controles.DefinirNumMes;
import br.edu.up.metodos.Ano;
import br.edu.up.util.Prompt;

public class Menu {
    

    public static void iniciar(){
        Ano[] listaAnos = new Ano[1];
        mostrarTela(listaAnos);
    }

    public static void mostrarTela(Ano[] listAnos){

        Prompt.separador();
        System.out.println("=== Sistema de Agendamento ===");
        System.err.println("Ano:" + objetoAno.getAno());
        Prompt.separador();
        System.out.println("--Selecione a operação desejada:--");
        System.out.println("1 - Agendar Compromisso");
        System.out.println("2 - Alterar compromisso");
        System.out.println("3 - Excluir compromisso");
        System.out.println("4 - Listar compromissos");
        System.out.println("5 - Listar compromisso específico");
        System.out.println("6 - Mudar ano");
        System.out.println("(qualquer botão) - Parar Programa");
        Prompt.separador();

        int escolha = Prompt.lerInteiro("-->");

        switch (escolha) {
            case 1:
                agendar(objetoAno);
            break;
            
            case 2:
                Prompt.lerLinha("Qual Mes:");
                Prompt.lerInteiro("Qual dia:");

                break;
            case 3:
                Prompt.lerInteiro("Qual Ano:");
                Prompt.lerLinha("Qual Mes:");
                Prompt.lerInteiro("Qual dia:");

                break;
            case 4:
                objetoAno.listarCompromissos();
                break;
            case 5:
                Prompt.imprimir("1 - De um Mês em específico");
                Prompt.imprimir("2- De um dia em específico");
                System.out.println("(qualquer botão) - Voltar Menu");
                
                int escolha2 = Prompt.lerInteiro("-->");
                
                switch (escolha2) {
                    case 1:
                        String mesEspecifico = mesValido();
                        
                        break;
                
                    case 2:
                        int diaEspecifico = Prompt.lerInteiro("Qual Dia:");
                        break;
                    default:
                    mostrarTela(objetoAno);
                        break;
                }
            default:
                Programa.parar();
                break;
        }
    }

    public static String mesValido(){
        String mes = Prompt.lerLinha("Qual Mês:");
        VerificarMes.executar(mes);

        return mes;
    }

    public static void agendar(Ano objetoAno){
        
        String mes = Menu.mesValido();
        int numMes = DefinirNumMes.executar(mes);
        int numDias = DefinirDiasValidos.executar(numMes, objetoAno.isBissexto());
        int dia = Prompt.lerInteiro("Qual dia:");
        int hora = Prompt.lerInteiro("Qual hora:");
        String pessoa = Prompt.lerLinha("Nome da pessoa:");
        String local = Prompt.lerLinha("Nome do local:");
        String assunto = Prompt.lerLinha("Assunto:");

        
        AgendarCompromisso.executar(objetoAno,mes,dia,hora,pessoa,local,assunto,numMes, numDias);
    }
}
