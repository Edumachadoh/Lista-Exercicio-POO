package br.edu.up.controles;

import java.util.Arrays;

import br.edu.up.modelos.Seguro;
import br.edu.up.modelos.SeguroVida;

public class ManipularSeguros {
    private Seguro[] seguro;

    
    public ManipularSeguros() {
        this.seguro = new Seguro[10];
    }


    public void adicionarSeguroVida(SeguroVida seguroVida, int contSeguros) {
        seguro[contSeguros] = seguroVida;
    }
    public void adicionarSeguroVeiculo(Seguro seguroVeiculo, int contSeguros) {
        seguro[contSeguros] = seguroVeiculo;
    }


    @Override
    public String toString() {
        String texto = "";
        for (Seguro seguro : seguro) {
            texto += seguro.getApolice();
        }
        
        return texto;
    }


    
}
