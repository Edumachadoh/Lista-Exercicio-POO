package br.edu.up.modelos;

public class ClientePessoa extends Cliente{
    private String CPF;
    private double peso;
    private double altura;



    public ClientePessoa(String cPF, double peso, double altura, double creditoMAX) {
        CPF = cPF;
        this.peso = peso;
        this.altura = altura;
        super.setVlrMaxCredito(creditoMAX);
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
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
    public String getDados() {
        return "\n----------\n" + toString() + super.getDados() + "\"----------";
    }

    @Override
    public String toString() {
        return "ClientePessoa [CPF=" + CPF + ", peso=" + peso + ", altura=" + altura + "]";
    }
    
    

}
