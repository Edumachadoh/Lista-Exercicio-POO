package br.edu.up.metodos;

public class Mes {
    private String nome;
    private int qtdDeDias;
    private Dia[] dias;
    
    public Mes(String nome, Ano ano){
        
        this.nome = nome;
        this.qtdDeDias = setQtdDeDias(ano);
        this.dias = new Dia[qtdDeDias];        
    }

    public int setQtdDeDias(Ano ano){
        int numMes = numeroMes();
        boolean bissexto = ano.isBissexto();

        if(numMes == 1 && bissexto == true){
            qtdDeDias = 29;
        }else if(numMes == 1 && bissexto == false){
            qtdDeDias = 28;
        } 
        else if(numMes == 0 || numMes == 2 || numMes == 4 || numMes == 6 || numMes == 7 || numMes == 9 || numMes == 11){
            qtdDeDias = 31;
        }
        else if(numMes == 3 || numMes == 5 || numMes == 8 || numMes == 10){
            qtdDeDias = 30;
        }

        return qtdDeDias;
    }

    public void adicionarCompromisso(Compromisso compromisso, int diaMes){
        dias[diaMes - 1] = new Dia(diaMes);
        this.dias[diaMes - 1].adicionarCompromisso(compromisso);
    }

    public void adicionarCompromisso(String pessoa, String local, String assunto, int hora, int diaMes){
        Compromisso compromisso = new Compromisso(pessoa, local, assunto, hora);
        dias[diaMes - 1].adicionarCompromisso(compromisso);
    }

    public void excluirCompromisso(int diaMes, int hora){
        dias[diaMes].excluirCompromisso(hora);
    }

    public String listarCompromissos(int diaMes){
        String compromissos = new String();

        for (Dia dia : dias) {
            if(dia != null){
                compromissos += nome + " " + dia.listarCompromissos() + "\n" ;  
            }

        }
        return compromissos;
    }

    public String listarCompromissos(){
        String listaCompromissos = new String();

        for (Dia dia : dias) {
            if(dia != null){
                listaCompromissos += this.nome + " " + dia.listarCompromissos();
            }
                
        }
        
        return listaCompromissos;
    }

    public int numeroMes(){
        int numMes = 0;
        
        switch (this.nome) {

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

        return numMes;
    }

    public int getQtdDeDias() {
        return qtdDeDias;
    }


    
}   
