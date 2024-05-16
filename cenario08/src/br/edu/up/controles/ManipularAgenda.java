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
        agenda.adicionar(pessoa);
        
    }
    
    public void incluirContatoComercial(int codigo, String nome, String telefone, String cnpj) {

        Contato pessoa = new Comercial(codigo, nome, telefone, cnpj);
        
    }

   public void excluirContato(int codigo, int codigoExcluir) {
        boolean teste = false; // Inicializando a variável teste como false
        for (int i = 0; i < codigo; i ++) {
            if (agenda.getContato(codigo).getCodigo() == codigoExcluir) {
                System.out.printf("contato excluido");
                teste = true;
            }
        }   
        
        if (teste == false) {
            System.out.printf("contato inexistente");
        }
}

    
    
}
