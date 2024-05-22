package br.edu.up.controles;

import br.edu.up.modelos.Pessoa;
import br.edu.up.modelos.Professor;
import br.edu.up.modelos.Titulacao;

public class ControleProfessor {
    public static void addProfessor(String nome, int rg, int matricula, int idCurriculo, Titulacao titulacao, Pessoa[] professores){

        Pessoa professor = new Professor(idCurriculo, titulacao, nome, rg, matricula);

        Pessoa[] vet1 = new Professor[professores.length];

        vet1 = professores;

        professores = new Professor[vet1.length + 1];
        
        for (int i = 0; i < vet1.length; i++) {
            professores[i] = vet1[i];
        }

        professores[vet1.length] = professor;
    }
}
