package br.edu.up.telas;

import br.edu.up.controles.*;

public class MensagensEstacionamento {
    public static void EstacionamentoCheio() {
        System.out.printf("---------------------------\n");
        System.out.printf("Estacionamento cheio!\n");
    }

    public static void Relatorio(int entradas, int saidas) {
        double valorTotal = entradas * 5;
        System.out.printf("---------------------------\n");
        System.out.printf("Entradas no período: %d\n", entradas);
        System.out.printf("Saídas no período: %d\n", saidas);
        System.out.printf("Valor do período: R$ %.2f\n", valorTotal);
    }


}
