package br.edu.up.metodos;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Mes[] meses;

    public Ano(int ano, boolean bissexto){
        this.ano = ano;
        this.bissexto = bissexto;
    }

    public void adicionarMes(Mes mes){

    }

    public void excluirCompromisso(String nomeMes, int diaMes, int hora){

    }
    
    public String listarCompromissos(int diaMes){
        return meses[diaMes].listarCompromissos();
    }

    public String listarCompromissos(){
        //ver com prof
    }

}
