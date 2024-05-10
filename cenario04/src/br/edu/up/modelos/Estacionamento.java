package br.edu.up.modelos;

public class Estacionamento {
    private int vagas;
    private int saidas;
    private int entradas;
    private int carroRetirado;
    private boolean checarCarroRetirado;
    private boolean checarAdicionarPlaca;
    

    
    public int getVagas() {
        return vagas;
    }
    public void setVagas(int vagas) {
        this.vagas = vagas;
    }
    public int getSaidas() {
        return saidas;
    }
    public void setSaidas(int saidas) {
        this.saidas = saidas;
    }
    public int getEntradas() {
        return entradas;
    }
    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }
    public int getCarroRetirado() {
        return carroRetirado;
    }
    public void setCarroRetirado(int carroRetirado) {
        this.carroRetirado = carroRetirado;
    }
    public boolean getChecarCarroRetirado() {
        return checarCarroRetirado;
    }
    public void setChecarCarroRetirado(boolean checarCarroRetirado) {
        this.checarCarroRetirado = checarCarroRetirado;
    }
    public boolean getChecarAdicionarPlaca() {
        return checarAdicionarPlaca;
    }
    public void setChecarAdicionarPlaca(boolean checarAdicionarPlaca) {
        this.checarAdicionarPlaca = checarAdicionarPlaca;
    }
   
    
    

}
