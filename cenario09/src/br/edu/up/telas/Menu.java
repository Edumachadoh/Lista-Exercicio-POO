package br.edu.up.telas;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.Programa;
import br.edu.up.controles.Emprestar;
import br.edu.up.controles.IncluirCliente;
import br.edu.up.modelos.Cidade;
import br.edu.up.modelos.Cliente;
import br.edu.up.modelos.ClienteEmpresa;
import br.edu.up.modelos.ClientePessoa;
import br.edu.up.modelos.Endereco;
import br.edu.up.util.Prompt;

public class Menu {
    public static void iniciar(){
        List<Cliente> lCPessoas = new ArrayList<>();
        List<Cliente> lCEmpresas = new ArrayList<>();

        executar(lCPessoas,lCEmpresas);
    }

    public static void executar(List<Cliente> lCPessoas, List<Cliente> lCEmpresas){
        System.out.println( "1. Incluir cliente pessoa\r\n" + //
                            "2. Incluir cliente empresa\r\n" + //
                            "3. Mostrar dados cliente pessoa\r\n" + //
                            "4. Mostrar dados cliente empresa\r\n" + //
                            "5. Emprestar para cliente pessoa\r\n" + //
                            "6. Emprestar para cliente empresa\r\n" + //
                            "7. Devolução de cliente pessoa\r\n" + //
                            "8. Devolução de cliente empresa\r\n" + //
                            "9. Sair ");

        int escolha = Prompt.lerInteiro();
        escolherAcao(escolha, lCPessoas, lCEmpresas);
    }

    public static void escolherAcao(int escolha, List<Cliente> lCPessoas, List<Cliente> lCEmpresas){
        switch (escolha) {
            case 1:incluirPessoa(lCPessoas);break;    
            case 2:incluirEmpresa(lCPessoas);break;    
            case 3:for (Cliente cliente : lCPessoas){
                        ClientePessoa clientePessoa = (ClientePessoa) cliente;
                            clientePessoa.getDados();
                    }
            break;
            case 4:for (Cliente cliente : lCEmpresas) {
                        ClienteEmpresa clienteEmpresa = (ClienteEmpresa) cliente;
                            clienteEmpresa.getDados();
                    }
            break;
            case 5:emprestarPessoa(lCPessoas);break;
            case 6:emprestarEmpresa(lCEmpresas);break;
            case 7:devolverEmpresa(lCPessoas);break;
            case 8:devolverEmpresa(lCEmpresas);break;
            case 9: Programa.parar();break;
            default:System.out.println("Escolha inválida\ndigite novamente...");break;
        }
        executar(lCPessoas, lCEmpresas);
    }
    
    public static Endereco registrarEndereco(){
        Prompt.separador();
        Prompt.imprimir("---Registro Endereço---");
        
        String rua = Prompt.lerLinha("Nome da Rua");
        String numero = Prompt.lerLinha("Número da Residência:");
        String bairro = Prompt.lerLinha("Nome do Bairro:");
        String cep = Prompt.lerLinha("Seu CEP:");

        Cidade cidade = registrarCidade();

        Endereco endereco = new Endereco(rua, numero, bairro, cep, cidade);
        
        return endereco;
    }

    public static Cidade registrarCidade(){
        Prompt.separador();
        Prompt.imprimir("---Registro Cidade---");
        
        String nomeCidade = Prompt.lerLinha("Nome da Cidade:");
        String UF = Prompt.lerLinha("Sigla da Unidade Federal:");

        Cidade cidade = new Cidade(nomeCidade, UF);

        return cidade;
    }
    
    public static void incluirPessoa(List<Cliente> lCPessoas){
        
        String nomeCliente = Prompt.lerLinha("Nome do Cliente:");
        String telefone = Prompt.lerLinha("Número de Telefone:");
        String email = Prompt.lerLinha("Email:");
        Endereco endereco = registrarEndereco();
        String CPF = Prompt.lerLinha("CPF:");
        double peso = Prompt.lerDecimal("Peso:");
        double altura = Prompt.lerDecimal("Altura:");

        IncluirCliente.pessoa(lCPessoas, nomeCliente, telefone, email, endereco, CPF, peso, altura);
    }

    public static void incluirEmpresa(List<Cliente> lCPessoas){
        
        String nomeCliente = Prompt.lerLinha("Nome do Cliente:");
        String telefone = Prompt.lerLinha("Número de Telefone:");
        String email = Prompt.lerLinha("Email:");
        Endereco endereco = registrarEndereco();
        String cnpj = Prompt.lerLinha("CNPJ:");
        String inscEstadual = Prompt.lerLinha("Inscrição Estadual:");
        int anoFundacao = Prompt.lerInteiro("Ano de Fundação:");

        IncluirCliente.empresa(lCPessoas, nomeCliente, telefone, email, endereco, cnpj, inscEstadual, anoFundacao);
    }

    public static void emprestarPessoa(List<Cliente> lClientes){
        String CPF = Prompt.lerLinha("CPF do Cliente:");

        for (Cliente cliente : lClientes) {
            if(cliente != null){
                ClientePessoa clientePessoa = (ClientePessoa) cliente;
                
                if(CPF.equalsIgnoreCase(clientePessoa.getCPF())){
                    double valor = Prompt.lerDecimal("Valor:");
                    Emprestar.executar(clientePessoa, valor);
                }
            }
        }
    }
    public static void emprestarEmpresa(List<Cliente> lClientes){
        String CNPJ = Prompt.lerLinha("CNPJ da empresa:");

        for (Cliente cliente : lClientes) {
            if(cliente != null){
                ClienteEmpresa clienteEmpresa = (ClienteEmpresa) cliente;
                
                if(CNPJ.equalsIgnoreCase(clienteEmpresa.getCnpj())){
                    double valor = Prompt.lerDecimal("Valor:");
                    Emprestar.executar(clienteEmpresa, valor);
                }
            }
        }
    }

    public static void devolverPessoa(List<Cliente> lClientes){
        String CPF = Prompt.lerLinha("CPF do Cliente:");

        for (Cliente cliente : lClientes) {
            if(cliente != null){
                ClientePessoa clientePessoa = (ClientePessoa) cliente;
                
                if(CPF.equalsIgnoreCase(clientePessoa.getCPF())){
                    double valor = Prompt.lerDecimal("Valor:");
                    Emprestar.executar(clientePessoa, valor);
                }
            }
        }
    }
    public static void devolverEmpresa(List<Cliente> lClientes){
        String CNPJ = Prompt.lerLinha("CNPJ da empresa:");

        for (Cliente cliente : lClientes) {
            if(cliente != null){
                ClienteEmpresa clienteEmpresa = (ClienteEmpresa) cliente;
                
                if(CNPJ.equalsIgnoreCase(clienteEmpresa.getCnpj())){
                    double valor = Prompt.lerDecimal("Valor:");
                    Emprestar.executar(clienteEmpresa, valor);
                }
            }
        }
    }
}
