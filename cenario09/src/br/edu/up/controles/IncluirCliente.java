package br.edu.up.controles;

import java.util.List;

import br.edu.up.modelos.Cliente;
import br.edu.up.modelos.ClienteEmpresa;
import br.edu.up.modelos.ClientePessoa;
import br.edu.up.modelos.Endereco;

public class IncluirCliente {
    public static void pessoa(List<Cliente> lCPessoas, String nomeCliente, String telefone, String email, Endereco endereco, String CPF, double peso, double altura){
        Cliente cliente = new ClientePessoa(nomeCliente, telefone, email, altura, altura, endereco, CPF, peso, altura, 10000);

        lCPessoas.add(cliente);
    }

    public static void empresa(List<Cliente> lCEmpresas, String nomeCliente, String telefone, String email, Endereco endereco, String cnpj, String inscEstadual, int anoFundacao){
        Cliente cliente = new ClienteEmpresa(nomeCliente, telefone, email, anoFundacao, anoFundacao, endereco, cnpj, inscEstadual, anoFundacao, 25000);

        lCEmpresas.add(cliente);
    }
}
