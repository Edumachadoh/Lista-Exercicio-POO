package br.edu.up.modelos;

public class Disciplina {
    private int id;
    private String nome;
    private String curriculo;
    private Competencia[] competencias; 
    private Pessoa professor;
    private Pessoa[] alunos;


    public Disciplina(int id, String nome, String curriculo, Competencia[] competencias, Pessoa professor) {
        this.id = id;
        this.nome = nome;
        this.curriculo = curriculo;
        this.competencias = competencias;
        this.professor = professor;
    }
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
    public Competencia[] getCompetencias() {
        return competencias;
    }
    public void setCompetencias(Competencia[] competencias) {
        this.competencias = competencias;
    }
    public String listarAlunos(){
        String listaAlunos = new String();
        
        for (Pessoa aluno : alunos) {
            listaAlunos += aluno.toString() + "\n";    
        }

        return listaAlunos;
    }
    

    
}
