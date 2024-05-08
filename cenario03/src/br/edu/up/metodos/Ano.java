package br.edu.up.metodos;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Mes[] meses = new Mes[12];

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
        String compromissos = new String();

        for (Mes mes : meses) {
            compromissos += mes.listarCompromissos() + "\n";
        }

        return compromissos;
    }

}
