package br.edu.up.metodos;

public class Dia {

    private int diaMes;
    private Compromisso[] compromissos = new Compromisso[24];

    public Dia(int diaMes){
        this.diaMes = diaMes;
    }

    public void adicionarCompromisso(Compromisso compromisso){
            int hora = compromisso.getHora();
            compromissos[hora - 1] = compromisso;
        
    }

    public Compromisso consultarCompromisso(int hora){  
        return compromissos[hora];
    }

    public void excluirCompromisso(int hora){
        compromissos[hora] = null;
    }
    
    // o q fazer??
    public String listarCompromissos(){
        String lista = new String();
        
        for (Compromisso compromisso : compromissos) {
            if(compromisso != null){
                lista += this.diaMes + " " + compromisso;
            }
        }

        return lista;
    }

    public int getDiaMes() {
        return diaMes;
    }

    public void setDiaMes(int diaMes) {
        this.diaMes = diaMes;
    }
}
