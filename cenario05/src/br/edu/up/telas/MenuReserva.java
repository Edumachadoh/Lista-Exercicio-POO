package br.edu.up.telas;

import br.edu.up.controles.Adicionar;
import br.edu.up.controles.HaVagas;
import br.edu.up.modelos.Evento;
import br.edu.up.modelos.Reserva;
import br.edu.up.util.Prompt;

public class MenuReserva {
    public static void executar(Evento[] listaEventos){
        Prompt.separador();
        Prompt.imprimir("\n---Reservas---");
        Prompt.imprimir("\n1- Realizar reserva (inclusão reserva)");
        Prompt.imprimir("2- Alterar reserva (alteração reserva)");
        Prompt.imprimir("3- Listar reservas (listagem reserva)");
        Prompt.imprimir("4- Excluir reserva (exclusão reserva)");
        Prompt.imprimir("5- Voltar\n");
        Prompt.separador();

        int escolha = Prompt.lerInteiro();
        
        if(listaEventos[0] == null){
            Prompt.imprimir("Nenhum Evento Registrado");
            Menu.executar(listaEventos);
        }
        switch (escolha) {
            case 1:
                int eventoSelecionado = Menu.escolherEvento(listaEventos);
                boolean haVagas = HaVagas.verificar(listaEventos[eventoSelecionado]);
                
                if(haVagas == true){
                    realizarReserva(listaEventos[eventoSelecionado], listaEventos);
                    Prompt.imprimir("Reserva feita com sucesso!");
                }else{
                    Prompt.imprimir("Evento Cheio");
                }
                
                break;
            case 2:
                int eventoSelecionado2 = Menu.escolherEvento(listaEventos);

                listaEventos[eventoSelecionado2].setQtdIngressos();
                listaEventos[eventoSelecionado2].calcularValorTotalVendas();

                String nomeResponsavel = Prompt.lerLinha("Nome do Responsável pela reserva:");
                int qtdPessoas = Prompt.lerInteiro("Número de pessoas registradas na reserva:");
        
                Reserva[] reservas = listaEventos[eventoSelecionado2].getReservas();
                
                int i = 0;
                for (Reserva reserva : reservas) {
                    
                    if(reserva.getNomeResponsavel() == nomeResponsavel && reserva.getQtdPessoas() == qtdPessoas){
                        Prompt.imprimir("Reserva encontrada");
                        alterarReserva(reservas[i], listaEventos);
                    }
                    i++;

                }  
                Prompt.imprimir("Reserva encontrada");
                executar(listaEventos);
                break;
            case 3:
                listarReservas(listaEventos);
                break;
            case 4:
                excluir(listaEventos);
                break;
            case 5:
                Menu.executar(listaEventos);
                break;
            default:
                Prompt.imprimir("Escolha invalida");
                executar(listaEventos);
                break;

                
        }
        executar(listaEventos);
    }

    public static void realizarReserva(Evento eventoSelecionado, Evento[] listaEventos){

        String nomeResponsavel = Prompt.lerLinha("Nome do Responsável pela reserva:");
        int qtdPessoas = Prompt.lerInteiro("Número de pessoas registradas na reserva:");

        if(qtdPessoas > eventoSelecionado.getLotacaoMax() - eventoSelecionado.getNumReservasFeitas()){
            Prompt.imprimir("Não há vagas o suficiente\n Retornando");
            executar(listaEventos);
        }

        String data = Prompt.lerLinha("Data da reserva:");
        
        Adicionar.reserva(nomeResponsavel,qtdPessoas,data,eventoSelecionado);

    }

    public static void listarReservas(Evento[] eventos){

        for (Evento evento : eventos) {
            evento.listarReservas();
        }

    }

    public static void alterarReserva(Reserva reserva, Evento[] listaEventos){
 

        int escolha;
        do{ 
        Prompt.separador();
        Prompt.imprimir("\n---O que deseja alterar ? ---");
        Prompt.imprimir("\n1- Mudar nome Responsavel");
        Prompt.imprimir("2- Mudar Quantidade de Pessoas");
        Prompt.imprimir("(Qualquer botão) - Voltar\n");
        Prompt.separador();
        escolha = Prompt.lerInteiro();

        switch (escolha) {
            case 1:
                reserva.setNomeResponsavel(Prompt.lerLinha("alterar -->"));
            break;
            case 2:
                reserva.setQtdPessoas(Prompt.lerInteiro("alterar -->"));
                break;
            default:
                executar(listaEventos);
                break;
        }

        }while(true);
    }

    public static void excluir(Evento[] eventos){
        
        int eventoSelecionado = Menu.escolherEvento(eventos);
        
        eventos[eventoSelecionado].setQtdIngressos();
        eventos[eventoSelecionado].calcularValorTotalVendas();

        String nomeResponsavel = Prompt.lerLinha("Nome do Responsável pela reserva:");
        int qtdPessoas = Prompt.lerInteiro("Número de pessoas registradas na reserva:");

        boolean deuCerto = eventos[eventoSelecionado].excluirReserva(nomeResponsavel, qtdPessoas);

        if(deuCerto == true){
            Prompt.imprimir("Reserva excluida com sucesso");
            executar(eventos);
        }else{
            Prompt.imprimir("Reserva não encontrada");
            executar(eventos);
        }

        
    }
}
