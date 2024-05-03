package br.edu.up.metodos;

public class Dia {

    private int diaMes;
    private Compromisso[] compromissos;

    public Dia(int diaMes){
        this.diaMes = diaMes;
    }

    public void adicionarCompromisso(Compromisso[] compromissos){
        compromissos = new Compromisso[diaMes];
    }

    public Compromisso consultarCompromisso(int hora){  
        return compromissos[hora];
    }

    public void excluirCompromisso(int hora){
        compromissos[hora] = null;
    }
    
    // o uq fazer??
    public String listarCompromissos(){
        String lista = new String();
        
        for (Compromisso compromisso : compromissos) {
            lista += compromisso.toString() + "\n";
        }

        return lista;
    }
}
