package br.edu.up.modelos;

public class Reserva {
    private String nomeResponsavel;
    private int QtdPessoas;
    private double valorTotal;
    private String data;

    
    public Reserva(String nomeResponsavel, int qtdPessoas, double valorTotal, String data) {
        this.nomeResponsavel = nomeResponsavel;
        QtdPessoas = qtdPessoas;
        this.valorTotal = valorTotal;
        this.data = data;
    }
    
    public String getNomeResponsavel() {
        return nomeResponsavel;
    }
    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }
    public int getQtdPessoas() {
        return QtdPessoas;
    }
    public void setQtdPessoas(int qtdPessoas) {
        QtdPessoas = qtdPessoas;
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
        return "Reserva [Nome do Responsável=" + nomeResponsavel + ", Quantidade de Pessoas=" + QtdPessoas + ", Valor Total="
                + valorTotal + ", Data=" + data + "]";
    }

    

}
