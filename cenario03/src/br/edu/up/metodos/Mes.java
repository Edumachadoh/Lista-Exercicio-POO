package br.edu.up.metodos;

public class Mes {
    private String nome;
    private int qtdDeDias;
    private Dia[] dias;
    
    public Mes(int qtdDeDias, String nome){
        this.qtdDeDias = qtdDeDias;
        this.nome = nome;        
    }

    public void adicionarCompromisso(Compromisso compromissos, int diaMes){

    }

    public void adicionarCompromisso(String pessoa, String local, String assunto, int hora){
        
    }

    public void excluirCompromisso(int diaMes, int hora){

    }

    public String listarCompromissos(int diaMes){
        String compromissos = new String();

        for (Dia dia : dias) {
            compromissos += dia.listarCompromissos() + "\n" ;   
        }
        return compromissos;
    }

    public String listarCompromissos(){
        for (Dia dia : dias) {
            
        }
    }

}   
