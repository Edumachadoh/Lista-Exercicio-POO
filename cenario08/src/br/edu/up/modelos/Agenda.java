package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    
    private List<Contato> listaContatos = new ArrayList<>();

    public Agenda() {

    }

    public void adicionar(Contato contato) {
        listaContatos.add(contato);
    }
  
    public Contato getContato(int codigoConsultar) {
        return listaContatos.get(codigoConsultar - 1); 
    }

    public void excluirContato(int codigo) {
        listaContatos.set(codigo - 1, null);
    }

    public String listarContatos() {
        String contatosString = "";
        for (Contato contato : listaContatos) {

            contatosString += contato + "\n";
            
        }

        return contatosString;
    }

    @Override
    public String toString() {
        return "Agenda [listaContatos=" + listaContatos + ", listarContatos()=" + listarContatos() + "]";
    }

    
    
}
