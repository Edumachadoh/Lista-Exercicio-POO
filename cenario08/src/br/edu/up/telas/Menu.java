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
            System.out.println("--------------------------\n1- Incluir um contato pessoal\n2- Incluir um contato comercial\n3- Excluir um contato pessoal\n4- Consultar um contato pelo código\n5- Listar todos os contatos\n6- Sair do programa:");

            opcao = Prompt.lerInteiro("");
            codigo ++;
            
            switch (opcao) {
                case 1:
                    nome = Prompt.lerLinha("Nome: ");
                    telefone = Prompt.lerLinha("Telefone: ");
                    String aniversario = Prompt.lerLinha("Aniversario: ");
                     
                     

                    agenda.incluirContatoPessoal(codigo, nome, telefone, aniversario);
                    break;
            
                case 2:
                    nome = Prompt.lerLinha("Nome: ");
                    telefone = Prompt.lerLinha("Telefone: ");
                    String cpnj = Prompt.lerLinha("Cnpj: ");
                
                

                    agenda.incluirContatoComercial(codigo, nome, telefone, cpnj);
                    break;
            
                case 3:
                    
                    break;
            
                case 4:
                    
                    break;
            
                case 5:
                    
                    break;
            
                default:
                    break;
            } 
       } while (opcao != 0);














    }
}
