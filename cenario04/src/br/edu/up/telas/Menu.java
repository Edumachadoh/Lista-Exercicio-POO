package br.edu.up.telas;

import br.edu.up.controles.ControleEstacionamento;
import br.edu.up.util.Prompt;
import br.edu.up.modelos.Carro;
import br.edu.up.modelos.Estacionamento;
import br.edu.up.telas.MensagensEstacionamento;

public class Menu {
    public static void executar() {
        int opcao;
        int vagas = 10;
        int entradas = 0;
        int saidas = 0;

        do {
            System.out.printf("------------------------- \n");
            System.out.printf("Digite a ação que deseja de 1 a 4: \n");
            System.out.printf("1 = Adicionar carro  \n");
            System.out.printf("2 = Retirar carro  \n");
            System.out.printf("3 = Relatório \n");
            System.out.printf("4 = Sair \n");

            opcao = Prompt.lerInteiro("|");

            ControleEstacionamento carro = new ControleEstacionamento();


            switch (opcao) {
                
                case 1:
                    entradas ++;
                    vagas --;

                     if (vagas == 0) {
                        MensagensEstacionamento.estacionamentoCheio();
                        break;
                     } 

                    String placa = Prompt.lerLinha("Placa:");
                    String modelo = Prompt.lerLinha("Modelo:");
                    String cor = Prompt.lerLinha("Cor:");

                    carro.AdicionarCarro(placa, cor, modelo, vagas, entradas);
                    
                    System.out.printf("------------------------- \n");
                    System.out.printf("Entradas: %d\n", carro.getEntradasEstacionamento());
                   
                    System.out.printf("Vagas disponiveis: %d\n",carro.getVagasEstacionamento());
                    
                    break;

                case 2:
                    
                    saidas ++;

                    if (vagas == 11) {
                        vagas = 10;
                        break;
                    }

                    String placaRetirar = Prompt.lerLinha("Placa a retirar:");
                    carro.RemoverCarro(placaRetirar, saidas, vagas);
                    
                    vagas ++;
                    System.out.printf("------------------------- \n");
                    System.out.printf("Saidas: %d\n", carro.getSaidasEstacionamento()); 
                    System.out.printf("Vagas disponiveis: %d\n", carro.getVagasEstacionamento());
                    

                    break;
                case 3:
                    MensagensEstacionamento.relatorio(carro.getEntradasEstacionamento(), carro.getSaidasEstacionamento());
                case 4:
                    break;

            }

           

            if (opcao == 4) {
                break;
            }
            

        } while (opcao != 0);
    }
}
