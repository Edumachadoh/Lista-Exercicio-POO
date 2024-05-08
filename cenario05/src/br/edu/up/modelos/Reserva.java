package br.edu.up.modelos;

public class Reserva {  
    private String nomeResponsavel;
    private int qtdPessoas;
    private double valorTotal;
    private String data;
    private Evento evento;

    
    public Reserva(String nomeResponsavel, int qtdPessoas, double valorTotal, String data, Evento evento) {
        this.nomeResponsavel = nomeResponsavel;
        this.qtdPessoas = qtdPessoas;
        this.valorTotal = valorTotal;
        this.data = data;
        this.evento = evento;
    }
    
    public String getNomeResponsavel() {
        return nomeResponsavel;
    }
    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }
    public int getQtdPessoas() {
        return qtdPessoas;
    }
    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "[Nome do Responsável=" + nomeResponsavel + ", Quantidade de Pessoas=" + qtdPessoas + ", Valor Total="
                + valorTotal + ", Data=" + data + "Evento:" + evento.toString() + "]";
    }

    

}
