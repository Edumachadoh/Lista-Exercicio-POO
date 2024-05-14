package br.edu.up.telas;

import br.edu.up.Programa;
import br.edu.up.util.Prompt;

public class Menu {
        public static void executar(){
        System.out.println( "1. Incluir seguro\r\n" +
                            "2. Localizar seguro\r\n" +
                            "3. Excluir seguro\r\n" +
                            "4. Excluir todos os seguros\r\n" +
                            "5. Listar todos os seguros\r\n" +
                            "6. Ver quantidade de seguros\r\n" +
                            "7. Sair\r");
        escolherAcao();
    }

    public static void escolherAcao(){
        int escolha = Prompt.lerInteiro();
        switch (escolha) {
            case 1:break;    
            case 2:break;    
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7: Programa.parar();break;
            default:System.out.println("Escolha inválida\ndigite novamente...");escolherAcao();break;
        }
        executar();
    }
    
}
