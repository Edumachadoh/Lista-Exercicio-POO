package br.edu.up.telas;

import br.edu.up.util.Prompt;
import br.edu.up.controles.ControleAeronave;

public class Menu {
    public static void executar() {
        int opcao;
        int numAeronave = 0;
        int passageiro = 0;
        int tripulacao = 0;
        String nome;
        String rg;

        System.out.printf("------------------------- \n");
        int idCodigo = Prompt.lerInteiro("Codigo da aeronave: "); 
        String tipo = Prompt.lerLinha("Tipo: "); 
        int qtdAssentos = Prompt.lerInteiro("Qtd assentos: "); 
       
        ControleAeronave aeronave = new ControleAeronave();
       
        do {
            System.out.printf("------------------------- \n");
            System.out.printf("Digite a ação que deseja de 1 a 4: \n");
            System.out.printf("1 = Adicionar passageiro\n");
            System.out.printf("2 = Adicionar tripulacao\n");
            System.out.printf("3 = Relatório passageiro \n");
            System.out.printf("4 = Relatório tripulacao \n");
            System.out.printf("5 = Sair \n");

            opcao = Prompt.lerInteiro("");
    

            
            
            aeronave.adicionarAeronave(numAeronave, idCodigo, tipo, qtdAssentos);

            switch (opcao) {
                case 1:
                   

                    nome = Prompt.lerLinha("Nome:");
                    rg = Prompt.lerLinha("Rg:");
                    int idPassagem = Prompt.lerInteiro("Id passagem:");
                    int idBagagem = Prompt.lerInteiro("Id bagagem:");
                    String numAssento = Prompt.lerLinha("Numero assento:");
                    String classeAssento = Prompt.lerLinha("Classe assento:");
                    int dia = Prompt.lerInteiro("Dia:");
                    int mes = Prompt.lerInteiro("Mes:");
                    int hora = Prompt.lerInteiro("Hora:");
                    int minuto = Prompt.lerInteiro("Minuto:");
                    
                    aeronave.adicionarPassageiro(passageiro, numAeronave, nome, rg, idPassagem, numAssento, classeAssento, dia, mes, hora, minuto, idBagagem);
                    passageiro ++;
                    break;
                case 2:
                    

                    nome = Prompt.lerLinha("Nome:");
                    rg = Prompt.lerLinha("Rg:");
                    int tipoTripulacao = Prompt.lerInteiro("Qual tripulante [1 - Comandante / 2 - Comissário]:");
                    int idAeronautica = Prompt.lerInteiro("Id aeronautica: ");
                    int idMatricula = Prompt.lerInteiro("Id matricula: ");

                    if (tipoTripulacao == 1) {

                        int totalHorasVoo = Prompt.lerInteiro("Total de horas de voo: ");     
                        aeronave.adicionarComandante(nome, rg, tripulacao, idAeronautica, idMatricula, totalHorasVoo); 

                    } else if (tipoTripulacao == 2) {

                        int numIdiomas = Prompt.lerInteiro("Idiomas fluentes: ");

                        int[] idiomas = new int[numIdiomas];

                        aeronave.adicionarComissario(nome, rg ,tripulacao,idAeronautica, idMatricula, idiomas);
                       
                        tripulacao ++; 
                           
                    break;
                    }
                case 3:
                    System.out.println(aeronave);
                    break;

                default:
                    break;
            }
        } while(opcao != 4);
    }
}
