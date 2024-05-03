package br.edu.up.telas;

import br.edu.up.util.Prompt;
import br.edu.up.controles.ControleAeronave;

public class Menu {
    public static void executar() {
        int opcao;

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


            switch (opcao) {
                case 1:
                    int idPassagem = Prompt.lerInteiro("Id passagem:");
                    
                    aeronave.adicionarPassageiro(idPassagem);

                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;

                default:
                    break;
            }









        } while(opcao != 4);



    }
}
