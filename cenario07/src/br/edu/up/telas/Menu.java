package br.edu.up.telas;

import br.edu.up.Programa;
import br.edu.up.controles.ControleAluno;
import br.edu.up.controles.ControleDisciplina;
import br.edu.up.controles.ControleProfessor;
import br.edu.up.modelos.Competencia;
import br.edu.up.modelos.Pessoa;
import br.edu.up.modelos.Professor;
import br.edu.up.modelos.Titulacao;
import br.edu.up.util.Prompt;

public class Menu {

    public static void iniciar(){
        ControleAluno cAl = new ControleAluno();
        ControleProfessor cPr = new ControleProfessor();
        ControleDisciplina cDs = new ControleDisciplina();
        cAl.iniciar();
        cPr.iniciar();
        cDs.iniciar();
    }

    public static void mostrarTela(){
        System.out.println("1- Registrar Professor");
        System.out.println("2- Registrar Aluno");
        System.out.println("3- Registrar Disciplina");
        System.out.println("4- Adicionar Aluna a Disciplina");
        System.out.println("5- Listar Professores");
        System.out.println("6- Listar Alunos");
        System.out.println("7- Listar Disciplinas");
        escolherAcao();
    }

    public static void escolherAcao(){
        int escolha = Prompt.lerInteiro();

        switch (escolha) {
            case 1:addProfessor();break;    
            case 2:addAluno();break;    
            case 3:addDisciplina();break;
            case 4:break;
            case 5:listarProfessores();break;
            case 6:listarAlunos();break;
            case 7:listarDisciplinas();break;
            case 8:break;
            case 9:Programa.parar();break;
            default:System.out.println("Escolha inválida\ndigite novamente...");escolherAcao();break;
        }
        mostrarTela();
    }

    public static void addProfessor(){
        String nome = Prompt.lerLinha("Nome do professor:");
        int rg = Prompt.lerInteiro("RG:");
        int matricula =  Prompt.lerInteiro("Matrícula:");
        Titulacao titulacao = addTitulacao();

        ControleProfessor controle = new ControleProfessor();

        controle.addProfessor(nome, rg, matricula, titulacao);
    }

    public static Titulacao addTitulacao(){
        String nomeInstituicao = Prompt.lerLinha("Nome da instituição:");
        int anoConclusao = Prompt.lerInteiro("Ano de Conclusão:");
        String nomeTitulo = Prompt.lerLinha("Nome da Instituição:");
        String tituloTrabalhoConclusao = Prompt.lerLinha("Título do Trabalho de Conclusão:");

        Titulacao titulacao = new Titulacao(nomeInstituicao, anoConclusao, nomeTitulo, tituloTrabalhoConclusao);

        return titulacao;
    }

    public static void listarProfessores(){
        ControleProfessor controleProf = new ControleProfessor();
        Prompt.imprimir(controleProf.listarProfessores());
    }

    public static void addAluno(){
        String nome = Prompt.lerLinha("Nome do professor:");
        int rg = Prompt.lerInteiro("RG:");
        int matricula =  Prompt.lerInteiro("Matrícula:");
        int anoIngresso = Prompt.lerInteiro("Ano de Ingresso:");
        String nomeCurso = Prompt.lerLinha("Nome do Curso:");
        String turno = Prompt.lerLinha("Turno:");
        
        ControleAluno controleAluno = new ControleAluno();

        controleAluno.addAluno(anoIngresso, nomeCurso, turno, nome, rg, matricula);
    }

    public static void listarAlunos(){
        ControleAluno controleAluno = new ControleAluno();
        Prompt.imprimir(controleAluno.listarAlunos());
    }

    public static void addDisciplina(){
        String nome = Prompt.lerLinha("Nome da Disciplina:");
        String curriculo = Prompt.lerLinha("Currículo da Disciplina:");
        Competencia[] competencias = MenuCompetencias.criarCompetencias();
        Pessoa professor = escolherProfessor();

        ControleDisciplina cDisciplina = new ControleDisciplina();
        cDisciplina.addDisciplina(nome, curriculo, competencias, professor);
    }

    public static void listarDisciplinas(){
        ControleDisciplina cDisciplina = new ControleDisciplina();
        Prompt.imprimir(cDisciplina.listarDisciplinas());
    }

    public static Pessoa escolherProfessor(){

        Pessoa professor = new Professor();

        try{

            ControleProfessor controleProf = new ControleProfessor();
            Prompt.imprimir(controleProf.listarProfessores());
    
            int idCurriculo = Prompt.lerInteiro("ID do Professor:");
            professor = controleProf.getProfessor(idCurriculo);

        }catch(NullPointerException e){

         Prompt.imprimir("Professor não encontrado ou não há professores registrados");

        }
        return professor;
    }
}
