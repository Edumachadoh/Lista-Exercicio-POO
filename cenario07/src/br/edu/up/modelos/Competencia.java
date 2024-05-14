package br.edu.up.modelos;

public class Competencia {
    private Tipo tipo;
    private Situacao situacao;

    enum Tipo{
        NESCESSARIA,
        COMPLEMENTAR;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    enum Situacao{
        ATINGIDA,
        NAO_ATINGIDA;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situação) {
        this.situacao = situação;
    }

    
    
    
}
