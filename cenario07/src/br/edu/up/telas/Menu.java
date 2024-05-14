package br.edu.up.telas;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.Programa;
import br.edu.up.controles.Registrar;
import br.edu.up.modelos.Disciplina;
import br.edu.up.modelos.Pessoa;
import br.edu.up.util.Prompt;

public class Menu {
    
    public static void executar(){
        List<Pessoa> listaProfessores = new ArrayList<>();
        List<Pessoa> listaAlunos = new ArrayList<>();
        List<Disciplina> listaDisciplinas = new ArrayList<>();
        mostrarTela();
        escolherAcao(listaProfessores, listaAlunos, listaDisciplinas);

    }
    public static void mostrarTela(){
        System.out.println("1- Registrar Professor");
        System.out.println("2- Registrar Aluno");
        System.out.println("2- Registrar Disciplina");
    }

    public static void escolherAcao(List<Pessoa> listaProfessores, List<Pessoa> listaAlunos,List<Disciplina> listaDisciplinas){
        int escolha = Prompt.lerInteiro();

        switch (escolha) {
            case 1:registrarProfessor(listaProfessores);break;    
            case 2:registrarALuno(listaAlunos);break;    
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            case 8:break;
            case 9: Programa.parar();break;
            default:System.out.println("Escolha inválida\ndigite novamente...");escolherAcao(listaProfessores, listaAlunos, listaDisciplinas);break;
        }
        executar();
    }

    public static void registrarProfessor(List<Pessoa> listaProfessores){
        String nome = Prompt.lerLinha("Nome:");
        int rg = Prompt.lerInteiro("RG:");
        int matricula = Prompt.lerInteiro("Matrícula:");
        String nomeInstituicao = "Universidade Positivo";

        int idCurriculo = Prompt.lerInteiro("Identificação do Curriculo: ");
        int anoConclusao = Prompt.lerInteiro("Ano de Conclusão");
        String nomeTitulo = Prompt.lerLinha("Nome do Título:");
        String tituloTrabalhoConclusao = Prompt.lerLinha("Título do Trabalho de Conclusão:");

        Registrar.professor(listaProfessores, idCurriculo, nome, rg, matricula, nomeInstituicao, anoConclusao, nomeTitulo, tituloTrabalhoConclusao);
    }
    public static void registrarALuno(List<Pessoa> listaAlunos){
        String nome = Prompt.lerLinha("Nome:");
        int rg = Prompt.lerInteiro("RG:");
        int matricula = Prompt.lerInteiro("Matrícula:");
        String nomeInstituicao = "Universidade Positivo";

        int anoIngresso = Prompt.lerInteiro("Ano de Ingresso");
        String nomeCurso = Prompt.lerLinha("Nome do Curso:");
        String turno = Prompt.lerLinha("Turno:");

        Registrar.aluno(listaAlunos, nome, rg, matricula, nomeInstituicao, anoIngresso, nomeCurso, turno);
    }   

    
}
