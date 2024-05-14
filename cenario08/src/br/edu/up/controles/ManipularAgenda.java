package br.edu.up.controles;

import br.edu.up.modelos.Agenda;
import br.edu.up.modelos.Contato;
import br.edu.up.modelos.Pessoal;
import br.edu.up.modelos.Comercial;

public class ManipularAgenda {
    private Agenda agenda;




    public ManipularAgenda() {
        this.agenda = new Agenda();
    }


    public void incluirContatoPessoal(int codigo, String nome, String telefone, String aniversario) {
        
        Contato pessoa = new Pessoal(codigo, nome, telefone, aniversario);
        imprimirCodigo(codigo);
    }
    
    public void incluirContatoComercial(int codigo, String nome, String telefone, String cnpj) {

        Contato pessoa = new Comercial(codigo, nome, telefone, cnpj);
        imprimirCodigo(codigo);
    }

    public String imprimirCodigo(int codigo) {
        return "Codigo: " + codigo;
    }







}
