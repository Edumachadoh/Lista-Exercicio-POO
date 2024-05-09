package br.edu.up.metodos;

import br.edu.up.controles.DefinirNumMes;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Mes[] meses = new Mes[12];


    public Ano(int ano, boolean bissexto){
        this.ano = ano;
        this.bissexto = bissexto;
    }


    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }

    public void adicionarMes(Mes mes, int numMes){
        meses[numMes] = mes;
    }

    public void excluirCompromisso(String nomeMes, int diaMes, int hora){
        meses[DefinirNumMes.executar(nomeMes)].excluirCompromisso(diaMes, hora);
    }
    
    public String listarCompromissos(int diaMes){
        return meses[diaMes].listarCompromissos();
    }

    public String listarCompromissos(){
        String listaCompromissos = new String();

        for (Mes mes : meses) {
            listaCompromissos += this.ano + mes.listarCompromissos();
        }

        return listaCompromissos;
    }

    public boolean isBissexto() {
        return bissexto;
    }

    public void setBissexto(boolean bissexto) {
        this.bissexto = bissexto;
    }
    
    
}
