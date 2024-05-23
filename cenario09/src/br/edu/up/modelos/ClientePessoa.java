package br.edu.up.modelos;

public class ClientePessoa extends Cliente{
    private String cpf;
    private double peso;
    private double altura;




    public ClientePessoa(){

    }
    public ClientePessoa(String nome, String telefone, String email, double vlrMaxCredito, double vlrEmprestimo,
            Endereco endereco, String cpf, double peso, double altura, double creditoMAX) {
        super(nome, telefone, email, vlrMaxCredito, vlrEmprestimo, endereco);
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
        super.setVlrMaxCredito(creditoMAX);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getSaldo(){
        return super.getSaldo();
    }
    public String getDados(int i) {
        return "\n------------------------\nCliente Pessoa " + toString() + super.getDados(i) + "\n------------------------";
    }

    @Override
    public String toString() {
        return "\nCPF = " + cpf + "\npeso = " + peso + "\naltura =  " + altura;
    }


    
    

}
