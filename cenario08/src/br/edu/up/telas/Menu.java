package br.edu.up.telas;

import br.edu.up.controles.ManipularAgenda;
import br.edu.up.util.Prompt;

public class Menu {
    public static void executar() {
       int opcao = 1;
       String nome;
        String telefone;
        int codigo = 0;
       
       ManipularAgenda agenda = new ManipularAgenda();

        do {
            System.out.println("--------------------------\n1- Incluir um contato pessoal\n2- Incluir um contato comercial\n3- Excluir um contato \n4- Consultar um contato pelo código\n5- Listar todos os contatos\n6- Sair do programa:");

            opcao = Prompt.lerInteiro("");
            
            
            switch (opcao) {
                case 1:
                    codigo ++;
                    nome = Prompt.lerLinha("Nome: ");
                    telefone = Prompt.lerLinha("Telefone: ");
                    String aniversario = Prompt.lerLinha("Aniversario: ");
                     
                     

                    agenda.incluirContatoPessoal(codigo, nome, telefone, aniversario);
                    imprimirCodigo(codigo);
                    break;
            
                case 2:
                    codigo ++;
                    nome = Prompt.lerLinha("Nome: ");
                    telefone = Prompt.lerLinha("Telefone: ");
                    String cpnj = Prompt.lerLinha("Cnpj: ");
                
                

                    agenda.incluirContatoComercial(codigo, nome, telefone, cpnj);
                    imprimirCodigo(codigo);
                    break;
            
                case 3:

                    int codigoExcluir = Prompt.lerInteiro("Codigo que deseja excluir: ");

                    agenda.excluirContato(codigo, codigoExcluir);
                    

                    break;
            
                case 4:
                     int codigoConsultar = Prompt.lerInteiro("Codigo que deseja consultar: ");

                    agenda.consultarContato(codigo, codigoConsultar);
                    break;
            
                case 5:
                    agenda.listarContatos();
                    break;
            
                default:
                    break;
            } 
       } while (opcao != 0);

    }

    public static void imprimirCodigo(int codigo) {
        System.out.printf("Codigo do contato: %d\n", codigo); 
    }
    
}
