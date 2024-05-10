package br.edu.up.telas;

import br.edu.up.controles.*;

public class MensagensEstacionamento {
    
    public static void estacionamentoCheio() {
        System.out.printf("---------------------------\n");
        System.out.printf("Estacionamento cheio!\n");
    }

    public static void relatorio(int entradas, int saidas) {
        double valorTotal = entradas * 5;
        System.out.printf("---------------------------\n");
        System.out.printf("Entradas no período: %d\n", entradas);
        System.out.printf("Saídas no período: %d\n", saidas);
        System.out.printf("Valor do período: R$ %.2f\n", valorTotal);
    }
    public static void carroInexistente() {
        System.out.printf("Carro inexistente no sistema!");
    }

    public static void placaExistente() {
        System.out.printf("Placa ja contida no sistema!");
    }


}
