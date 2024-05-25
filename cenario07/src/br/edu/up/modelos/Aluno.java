package br.edu.up.modelos;

public class Aluno extends Pessoa{
    private int anoIngresso;
    private String nomeCurso;
    private String turno;
    private Disciplina[] disciplinas;

    private Aprovacao aprovacao;
    //private Situacao[] situacao;
    //private Competencia[] competencias;

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

        Disciplina[] vet1 = new Disciplina[this.disciplinas.length];

        vet1 = disciplinas;

        disciplinas = new Disciplina[vet1.length + 1];
        
        for (int i = 0; i < vet1.length; i++) {
            disciplinas[i] = vet1[i];
        }

        disciplinas[vet1.length] = disciplina;
    }
    public Disciplina getDisciplina(String nome){
        
        Disciplina disciplina = null;

        for (Disciplina disciplinaT : disciplinas) {
            if(disciplinaT.getNome().toLowerCase() == nome.toLowerCase()){
                disciplina = disciplinaT;
            }
        }
        
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
