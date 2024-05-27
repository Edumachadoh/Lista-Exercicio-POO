package br.edu.up.controles;

import br.edu.up.modelos.Pessoa;
import br.edu.up.modelos.Professor;
import br.edu.up.modelos.Titulacao;

public class ControleProfessor {
    private Pessoa[] professores;
    private int i;

    public ControleProfessor() {
        this.professores = new Professor[0];
        this.i = 0;
    }

    public void addProfessor(String nome, int rg, int matricula, Titulacao titulacao) {
        this.i++;
        int idCurriculo = i;
        Pessoa professor = new Professor(idCurriculo, titulacao, nome, rg, matricula);

        Pessoa[] novoArray = new Professor[this.professores.length + 1];
        
        for (int i = 0; i < this.professores.length; i++) {
            novoArray[i] = this.professores[i];
        }

        novoArray[this.professores.length] = professor;

        this.professores = novoArray;
    }

    public String listarProfessores() {
        String listaProfessores = new String();

        for (Pessoa professor : professores) {
            if (professor != null) {
                listaProfessores += "\n" + professor.toString();
            }
        }

        return listaProfessores;
    }

    public Pessoa getProfessor(int idCurriculo) {
        for (Pessoa professor : professores) {
            if (professor instanceof Professor) {
                Professor professorC = (Professor) professor;
                if (professorC.getIdCurriculo() == idCurriculo) {
                    return professor;
                }
            }
        }
        return null;
    }

    public Pessoa[] getProfessores() {
        return professores;
    }
}