package br.edu.up.telas;

import br.edu.up.Programa;
import br.edu.up.controles.ControleAluno;
import br.edu.up.controles.ControleDisciplina;
import br.edu.up.controles.ControleProfessor;
import br.edu.up.modelos.Aluno;
import br.edu.up.modelos.Competencia;
import br.edu.up.modelos.Disciplina;
import br.edu.up.modelos.Pessoa;
import br.edu.up.modelos.Titulacao;
import br.edu.up.util.Prompt;

public class Menu {
    private ControleAluno controleAluno;
    private ControleProfessor controleProfessor;
    private ControleDisciplina controleDisciplina;
    
    public Menu(){
        controleAluno = new ControleAluno();
        controleProfessor = new ControleProfessor();
        controleDisciplina = new ControleDisciplina();
    }

    public void mostrarTela(){
        System.out.println("1- Registrar Professor");
        System.out.println("2- Registrar Aluno");
        System.out.println("3- Registrar Disciplina");
        System.out.println("4- Adicionar Aluna a Disciplina");
        System.out.println("5- Listar Professores");
        System.out.println("6- Listar Alunos");
        System.out.println("7- Listar Disciplinas");
        System.out.println("8- Adicionar Competencias concluídas a Aluno");
        System.out.println("9- Verificar Situação Aluno");
        escolherAcao();
    }

    public void escolherAcao(){
        int escolha = Prompt.lerInteiro();

        switch (escolha) {
            case 1:addProfessor();break;    
            case 2:addAluno();break;    
            case 3:addDisciplina();break;
            case 4:addAlunoDisciplina();break;
            case 5:listarProfessores();break;
            case 6:listarAlunos();break;
            case 7:listarDisciplinas();break;
            case 8:addCompetenciaAAluno();break;
            case 9:verificarSituacaoAluno();break;
            case 10:Programa.parar();break;
            default:System.out.println("Escolha inválida\ndigite novamente...");escolherAcao();break;
        }
        mostrarTela();
    }

    public void addProfessor(){
        String nome = Prompt.lerLinha("Nome do professor:");
        int rg = Prompt.lerInteiro("RG:");
        int matricula =  Prompt.lerInteiro("Matrícula:");
        Titulacao titulacao = addTitulacao();

        this.controleProfessor.addProfessor(nome, rg, matricula, titulacao);
    }

    public Titulacao addTitulacao(){
        String nomeInstituicao = Prompt.lerLinha("Nome da instituição:");
        int anoConclusao = Prompt.lerInteiro("Ano de Conclusão:");
        String nomeTitulo = Prompt.lerLinha("Nome da Instituição:");
        String tituloTrabalhoConclusao = Prompt.lerLinha("Título do Trabalho de Conclusão:");

        Titulacao titulacao = new Titulacao(nomeInstituicao, anoConclusao, nomeTitulo, tituloTrabalhoConclusao);

        return titulacao;
    }

    public void listarProfessores(){
        Prompt.imprimir(this.controleProfessor.listarProfessores());
    }

    public void addAluno(){
        String nome = Prompt.lerLinha("Nome do aluno:");
        int rg = Prompt.lerInteiro("RG:");
        int matricula =  Prompt.lerInteiro("Matrícula:");
        int anoIngresso = Prompt.lerInteiro("Ano de Ingresso:");
        String nomeCurso = Prompt.lerLinha("Nome do Curso:");
        String turno = Prompt.lerLinha("Turno:");

        this.controleAluno.addAluno(anoIngresso, nomeCurso, turno, nome, rg, matricula);
    }

    public void listarAlunos(){
        Prompt.imprimir(this.controleAluno.listarAlunos());
    }

    public void addDisciplina(){
        String nome = Prompt.lerLinha("Nome da Disciplina:");
        String curriculo = Prompt.lerLinha("Currículo da Disciplina:");
        Competencia[] competencias = MenuCompetencias.criarCompetencias();
        Pessoa professor = escolherProfessor();

        this.controleDisciplina.addDisciplina(nome, curriculo, competencias, professor);
    }

    public void listarDisciplinas(){
        Prompt.imprimir(this.controleDisciplina.listarDisciplinas());
    }

    public Pessoa escolherProfessor(){

        Pessoa professor = new Aluno();
        professor = null;

        if(!(controleProfessor.getProfessores().length <= 0)){
            listarProfessores();
    
            int idCurriculo = Prompt.lerInteiro("ID do Professor:");
            professor = this.controleProfessor.getProfessor(idCurriculo);

        }else{
            Prompt.imprimir("Não há professores registrados");
            mostrarTela();
        }

        return professor;
    }

    public void addAlunoDisciplina(){
        Prompt.separador();
        
        if(controleAluno.getAlunos().length <= 0){
            Prompt.imprimir("Não há alunos registrados");
            
        }else{
            listarAlunos();
            Prompt.separador();
        }
        
    }

    public Pessoa escolherAluno(){

        Pessoa aluno = new Aluno();
        aluno = null;

        if(!(controleAluno.getAlunos().length <= 0)){
            listarAlunos();
    
            int matricula = Prompt.lerInteiro("Matrícula do Aluno:");
            aluno = this.controleAluno.getAluno(matricula);

        }else{
            Prompt.imprimir("Não há alunos registrados");
            mostrarTela();
        }

        return aluno;
    }

    public Disciplina escolherDisciplina(){

        Disciplina disciplina = new Disciplina();
        disciplina = null;

        if(!(controleDisciplina.getDisciplinas().length <= 0)){
            listarDisciplinas();
    
            int id = Prompt.lerInteiro("ID disciplina:");
            disciplina = this.controleDisciplina.getDisciplina(id);

        }else{
            Prompt.imprimir("Não há disciplinas registradas ou disciplina inválida");
            mostrarTela();
        }

        return disciplina;
    }

    public void addCompetenciaAAluno(){

        Pessoa pessoa = escolherAluno();
        Aluno aluno = (Aluno)pessoa;

        int escolha;

        do{
        aluno.adicionarCompetencia(MenuCompetencias.setCompetencia());
        escolha = Prompt.lerInteiro("Deseja adicionar mais uma? (0 para parar)");
        
        if(escolha == 0){
            break;
        }

        }while(true);


    }

    public void verificarSituacaoAluno(){
        Pessoa pessoa = escolherAluno();
        Aluno aluno = (Aluno)pessoa;

        String apr = aluno.verificarAprovacao();
        Prompt.imprimir(apr);

    }
}
