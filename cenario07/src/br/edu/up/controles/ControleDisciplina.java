package br.edu.up.controles;

import br.edu.up.modelos.Disciplina;

public class ControleDisciplina {
    

    public static void adicionarDisciplina(Disciplina[] disciplinas){
        disciplinas = new Disciplina[disciplinas.length + 1];
    }
}
