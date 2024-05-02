package br.edu.up.modelos;

public class Evento {
    private String nome;
    private int data;
    private String local;
    private int qtdIngressosVendidos;
    private double precoIngresso;
    private int lotacaoMax;
    
    
    public Evento(String nome, int data, String local, int qtdIngressosVendidos, double precoIngresso, int lotacaoMax) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.qtdIngressosVendidos = qtdIngressosVendidos;
        this.precoIngresso = precoIngresso;
        this.lotacaoMax = lotacaoMax;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public int getLotacaoMax() {
        return lotacaoMax;
    }
    public void setLotacaoMax(int lotacaoMax) {
        this.lotacaoMax = lotacaoMax;
    }
    public int getQtdIngressos() {
        return qtdIngressosVendidos;
    }
    public void setQtdIngressos(int qtdIngressos) {
        this.qtdIngressosVendidos = qtdIngressos;
    }
    public double getPrecoIngresso() {
        return precoIngresso;
    }
    public void setPrecoIngresso(int precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    @Override
    public String toString() {
        return "Evento [Nome=" + nome + ", Data=" + data + ", Local=" + local + ", Quantidade de Ingressos Vendidos="
                + qtdIngressosVendidos + ", Preço do Ingresso=" + precoIngresso + ", Lotação Max=" + lotacaoMax + "]";
    }
    
}
