package br.edu.up.modelos;

public abstract class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private double vlrMaxCredito;
    private double vlrEmprestimo;
    private Endereco endereco;

    //O valor máximo de crédito para cliente pessoa é de R$ 10.000,00 e cliente empresa R$25.000,00. 

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
        double valorTeste = valor + vlrEmprestimo;

        if(valorTeste > vlrMaxCredito || vlrEmprestimo == vlrMaxCredito){
            System.out.println("Valor maior que o possível de se emprestar!");
        }else{
            vlrEmprestimo += valor;
        }
    }

    public double devolver(double valor){
        if(vlrEmprestimo < valor){
            valor -= vlrEmprestimo;
            vlrEmprestimo = 0;
        }else{
            vlrEmprestimo -= valor;
        }
        return valor;
    }
    
    public double getSaldo(){
        return vlrEmprestimo;
    }

    public String getDados(int i){
        return "Cliente "+ i +"\nNome = " + nome + "\nTelefone =    " + telefone + "\nemail =   " + email + "\nValor Maximo de Crédito =    "
                + vlrMaxCredito + "\nValor de Emprestimo =  " + vlrEmprestimo + "\nEndereco =   " + endereco+ "\n-->Saldo:" + getSaldo();
    }

    
}
