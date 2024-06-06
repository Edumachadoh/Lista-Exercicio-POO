package br.edu.up.modelos;

public class Aluno extends Pessoa{
    private int anoIngresso;
    private String nomeCurso;
    private String turno;
    private Disciplina disciplina;
    private Competencia[] competencias;

    public Aluno(){

    }
    public Aluno(int anoIngresso, String nomeCurso, String turno, String nome, int rg, int matricula) {
        
        super(nome, rg, matricula);
        this.anoIngresso = anoIngresso;
        this.nomeCurso = nomeCurso;
        this.turno = turno;

        competencias = new Competencia[0];

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
    public void setDisciplina(Disciplina disciplina){

        this.disciplina = disciplina;

        // Disciplina[] vet1 = new Disciplina[this.disciplina.length];

        // vet1 = disciplina;

        // disciplina = new Disciplina[vet1.length + 1];
        
        // for (int i = 0; i < vet1.length; i++) {
        //     disciplinas[i] = vet1[i];
        // }

        // disciplinas[vet1.length] = disciplina;
    }
    public Disciplina getDisciplina(){
        
        return disciplina;

        // Disciplina disciplina = null;

        // for (Disciplina disciplinaT : disciplinas) {
        //     if(disciplinaT.getNome().toLowerCase() == nome.toLowerCase()){
        //         disciplina = disciplinaT;
        //     }
        // }
    }

        public void adicionarCompetencia(Competencia competencia){

        Competencia[] vet1 = new Competencia[this.competencias.length];

        vet1 = competencias;

        competencias = new Competencia[vet1.length + 1];
        
        for (int i = 0; i < vet1.length; i++) {
            competencias[i] = vet1[i];
        }

        competencias[vet1.length] = competencia;
    }

    public String verificarAprovacao() {
        String aprovacao = new String();
        int qtdCompDisc = 0, qtdCompAluno = 0,qtdNescDisc = 0, qtdNescAluno = 0;

        Competencia[] compsDisciplina = disciplina.getCompetencias();

        if(compsDisciplina.length > this.competencias.length){

        //se compDisciplina.length > compAluno (aprovacao == PENDENTE)
            aprovacao = "PENDENTE";
        
        }else{
            
        }

        //definir qtd de NECESSARIAS e COMPLEMENTARES da DISCIPLINA

        for (Competencia comp : compsDisciplina) {
            if(comp.getTipo() == Competencia.Tipo.COMPLEMENTAR){
                qtdCompDisc++;
            }else{
                qtdNescDisc++;
            }
        }
    
        //definir qtd de NECESSARIAS e COMPLEMENTARES do ALUNO
        
        for (Competencia comp : this.competencias) {
            if(comp.getTipo() == Competencia.Tipo.COMPLEMENTAR){
                qtdCompDisc++;
            }else{
                qtdNescDisc++;
            }
        }

        // Aprovado: 100% das competências Necessárias, pelo menos 50% das competências
        // complementares;
        if(qtdNescAluno/qtdNescDisc >= 1 && qtdCompAluno/qtdCompDisc >= 0.5){
            aprovacao = "APROVADO";
        }
        // Reprovado: menos de 50% das competências Necessárias ou menos de 50% das
        // competências complementares;
        else{
            aprovacao = "REPROVADO";
        }
        

        return aprovacao;
    }

    @Override
    public String toString() {
        return "Aluno [anoIngresso=" + anoIngresso + ", nomeCurso=" + nomeCurso + ", turno=" + turno + super.toString() + "]";
    }
}
