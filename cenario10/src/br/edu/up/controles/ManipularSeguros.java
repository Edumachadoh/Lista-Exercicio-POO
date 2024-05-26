package br.edu.up.controles;

import java.util.Arrays;

import br.edu.up.modelos.Seguro;
import br.edu.up.modelos.SeguroVeiculo;
import br.edu.up.modelos.SeguroVida;

public class ManipularSeguros {
    private Seguro[] seguro;

    
    public ManipularSeguros() {
        this.seguro = new Seguro[10];
       
    }


    public void adicionarSeguroVida(SeguroVida seguroVida, int contSeguros) {
        seguro[contSeguros] = seguroVida;
    }
    
    public void adicionarSeguroVeiculo(SeguroVeiculo seguroVeiculo, int contSeguros) {
        seguro[contSeguros] = seguroVeiculo;
    }

    public int localizarSeguro(String cpf, int contSeguros) {
        int flag = 0;
        for (int i = 0; i < contSeguros; i ++) {
            if (cpf.equals(seguro[i].getSegurado().getCPF())) {
                flag = 1;
            }
        }

        
        return flag;
    }

    public void excluirTodos(int contSeguros) {
        for ( int i = 0; i < contSeguros; i ++) {
            seguro[i] = null;
        }
    }




    public String toString(int contSeguros) {
        String retorno = "";
        for (int i = 0; i < contSeguros; i ++) {
            retorno += "ManipularSeguros [Nome=" + seguro[i].getSegurado().getNome() + "]\n";
        }
        return retorno;
    }
    
}
