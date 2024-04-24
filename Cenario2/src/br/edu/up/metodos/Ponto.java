package br.edu.up.metodos;

public class Ponto {
    private double x;
    private double y;
    
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Ponto() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistancia(double x1, double y1) {
        return Math.sqrt(Math.pow(x1 - this.x, 2) + Math.pow(y1 - this.y, 2));
    }

    public double calcularDistancia(Ponto p) {
        return p.calcularDistancia(this.x, this.y);
    }

    

    




}
