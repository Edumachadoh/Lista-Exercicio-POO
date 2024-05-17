package br.edu.up.telas;

import br.edu.up.Programa;
import br.edu.up.util.Prompt;

public class Menu {
        public static void executar(){
        int opcao = 0;
        
        do {
            System.out.println("----------------------\n");
            System.out.println( "1. Incluir seguro\r\n" +
                            "2. Localizar seguro\r\n" +
                            "3. Excluir seguro\r\n" +
                            "4. Excluir todos os seguros\r\n" +
                            "5. Listar todos os seguros\r\n" +
                            "6. Ver quantidade de seguros\r\n" +
                            "7. Sair\r");
            System.out.println("----------------------\n");

            opcao = Prompt.lerInteiro(":");
            if (opcao == 7) {
                break;
            }

            String nome = Prompt.lerLinha("Nome: ");
            String rg = Prompt.lerLinha("RG: ");
            String cpf = Prompt.lerLinha("CPF: ");
            // Enum sexo = 1; ver isso

            switch (opcao) {
                case 1:
                    
                    break;
            
                case 2:
                    
                    break;
            
                case 3:
                    
                    break;
            
                case 4:
                    
                    break;
            
                case 5:
                    
                    break;
            
                case 6:
                    
                    break;
            
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }

        } while (opcao != 7);
            
    
    }
}
