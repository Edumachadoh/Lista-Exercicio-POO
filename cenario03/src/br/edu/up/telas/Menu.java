package br.edu.up.telas;
import java.util.Scanner;
import br.edu.up.lib.Prompt;

public class Menu {
    public static void mostrarTela(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("=== Sistema de Agendamento ===");
        Prompt.separador();
        System.out.println("\n\n--Selecione a operação desejada:");
        System.out.println("1 - Agendar Compromisso");
        System.out.println("2 - Excluir compromisso");
        System.out.println("3 - Parar Operação");
        Prompt.separador();

        int escolha = leitor.nextInt();

        switch (escolha) {
            case 1:
                
                break;
            
            case 2:

                break;

            case 3:

                break;

            default:

                break;
        }
        leitor.close();
    }
}
