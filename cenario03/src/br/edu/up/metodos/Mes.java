package br.edu.up.metodos;

public class Mes {
    private String nome;
    private int qtdDeDias;
    private Dia[] dias = new Dia[qtdDeDias];
    
    public Mes(int qtdDeDias, String nome){
        this.qtdDeDias = qtdDeDias;
        this.nome = nome;        
    }

    public void adicionarCompromisso(Compromisso compromisso, int diaMes){

        System.out.println("------------------> " + dias.length);
        System.out.println("------------------> " + (diaMes - 1));

        dias[diaMes - 1].adicionarCompromisso(compromisso);
    }

    public void adicionarCompromisso(String pessoa, String local, String assunto, int hora, int diaMes){
        Compromisso compromisso = new Compromisso(pessoa, local, assunto, hora);
        dias[diaMes].adicionarCompromisso(compromisso);
    }

    public void excluirCompromisso(int diaMes, int hora){
        dias[diaMes].excluirCompromisso(hora);
    }

    public String listarCompromissos(int diaMes){
        String compromissos = new String();

        for (Dia dia : dias) {
            compromissos += dia.listarCompromissos() + "\n" ;   
        }
        return compromissos;
    }

    public String listarCompromissos(){
        String listaCompromissos = new String();

        for (Dia dia : dias) {
            listaCompromissos += nome + dia.listarCompromissos();    
        }
        
        return listaCompromissos;
    }

}   
