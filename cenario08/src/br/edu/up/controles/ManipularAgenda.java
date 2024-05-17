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

        Contato comercial = new Comercial(codigo, nome, telefone, cnpj);
        agenda.adicionar(comercial);
        
    }

   public int excluirContato(int codigo, int codigoExcluir) {
        int retorno;
        if (codigoExcluir > codigo) {
            retorno = 1;
            return retorno;
        } else {
            agenda.excluirContato(codigoExcluir);

            retorno = 2;
            return retorno;
        }
    
    
}

    public Contato consultarContato(int codigo, int codigoConsultar) {
        if (codigoConsultar > codigo) {
            return null;
        } else {
         return agenda.getContato(codigoConsultar);
        }
    }
    
    public String listarContatos() {
        return agenda.listarContatos();
    }

}
