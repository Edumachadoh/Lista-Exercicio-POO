package br.edu.up.modelos;

public abstract class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private double vlrMaxCredito;
    private double vlrEmprestimo;
    private Endereco endereco;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getVlrMaxCredito() {
        return vlrMaxCredito;
    }
    public void setVlrMaxCredito(double vlrMaxCredito) {
        this.vlrMaxCredito = vlrMaxCredito;
    }
    public double getVlrEmprestimo() {
        return vlrEmprestimo;
    }
    public void setVlrEmprestimo(double vlrEmprestimo) {
        this.vlrEmprestimo = vlrEmprestimo;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void emprestar(double valor){

    }

    public double devolver(double valor){

    }
    
    public double getSaldo(){

    }

    
}
