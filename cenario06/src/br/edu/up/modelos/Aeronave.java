package br.edu.up.modelos;

public class Aeronave {
    private Pessoa[] pessoas;
    private int idCodigo;
    private String tipo;
    private int qtdAssentos;
   
   
   
   
    public int getIdCodigo() {
        return idCodigo;
    }
    public void setIdCodigo(int idCodigo) {
        this.idCodigo = idCodigo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getQtdAssentos() {
        return qtdAssentos;
    }
    public void setQtdAssentos(int qtdAssentos) {
        this.qtdAssentos = qtdAssentos;
    }
    public Pessoa[] getPessoas() {
        return pessoas;
    }
    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }




}
