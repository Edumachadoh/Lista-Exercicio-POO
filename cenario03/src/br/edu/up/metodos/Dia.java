package br.edu.up.metodos;

public class Dia {

    @SuppressWarnings("unused")

    private int diaMes;
    private Compromisso[] compromissos;

    public Dia(int diaMes){
        this.diaMes = diaMes;
    }

    public void adicionarCompromisso(Compromisso[] compromissos){
    
    }

    public Compromisso consultarCompromisso(int hora){  
        return compromissos[hora];
    }

    public void excluirCompromisso(int hora){
        compromissos[hora] = null;
    }


    // o uq fazer??
    public String listarCompromissos(){
        return compromissos.toString();
    }
}
