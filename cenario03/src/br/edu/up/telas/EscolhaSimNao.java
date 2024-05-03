package br.edu.up.telas;

import br.edu.up.util.Prompt;

public class EscolhaSimNao {

    public static boolean verificar(){
        
        boolean resultado = false;
        String escolha = Prompt.lerLinha("(Sim / Não)");

        if(escolha.contains("s") == true || escolha.contains("S") == true ){
            resultado = true;
            return resultado;
        }
        else if(escolha.contains("n") == true || escolha.contains("N") == true ){
            resultado = false;
            return resultado;
        }
        else{
            System.out.println("Escolha inválida \n--digite novamente--");
            return verificar();
        }
    }
}
