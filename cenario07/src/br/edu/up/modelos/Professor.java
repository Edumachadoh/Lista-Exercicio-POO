package br.edu.up.modelos;

public class Professor extends Pessoa{
    private int idCurriculo;
    private Titulacao titulacao;

    public Professor(int idCurriculo, Titulacao titulacao) {
        this.idCurriculo = idCurriculo;
        this.titulacao = titulacao;
    }
    public int getIdCurriculo() {
        return idCurriculo;
    }
    public void setIdCurriculo(int idCurriculo) {
        this.idCurriculo = idCurriculo;
    }
    public Titulacao getTitulacao() {
        return titulacao;
    }
    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }
    @Override
    public String toString() {
        return "Professor [idCurriculo=" + idCurriculo + ", titulacao=" + titulacao + "]";
    }
    
    public String listarTitulacao(){
        return titulacao.toString();
    }

    
}
