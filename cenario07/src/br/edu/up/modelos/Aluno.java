package br.edu.up.modelos;

public class Aluno extends Pessoa{
    private int anoIngresso;
    private String nomeCurso;
    private String turno;
    private Disciplina disciplina;

    private Aprovacao aprovacao;
    //private Situacao[] situacao;
    private Competencia[] competencias;

    public Aluno(int anoIngresso, String nomeCurso, String turno, String nome, int rg, int matricula) {
        
        super(nome, rg, matricula);
        this.anoIngresso = anoIngresso;
        this.nomeCurso = nomeCurso;
        this.turno = turno;

    }
    
    public int getAnoIngresso() {
        return anoIngresso;
    }
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public void adicionarDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }
    public Disciplina getDisciplina(){
        return disciplina;
    }
    

    public Aprovacao getAprovacao() {
        return aprovacao;
    }

    public void setAprovacao(Aprovacao aprovacao) {
        this.aprovacao = aprovacao;
    }

    @Override
    public String toString() {
        return "Aluno [anoIngresso=" + anoIngresso + ", nomeCurso=" + nomeCurso + ", turno=" + turno + "]";
    }

    enum Aprovacao{
        APROVADO,
        REPROVADO,
        PENDENTE;
    }
}
