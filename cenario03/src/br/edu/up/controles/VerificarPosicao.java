package br.edu.up.controles;

import br.edu.up.metodos.Ano;

public class VerificarPosicao {
    public static boolean seExiste(Ano[] listaAnos, int anoDigitado){
        boolean booleano = false;
        
        for (Ano ano : listaAnos) {
            if (ano.getAno() == anoDigitado) {
                return booleano = true;
            }
        }

        return booleano;

    }

}

