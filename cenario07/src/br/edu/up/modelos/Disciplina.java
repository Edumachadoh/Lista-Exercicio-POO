package br.edu.up.modelos;

public class Disciplina {
    private int id;
    private String nome;
    private String curriculo;
    //private //competencias enum[]
    private Professor professor;
    private Aluno[] alunos;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCurriculo() {
        return curriculo;
    }
    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }
    public void adicionarProfessor(Professor professor){
        this.professor = professor;
    }
    public String listarProfessor(){
        return professor.toString();
    }
    public void adicionarAlunos(Aluno[] alunos){
        this.alunos = alunos;
    }
    public String listarAlunos(){
        String listaAlunos = new String();
        
        for (Aluno aluno : alunos) {
            listaAlunos += aluno.toString() + "\n";    
        }

        return listaAlunos;
    }

    
}
