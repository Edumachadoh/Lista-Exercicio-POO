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

        ControleEstacionamento carro = new ControleEstacionamento();
        carro.setEntradasEstacionamento(entradas);
        carro.setVagasEstacionamento(vagas);
        
        do {
            System.out.printf("------------------------- \n");
            System.out.printf("Digite a ação que deseja de 1 a 4: \n");
            System.out.printf("1 = Adicionar carro  \n");
            System.out.printf("2 = Retirar carro  \n");
            System.out.printf("3 = Relatório \n");
            System.out.printf("4 = Sair \n");

            opcao = Prompt.lerInteiro("|");

            switch (opcao) {
                
                case 1:
                    if (carro.getVagasEstacionamento() == 0) {
                        MensagensEstacionamento.estacionamentoCheio();
                         break;
                     } 

                    carro.setEntradasEstacionamento(carro.getEntradasEstacionamento() + 1);
                    carro.setVagasEstacionamento(carro.getVagasEstacionamento() - 1);
                    
                    
                    String placa = Prompt.lerLinha("Placa:");
                    String modelo = Prompt.lerLinha("Modelo:");
                    String cor = Prompt.lerLinha("Cor:");

                    int num = carro.AdicionarCarro(placa, cor, modelo, carro.getVagasEstacionamento(), carro.getEntradasEstacionamento());

                    if (num == 1) {
                        MensagensEstacionamento.placaExistente();
                    }
                    

                    System.out.printf("------------------------- \n");
                    System.out.printf("Entradas: %d\n", carro.getEntradasEstacionamento());
                   
                    System.out.printf("Vagas disponiveis: %d\n",carro.getVagasEstacionamento() );
                    
                    break;

                case 2:
                    
                    carro.setSaidasEstacionamento(carro.getSaidasEstacionamento() + 1);
                    carro.setVagasEstacionamento(carro.getVagasEstacionamento() + 1);
                    // saidas ++;
                    // vagas ++;

                    if (carro.getVagasEstacionamento() == 11) {
                        carro.setVagasEstacionamento(10);
                        break;
                    }

                    String placaRetirar = Prompt.lerLinha("Placa a retirar:");
                    int num2 = carro.RemoverCarro(placaRetirar, carro.getSaidasEstacionamento(), carro.getVagasEstacionamento());

                    if (num2 == 1) {
                        MensagensEstacionamento.carroInexistente();
                    } else {
                        System.out.printf("Carro retirado!!!!\n");
                    }
                    
                    
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
