package br.edu.up.telas;

import java.util.List;

import br.edu.up.modelos.Pessoa;
import br.edu.up.modelos.Professor;
import br.edu.up.util.Prompt;

public class Escolha {
    public static Pessoa professor(List<Pessoa> listaProfessores){
        int i = 0;
        Pessoa professorE = null;
        for (Pessoa pessoa : listaProfessores) {
                i++;
                Professor lProf = (Professor) pessoa;
                Prompt.imprimir((i) + lProf.toString());
            }
            
            do{
                int escolha = Prompt.lerInteiro("Escolha o professor-->");

                if(escolha >= listaProfessores.size()){
                    Prompt.imprimir("Escolha inválida");
                }else{
                    professorE = listaProfessores.get(escolha - 1);
                    break;
                }

            }while(true);

            return professorE;
    }

    
}
