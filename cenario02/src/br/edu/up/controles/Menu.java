package br.edu.up.controles;

import br.edu.up.metodos.Ponto;

public class Menu {
    public static void executar() {
        Ponto ponto1 = new Ponto();

        Ponto ponto2 = new Ponto(2, 5);

        System.out.printf("1 - Distância ponto 1 ao 2: %.1f\n", ponto2.calcularDistancia(ponto1.getX(), ponto1.getY()));
        
        ponto2.setX(7);
        ponto2.setY(2);
        
        System.out.printf("2 - Distância ponto 1 ao 2: %.1f\n", ponto2.calcularDistancia(ponto1.getX(), ponto1.getY()));

        ponto1.setX(10);
        ponto1.setY(3);

        // ponto1.calcularDistancia(ponto2);
        System.out.printf("3 - (metodo 1): %.1f\n", ponto1.calcularDistancia(ponto2.getX(), ponto2.getY()));
        System.out.printf("4 - (metodo 2): %.1f", ponto1.calcularDistancia(ponto2));
    }
}
