package br.edu.up.metodos;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Mes[] meses = new Mes[12];


    public Ano(int ano){
        this.ano = ano;
        this.bissexto = setBissexto(ano);
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
        int numMes = 0;

        switch (nomeMes) {

            case "Janeiro": numMes = 0; break;
            case "Fevereiro": numMes = 1; break;
            case "Março": numMes = 2; break;
            case "Abril": numMes = 3; break;
            case "Maio": numMes = 4; break;
            case "Junho": numMes = 5; break;
            case "Julho": numMes = 6; break;
            case "Agosto": numMes = 7; break;
            case "Setembro": numMes = 8; break;
            case "Outubro": numMes = 9; break;
            case "Novembro": numMes = 10; break;
            case "Dezembro": numMes = 11; break;
        }

        meses[numMes].excluirCompromisso(diaMes, hora);
    }

    public boolean setBissexto(int ano){
        boolean bissexto = false;
        
        if(ano % 4 == 0 || ano % 400 == 0){
            bissexto = true;
        }else{
            bissexto = false;
        }
        return bissexto;
    }

    public String listarCompromissos(int diaMes){
        return meses[diaMes].listarCompromissos();
    }
    
    public String listarCompromissos(){
        String listaCompromissos = new String();

        for (Mes mes : meses) {
            if(mes != null){
                listaCompromissos += this.ano + " " + mes.listarCompromissos();
            }
        }

        return listaCompromissos;
    }

    public boolean isBissexto() {
        return bissexto;
    }

    public Mes getMes(int num){
        return meses[num];
    }
    
}
