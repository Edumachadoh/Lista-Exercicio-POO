package br.edu.up.modelos;

public class ClienteEmpresa extends Cliente{
    private String cnpj;
    private String inscEstadual;
    private int anoFundacao;

    public ClienteEmpresa(){
        super();
    }
    public ClienteEmpresa(String nome, String telefone, String email, double vlrMaxCredito, double vlrEmprestimo,
            Endereco endereco, String cnpj, String inscEstadual, int anoFundacao, double creditoMAX) {
        super(nome, telefone, email, vlrMaxCredito, vlrEmprestimo, endereco);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.anoFundacao = anoFundacao;
        super.setVlrMaxCredito(creditoMAX);
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getInscEstadual() {
        return inscEstadual;
    }
    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }
    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
    public double getSaldo(){
        return super.getSaldo();
    }
    public String getDados(int i) {
        return "\n----------\n" + toString() + super.getDados(i) + "\"----------";
    }
    @Override
    public String toString() {
        return "ClienteEmpresa \ncnpj = " + cnpj + "\nInscrição Estadual =  " + inscEstadual + "\nAno de Fundação da Empresa =  " + anoFundacao;
    }
    

    
}
