package br.edu.up.controles;

import br.edu.up.modelos.Competencia;
import br.edu.up.modelos.Disciplina;
import br.edu.up.modelos.Pessoa;

public class ControleDisciplina {

    private Disciplina[] disciplinas;
    private int i;
    
    public void iniciar(){
        this.disciplinas = new Disciplina[0];
        i = 0;
    }

    public void addDisciplina(String nome, String curriculo, Competencia[] competencias, Pessoa professor){
        this.i++;

        int id = this.i;
        
        Disciplina Disciplina = new Disciplina(id, nome, curriculo, competencias, professor);

        Disciplina[] vet1 = new Disciplina[this.disciplinas.length];

        vet1 = this.disciplinas;

        this.disciplinas = new Disciplina[vet1.length + 1];
        
        for (int i = 0; i < vet1.length; i++) {
            this.disciplinas[i] = vet1[i];
        }

        this.disciplinas[vet1.length] = Disciplina;
    }

    public String listarDisciplinas(){
        String listadisciplinas = new String();

        for (Disciplina Disciplina : disciplinas) {
            if(Disciplina != null){
                listadisciplinas += "\n" + Disciplina.toString();
            }
        }

        return listadisciplinas;
    }
}
