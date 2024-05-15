package br.edu.up.telas;

import br.edu.up.controles.DefinirMes;
import br.edu.up.util.Prompt;

public class VerificarMes {

    public static String executar(String mes){
        String nomeMes = DefinirMes.executar(mes);
        
        if(nomeMes == "Null"){
            Prompt.imprimir("Mês inválido\nDigite novamente");
            Menu.mesValido();
        }else{
            voceQuisDizerString(nomeMes);
        }

        return nomeMes;
    }

    public static void voceQuisDizerString(String nomeMes){
        Prompt.imprimir("Você Quis dizer " + nomeMes + "?");
        boolean escolha = EscolhaSimNao.executar();

        if(escolha == false){
            Menu.mesValido();
        }
    }
}
