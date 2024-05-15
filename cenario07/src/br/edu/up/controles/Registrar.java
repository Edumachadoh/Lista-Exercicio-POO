package br.edu.up.controles;

import java.util.List;

import br.edu.up.modelos.Aluno;
import br.edu.up.modelos.Pessoa;
import br.edu.up.modelos.Professor;
import br.edu.up.modelos.Titulacao;

public class Registrar {
    public static void professor(List<Pessoa> listaProfessores, int idCurriculo, String nome, int rg, int matricula, String nomeInstituicao, int anoConclusao, String nomeTitulo, String tituloTrabalhoConclusao){

        Titulacao titulo = new Titulacao(nomeInstituicao, anoConclusao, nomeTitulo, tituloTrabalhoConclusao);
        Pessoa professor = new Professor(idCurriculo, titulo, nomeTitulo, rg, matricula);

        listaProfessores.add(professor);
    }

    public static void aluno(List<Pessoa> listaAlunos, String nome, int rg, int matricula, String nomeInstituicao, int anoIngresso, String nomeCurso, String turno){

        Pessoa aluno = new Aluno(anoIngresso, nomeCurso, turno, nomeCurso, rg, matricula);
        
        listaAlunos.add(aluno);
    }
}
