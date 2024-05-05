package br.edu.up.telas;

import br.edu.up.util.Prompt;
import br.edu.up.controles.ControleAeronave;

public class Menu {
    public static void executar() {
        int opcao;
        int numAeronave = 0;
        int passageiro = 0;
        int comandante = 0;
        int comissario = 0;

        System.out.printf("------------------------- \n");
        int idCodigo = Prompt.lerInteiro("Codigo da aeronave: "); 
        String tipo = Prompt.lerLinha("Tipo: "); 
        int qtdAssentos = Prompt.lerInteiro("Qtd assentos: "); 
       
       
       
        do {
            System.out.printf("------------------------- \n");
            System.out.printf("Digite a ação que deseja de 1 a 4: \n");
            System.out.printf("1 = Adicionar passageiro\n");
            System.out.printf("2 = Adicionar tripulacao\n");
            System.out.printf("3 = Relatório passageiro \n");
            System.out.printf("4 = Relatório tripulacao \n");
            System.out.printf("5 = Sair \n");

            opcao = Prompt.lerInteiro("");
    

            ControleAeronave aeronave = new ControleAeronave();
            aeronave.adicionarAeronave(numAeronave);

            switch (opcao) {
                case 1:
                   passageiro ++;

                    String nome = Prompt.lerLinha("Nome:");
                    String rg = Prompt.lerLinha("Rg:");
                    int idPassagem = Prompt.lerInteiro("Id passagem:");
                    int idBagagem = Prompt.lerInteiro("Id bagagem:");
                    String numAssento = Prompt.lerLinha("Numero assento:");
                    String classeAssento = Prompt.lerLinha("Classe assento:");
                    int dia = Prompt.lerInteiro("Dia:");
                    int mes = Prompt.lerInteiro("Mes:");
                    int hora = Prompt.lerInteiro("Hora:");
                    int minuto = Prompt.lerInteiro("Minuto:");
                    
                    aeronave.adicionarPassageiro(passageiro, numAeronave, nome, rg, idPassagem, numAssento, classeAssento, dia, mes, hora, minuto, idBagagem);

                    break;
                case 2:
                int tipoTripulacao = Prompt.lerInteiro("Qual tripulante [1 - Comandante / 2 - Comissário]:");
                    
                aeronave.adicionarTripulacao(tipoTripulacao);
                    break;
                case 3:
                    
                    break;

                default:
                    break;
            }
        } while(opcao != 4);
    }
}
