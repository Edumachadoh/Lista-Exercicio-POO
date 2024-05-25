package br.edu.up.controles;

import br.edu.up.modelos.Aluno;
import br.edu.up.modelos.Pessoa;


public class ControleAluno {
private Pessoa[] alunos;

    
    public void iniciar(){
        this.alunos = new Aluno[0];
    }

    public void addAluno(int anoIngresso, String nomeCurso, String turno, String nome, int rg, int matricula){
        
        Pessoa aluno = new Aluno(anoIngresso, nomeCurso, turno, nome, rg, matricula);

        Pessoa[] vet1 = new Aluno[this.alunos.length];

        vet1 = this.alunos;

        this.alunos = new Aluno[vet1.length + 1];
        
        for (int i = 0; i < vet1.length; i++) {
            this.alunos[i] = vet1[i];
        }

        this.alunos[vet1.length] = aluno;
    }

    public String listarAlunos(){
        String listaAlunos = new String();

        for (Pessoa aluno : alunos) {
            if(aluno != null){
                listaAlunos += "\n" + aluno.toString();
            }
        }

        return listaAlunos;
    }
}
