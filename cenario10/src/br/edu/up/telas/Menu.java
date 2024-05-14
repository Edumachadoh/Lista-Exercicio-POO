package br.edu.up.telas;

import br.edu.up.Programa;

public class Menu {
        public static void executar(){
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
            case 3:
            int i = 1;
            for (Cliente cliente : lCPessoas){
                        ClientePessoa clientePessoa = (ClientePessoa) cliente;
                            Prompt.imprimir(clientePessoa.getDados(i));
                    }
            break;
            case 4:
            int j = 1;
            for (Cliente cliente : lCEmpresas) {
                        j++;
                        ClienteEmpresa clienteEmpresa = (ClienteEmpresa) cliente;
                        Prompt.imprimir(clienteEmpresa.getDados(j));
                    }
            break;
            case 5:emprestarPessoa(lCPessoas);break;
            case 6:emprestarEmpresa(lCEmpresas);break;
            case 7:devolverEmpresa(lCPessoas);break;
            case 8:devolverEmpresa(lCEmpresas);break;
            case 9: Programa.parar();break;
            default:System.out.println("Escolha inválida\ndigite novamente...");escolherAcao(escolha, lCPessoas, lCEmpresas);break;
        }
        executar(lCPessoas, lCEmpresas);
    }
    
}
