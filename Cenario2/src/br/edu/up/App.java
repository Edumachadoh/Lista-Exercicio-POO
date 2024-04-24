package br.edu.up;

import br.edu.up.metodos.Ponto;

public class App {
    public static void main(String[] args) throws Exception {
        
        Ponto ponto1 = new Ponto();

        Ponto ponto2 = new Ponto(2, 5);

        System.out.printf("Distância ponto 1 ao 2: %.1f\n", ponto2.calcularDistancia(ponto1.getX(), ponto1.getY()));
        
        ponto2.setX(7);
        ponto2.setY(2);
        
        System.out.printf("Distância ponto 1 ao 2: %.1f", ponto2.calcularDistancia(ponto1.getX(), ponto1.getY()));

        ponto1.setX(10);
        ponto1.setY(3);



        ponto1.calcularDistancia(ponto2);


    }
}
