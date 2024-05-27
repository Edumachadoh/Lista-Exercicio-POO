package br.edu.up.controles;

import br.edu.up.modelos.Competencia;
import br.edu.up.modelos.Disciplina;
import br.edu.up.modelos.Pessoa;

public class ControleDisciplina {

    private Disciplina[] disciplinas;
    private int i;

    public ControleDisciplina() {
        this.disciplinas = new Disciplina[0];
        this.i = 0;
    }

    public void addDisciplina(String nome, String curriculo, Competencia[] competencias, Pessoa professor) {
        this.i++;
        int id = this.i;
        Disciplina disciplina = new Disciplina(id, nome, curriculo, competencias, professor);

        Disciplina[] novoArray = new Disciplina[this.disciplinas.length + 1];

        for (int i = 0; i < this.disciplinas.length; i++) {
            novoArray[i] = this.disciplinas[i];
        }

        novoArray[this.disciplinas.length] = disciplina;

        this.disciplinas = novoArray;
    }

    public String listarDisciplinas() {
        String listaDisciplinas = new String();

        for (Disciplina disciplina : disciplinas) {
            if (disciplina != null) {
                listaDisciplinas += "\n" + disciplina.toString();
            }
        }

        return listaDisciplinas;
    }
}