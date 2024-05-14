package br.edu.up.modelos;

public class Tripulante extends Pessoa{
    private int idAeronautica;
    private int idMatricula;
    
    
    
    public Tripulante(String nome, int rg, int matricula) {
        super(nome, rg, matricula);
    }

    public int getIdAeronautica() {
        return idAeronautica;
    }
    public void setIdAeronautica(int idAeronautica) {
        this.idAeronautica = idAeronautica;
    }
    public int getIdMatricula() {
        return idMatricula;
    }
    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    
}
