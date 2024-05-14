package br.edu.up.modelos;

public class SeguroVeiculo extends Seguro{
    private double vlrFranquia;
    private boolean temCarroReserva;
    private boolean cobreVidros;

    public double getVlrFranquia() {
        return vlrFranquia;
    }

    public void setVlrFranquia(double vlrFranquia) {
        this.vlrFranquia = vlrFranquia;
    }

    public boolean isTemCarroReserva() {
        return temCarroReserva;
    }

    public void setTemCarroReserva(boolean temCarroReserva) {
        this.temCarroReserva = temCarroReserva;
    }

    public boolean isCobreVidros() {
        return cobreVidros;
    }

    public void setCobreVidros(boolean cobreVidros) {
        this.cobreVidros = cobreVidros;
    }


    public String getDados(){
        return "SeguroVeiculo [vlrFranquia=" + vlrFranquia + ", temCarroReserva=" + temCarroReserva + ", cobreVidros="
        + cobreVidros + "]" + super.getDados();
    }

    
}
