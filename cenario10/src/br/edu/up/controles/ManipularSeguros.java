package br.edu.up.controles;

import java.util.Arrays;

import br.edu.up.modelos.Seguro;
import br.edu.up.modelos.SeguroVeiculo;
import br.edu.up.modelos.SeguroVida;

public class ManipularSeguros {
    private Seguro[] seguro;

    
    public ManipularSeguros() {
        this.seguro = new Seguro[30];
       
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

    public int verifApolice(String apolice, int contSeguros) {
        int flag = 0;
        for (int i = 0; i < contSeguros; i ++) {
            if (apolice.equals(seguro[i].getApolice())) {
                flag = 1;
            }
        }
        return flag;
    }

    public int excluirSeguro(int contSeguros, String cpf) {
        for (int i = 0; i < contSeguros; i++) {
            if (seguro[i] != null && cpf.equals(seguro[i].getSegurado().getCPF())) {
                seguro[i] = null;
                return 0; 
            }
        }
        return 1; 
    }

    public void excluirTodos(int contSeguros) {
        for ( int i = 0; i < contSeguros; i ++) {
            seguro[i] = null;
        }
    }




    public String toString(int contSeguros) {
        String retorno = "";
        for (int i = 0; i < contSeguros; i ++) {
            if (seguro[i] != null) {
                retorno += "ManipularSeguros [Nome= " + seguro[i].getSegurado().getNome() + " RG= " + seguro[i].getSegurado().getRG() + 
                " Cpf= " + seguro[i].getSegurado().getCPF() + 
                " Sexo= " + seguro[i].getSegurado().getSexo() + 
                " Telefone= " + seguro[i].getSegurado().getTelefone() + 
                " Endereco= " + seguro[i].getSegurado().getEndereco() + 
                " Cep= " + seguro[i].getSegurado().getNome() + 
                "Cidade=" + seguro[i].getSegurado().getNome() + "\n";
            }
       }
        return retorno;
    }
    
}
