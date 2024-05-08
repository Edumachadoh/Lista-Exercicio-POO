package br.edu.up.telas;

import java.util.List;

import br.edu.up.controles.Adicionar;
import br.edu.up.controles.Alterar;
import br.edu.up.controles.Excluir;
import br.edu.up.controles.Listar;
import br.edu.up.lib.Prompt;
import br.edu.up.modelos.Evento;

public class MenuEvento {
    public static void executar(List<Evento> eventos){
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
                adicionarEvento(eventos);
                break;
            case 2:
                alterarEvento();
                break;
            case 3:
                listarEvento(eventos);
                break;
            case 4:
                excluirEvento();
                break;
            case 5:
                Menu.executar(eventos);
                break;
            default:
                Prompt.imprimir("Escolha invalida");
                executar(eventos);
                break;
        }
    }

    public static void adicionarEvento(List<Evento> eventos){
        String nomeEvento = Prompt.lerLinha("Nome do Evento:");
        String data = Prompt.lerLinha("Data de realização do evento:");
        String local = Prompt.lerLinha("Nome do local do evento:");
        double precoIngresso = Prompt.lerDecimal("Preço do ingresso:");
        int lotacaoMax = Prompt.lerInteiro("Lotação máxima do evento:");
        Adicionar.evento(eventos, nomeEvento, data, local, precoIngresso, lotacaoMax);
    }

    public static void alterarEvento(){
        //String nome = Prompt.lerLinha("Nome do Responsável pela evento:");
        //int nPessoas = Prompt.lerInteiro("Número de pessoas registradas na evento:");
        //Alterar.evento();
    }
    
    public static void listarEvento(List<Evento> eventos){
        //String nome = Prompt.lerLinha("Nome do Responsável pela evento:");
        //int nPessoas = Prompt.lerInteiro("Número de pessoas registradas na evento:");
        Listar.evento(eventos);
    }

    public static void excluirEvento(){
        //String nome = Prompt.lerLinha("Nome do Responsável pela evento:");
        //int nPessoas = Prompt.lerInteiro("Número de pessoas registradas na evento:");
        //Excluir.evento();
    }
}
