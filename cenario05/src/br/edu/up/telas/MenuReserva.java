package br.edu.up.telas;

import br.edu.up.controles.Adicionar;
import br.edu.up.controles.HaVagas;
import br.edu.up.modelos.Evento;
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
        
        if(listaEventos[0] == null && escolha < 5){
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
                alterarReserva();
                break;
            case 3:
                break;
            case 4:
                excluirReserva(listaEventos);
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

    public static void alterarReserva(){
 
    }

    public static void excluirReserva(Evento[] listaEventos){
        int eventoSelecionado = Menu.escolherEvento(listaEventos);

        String nome = Prompt.lerLinha();
    }
}
