package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    
    private List<Contato> listaContatos = new ArrayList<>();

    // Pessoal pessoal = new Pessoal();
    // Comercial comercial = new Comercial();
    

    public Agenda() {

    }

    public void adicionar(Contato contato) {
        listaContatos.add(contato);
    }
  
    public Contato getContato(int codigo) {
        return listaContatos.get(codigo); 
    }

    public void excluirContato(int codigo) {
        listaContatos.remove(codigo);
    }

    public Contato listarContatos() {
        return listaContatos.get(0);
    }

    
}
