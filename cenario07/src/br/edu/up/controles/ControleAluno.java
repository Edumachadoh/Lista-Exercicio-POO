package br.edu.up.controles;

import br.edu.up.modelos.Aluno;
import br.edu.up.modelos.Pessoa;

public class ControleAluno {
    private Pessoa[] alunos;

    public ControleAluno() {
        this.alunos = new Aluno[0];
    }

    public void addAluno(int anoIngresso, String nomeCurso, String turno, String nome, int rg, int matricula) {
        Pessoa aluno = new Aluno(anoIngresso, nomeCurso, turno, nome, rg, matricula);

        Pessoa[] novoArray = new Aluno[this.alunos.length + 1];

        for (int i = 0; i < this.alunos.length; i++) {
            novoArray[i] = this.alunos[i];
        }

        novoArray[this.alunos.length] = aluno;

        this.alunos = novoArray;
    }

    public String listarAlunos() {
        String listaAlunos = new String();

        for (Pessoa aluno : alunos) {
            if (aluno != null) {
                listaAlunos += "\n" + aluno.toString();
            }
        }

        return listaAlunos;
    }
    public Pessoa getAluno(int matricula){
        Pessoa alunoSelecionado = new Aluno();
        alunoSelecionado = null;
        for (Pessoa aluno : alunos) {
            if(aluno != null){
                if(aluno.getMatricula() == matricula){
                    alunoSelecionado = aluno;
                }
            }
        }

        return alunoSelecionado;
    }
    public Pessoa[] getAlunos() {
        return alunos;
    }
}