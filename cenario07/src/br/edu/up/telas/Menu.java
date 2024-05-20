package br.edu.up.telas;
import br.edu.up.Programa;
import br.edu.up.controles.ControleDisciplina;
import br.edu.up.modelos.Disciplina;
import br.edu.up.util.Prompt;

public class Menu {
    public static void iniciar(){
        Disciplina[] disciplinas = new Disciplina[0];
        mostrarTela(disciplinas);
    }
    
    public static void mostrarTela(Disciplina[] disciplinas){
        System.out.println("1- Registrar Professor");
        System.out.println("2- Registrar Aluno");
        System.out.println("3- Registrar Disciplina");
        System.out.println("4- Adicionar Aluna a Disciplina");
        escolherAcao(disciplinas);
    }

    public static void escolherAcao(Disciplina[] disciplinas){
        int escolha = Prompt.lerInteiro();

        switch (escolha) {
            case 1:break;    
            case 2:break;    
            case 3:ControleDisciplina.adicionarDisciplina(disciplinas);break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            case 8:break;
            case 9:Programa.parar();break;
            default:System.out.println("Escolha inválida\ndigite novamente...");escolherAcao(disciplinas);break;
        }
        mostrarTela(disciplinas);
    }
}
