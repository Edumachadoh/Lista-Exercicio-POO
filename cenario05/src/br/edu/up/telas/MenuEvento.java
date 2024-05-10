package br.edu.up.telas;

import br.edu.up.controles.Adicionar;
import br.edu.up.modelos.Evento;
import br.edu.up.util.Prompt;

public class MenuEvento {
    public static void executar(Evento[] listaEventos){
        Prompt.imprimir("\n---Eventos---");
        Prompt.imprimir("\n1- Adicionar Evento (inclusão Evento)");
        Prompt.imprimir("2- Alterar Evento (alteração Evento)");
        Prompt.imprimir("3- Listar Evento (listagem Evento)");
        Prompt.imprimir("4- Excluir Evento (exclusão Evento)");
        Prompt.imprimir("5- Voltar\n");
        Prompt.separador();
        int escolha = Prompt.lerInteiro();
        
        switch (escolha) {
            case 1:
                adicionarEvento(listaEventos);
                break;
            case 2:
                alterarEvento(listaEventos);
                break;
            case 3:
                listarEvento(listaEventos);
                break;
            case 4:

                break;
            case 5:
                Menu.executar(listaEventos);
                break;
            default:
                Prompt.imprimir("Escolha invalida");
                executar(listaEventos);
                break;
        }
    }

    public static void adicionarEvento(Evento[] listaEventos){

        String nomeEvento = Prompt.lerLinha("Nome do Evento:");
        String data = Prompt.lerLinha("Data de realização do evento:");
        String local = Prompt.lerLinha("Nome do local do evento:");
        double precoIngresso = Prompt.lerDecimal("Preço do ingresso:");
        int lotacaoMax = Prompt.lerInteiro("Lotação máxima do evento:");

        Adicionar.evento(listaEventos, nomeEvento, data, local, precoIngresso, lotacaoMax);
    }

    public static void alterarEvento(Evento[] listaEventos){

        int eventoSelecionado = Menu.escolherEvento(listaEventos);

        Prompt.separador();
        Prompt.imprimir("\n---O que deseja alterar---");
        Prompt.imprimir("\n1- nome");
        Prompt.imprimir("2- Data de realização");
        Prompt.imprimir("3- Nome do local");
        Prompt.imprimir("4- Preço do ingresso");
        Prompt.imprimir("5- Lotação máxima");
        Prompt.imprimir("(qualquer botão) - Voltar\n");
        Prompt.separador();

        int escolhaMudanca = Prompt.lerInteiro();
        
        switch (escolhaMudanca) {
            case 1:
                listaEventos[eventoSelecionado].setNome(Prompt.lerLinha("-->"));
                break;
            case 2:
                listaEventos[eventoSelecionado].setData(Prompt.lerLinha("-->"));
                break;
            case 3:
                listaEventos[eventoSelecionado].setLocal(Prompt.lerLinha("-->"));
                break;
            case 4:
                listaEventos[eventoSelecionado].setPrecoIngresso(Prompt.lerDecimal("-->"));
                break;
            case 5:
                listaEventos[eventoSelecionado].setLotacaoMax(Prompt.lerInteiro("-->"));
                break;
            default:
                executar(listaEventos);
                break;
        }
    }
    
    public static void listarEvento(Evento[] eventos){
            String listarEventos = new String();
            int i = 1;
            for (Evento evento : eventos) {
                if(evento != null){
                    listarEventos += "Evento " + i + " --> " + evento.toString() + "\n";
                }
                i++;
            }
    
            Prompt.imprimir(listarEventos);
    }

    public static void excluirEvento(Evento[] listaEventos){
        int n = Menu.escolherEvento(listaEventos);
        listaEventos[n] = null;
    }
}
