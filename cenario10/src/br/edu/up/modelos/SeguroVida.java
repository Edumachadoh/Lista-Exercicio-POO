package br.edu.up.modelos;

public class SeguroVida extends Seguro{
    private boolean cobreDoenca;
    private boolean cobreAcidente;

    public boolean isCobreDoenca() {
        return cobreDoenca;
    }

    public void setCobreDoenca(boolean cobreDoenca) {
        this.cobreDoenca = cobreDoenca;
    }

    public boolean isCobreAcidente() {
        return cobreAcidente;
    }
    
    public void setCobreAcidente(boolean cobreAcidente) {
        this.cobreAcidente = cobreAcidente;
    }

    public String getDados(){
        return "SeguroVida [cobreDoenca=" + cobreDoenca + ", cobreAcidente=" + cobreAcidente + "]" + super.getDados();
    }

}
