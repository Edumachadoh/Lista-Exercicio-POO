package br.edu.up.modelos;

public class Competencia {
    private Tipo tipo;

    public enum Tipo{
        NECESSARIA,
        COMPLEMENTAR;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    

}
