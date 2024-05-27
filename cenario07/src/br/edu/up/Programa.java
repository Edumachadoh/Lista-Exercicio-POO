package br.edu.up;

import br.edu.up.telas.Menu;

public class Programa {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        menu.mostrarTela();
    }
    
    public static void parar(){
        System.exit(0);
    }
}
