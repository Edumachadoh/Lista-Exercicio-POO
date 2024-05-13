package br.edu.up.modelos;

public class Cidade {
    private String nome;
    private String UF;

    public Cidade(String nome, String uF) {
        this.nome = nome;
        UF = uF;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getUF() {
        return UF;
    }
    public void setUF(String uF) {
        UF = uF;
    }
    
    @Override
    public String toString() {
        return "Cidade\nnome =  " + nome + "\nUF =  " + UF;
    }
    
    
}
