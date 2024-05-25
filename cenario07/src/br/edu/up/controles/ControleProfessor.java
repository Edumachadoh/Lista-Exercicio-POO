package br.edu.up.controles;

import br.edu.up.modelos.Pessoa;
import br.edu.up.modelos.Professor;
import br.edu.up.modelos.Titulacao;

public class ControleProfessor {
    private Pessoa[] professores;
    private int i;
    
    public void iniciar(){
        this.professores = new Professor[0];
        this.i = 0;
    }

    public void addProfessor(String nome, int rg, int matricula, Titulacao titulacao){
        this.i++;

        int idCurriculo = i;
        Pessoa professor = new Professor(idCurriculo, titulacao, nome, rg, matricula);

        Pessoa[] vet1 = new Professor[this.professores.length];

        vet1 = this.professores;

        this.professores = new Professor[vet1.length + 1];
        
        for (int i = 0; i < vet1.length; i++) {
            this.professores[i] = vet1[i];
        }

        this.professores[vet1.length] = professor;
    }

    public String listarProfessores(){
        String listaProfessores = new String();

        for (Pessoa professor : professores) {
            if(professor != null){
                listaProfessores += "\n" + professor.toString();
            }
        }

        return listaProfessores;
    }

    public Pessoa getProfessor(int idCurriculo){
        Pessoa profEsco = new Professor();

        for (Pessoa professor : professores) {
            if(professor instanceof Professor){
                Professor professorC = (Professor)professor;

                if(professorC.getIdCurriculo() == idCurriculo){
                    profEsco = professor;
                }
            }
        }

        return profEsco;
    }
}
