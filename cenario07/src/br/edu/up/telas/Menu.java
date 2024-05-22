package br.edu.up.telas;
import br.edu.up.Programa;
import br.edu.up.controles.ControleProfessor;
import br.edu.up.modelos.Aluno;
import br.edu.up.modelos.Disciplina;
import br.edu.up.modelos.Pessoa;
import br.edu.up.modelos.Professor;
import br.edu.up.modelos.Titulacao;
import br.edu.up.util.Prompt;

public class Menu {
    public static void iniciar(){
        Pessoa[] professores = new Professor[0];
        Pessoa[] alunos = new Aluno[0];
        Disciplina[] disciplinas = new Disciplina[0];
        mostrarTela(disciplinas, professores, alunos);
    }
    
    public static void mostrarTela(Disciplina[] disciplinas, Pessoa[] professores, Pessoa[] alunos){
        System.out.println("1- Registrar Professor");
        System.out.println("2- Registrar Aluno");
        System.out.println("3- Registrar Disciplina");
        System.out.println("4- Adicionar Aluna a Disciplina");
        escolherAcao(disciplinas, professores, alunos);
    }

    public static void escolherAcao(Disciplina[] disciplinas, Pessoa[] professores, Pessoa[] alunos){
        int escolha = Prompt.lerInteiro();

        switch (escolha) {
            case 1:addProfessor(professores);break;    
            case 2:break;    
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            case 8:break;
            case 9:Programa.parar();break;
            default:System.out.println("Escolha inválida\ndigite novamente...");escolherAcao(disciplinas, professores, alunos);break;
        }
        mostrarTela(disciplinas, professores, alunos);
    }

    public static void addProfessor(Pessoa[] professores){
        String nome = Prompt.lerLinha("Nome do professor:");
        int rg = Prompt.lerInteiro("RG:");
        int matricula =  Prompt.lerInteiro("Matrícula:");
        int idCurriculo = professores.length + 1;
        Titulacao titulacao = addTitulacao();

        ControleProfessor.addProfessor(nome, rg, matricula, idCurriculo, titulacao, professores);
    }

    public static Titulacao addTitulacao(){
        String nomeInstituicao = Prompt.lerLinha("Nome da instituição:");
        int anoConclusao = Prompt.lerInteiro("Ano de Conclusão:");
        String nomeTitulo = Prompt.lerLinha("Nome da Instituição:");
        String tituloTrabalhoConclusao = Prompt.lerLinha("Título do Trabalho de Conclusão:");

        Titulacao titulacao = new Titulacao(nomeInstituicao, anoConclusao, nomeTitulo, tituloTrabalhoConclusao);

        return titulacao;
    }
}
