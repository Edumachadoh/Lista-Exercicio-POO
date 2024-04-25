package br.edu.up.telas;

import br.edu.up.controles.controlarEstaciomanento;
import br.edu.up.util.Prompt;
import br.edu.up.modelos.Carro;

public class Menu {
    public static void executar() {
        int opcao = 1;

        do {
            System.out.printf("------------------------- \n");
            System.out.printf("Digite a ação que deseja de 1 a 3: \n");
            System.out.printf("1 = Adicionar carro  \n");
            System.out.printf("2 = Retirar carro  \n");
            System.out.printf("3 = Relatório \n");
            System.out.printf("4 = Sair \n");

            opcao = Prompt.lerInteiro("[");

            switch (opcao) {
                case 1:
                    Carro carro1 = new Carro();
                    carro1.
                    break;
                case 2:

                    break;

                case 3:
                    break;
            }


        } while (opcao != 0);
    }
}
