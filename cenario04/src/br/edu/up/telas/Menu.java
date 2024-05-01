package br.edu.up.telas;

import br.edu.up.controles.ControleEstacionamento;
import br.edu.up.util.Prompt;
import br.edu.up.modelos.Carro;

public class Menu {
    public static void executar() {
        int opcao = 1;
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

            opcao = Prompt.lerInteiro("[");

            ControleEstacionamento carro = new ControleEstacionamento();


            switch (opcao) {
                
                case 1:
                    carro.setControle(1);
                    carro.setVagas(vagas);
                    
                    vagas --;

                    entradas ++;
                    carro.setEntradas(entradas);
                    carro.AdicionarRemoverCarro();
                    break;
                case 2:
                    carro.setControle(2);
                    vagas ++;
                    carro.setVagas(vagas);
                    
                    saidas ++;
                    carro.setSaidas(saidas);
                    carro.AdicionarRemoverCarro();
                    break;
                case 3:
                    carro.emitirRelatorio(entradas, saidas);;
                case 4:
                    break;

            }
            if (opcao == 4) {
                break;
            }
            

        } while (opcao != 0);
    }
}
