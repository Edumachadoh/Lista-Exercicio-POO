package br.edu.up.controles;

import br.edu.up.metodos.Ano;
import br.edu.up.util.Prompt;

public class ListaAno {
    public static Ano[] adicionar(Ano[] listaAno){
  
        int ano = Prompt.lerInteiro("Qual ano:");
        boolean bissexto = VerificarBissexto.executar(ano);
        Ano objetoAno = new Ano(ano, bissexto);


        return objetoAno;
    }

    public static Ano achar(){

    }
}
