package br.edu.up.metodos;

public class Dia {
    private int diaMes;
    private Compromisso[] compromissos;

    public Dia(int diaMes){
        this.diaMes = diaMes;
    }

    public void adicionarCompromisso(Compromisso[] compromissos){
        this.compromissos = compromissos;
    }

    public Compromisso consultarCompromisso(int hora){  
        return compromissos[hora];
    }

    public void excluirCompromisso(int hora){
        compromissos[hora] = null;
    }

    public String listarCompromissos(){
        String compromissosListados = new String();

        return compromissosListados;
    }
}
