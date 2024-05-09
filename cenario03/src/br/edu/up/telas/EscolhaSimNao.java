package br.edu.up.telas;

import br.edu.up.telas.util.Prompt;

public class EscolhaSimNao {

    public static boolean executar(){
        
        boolean resultado = false;
        String escolha = Prompt.lerLinha("(Sim / Não)");

        if(escolha.contains("s") == true || escolha.contains("S") == true ){
            resultado = true;
        }
        else if(escolha.contains("n") == true || escolha.contains("N") == true ){
            resultado = false;

        }else{
            Prompt.imprimir("Escolha inválida \n--digite novamente--");
            executar();
        }
            return resultado;
    }
}
