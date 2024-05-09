package br.edu.up.telas;

import br.edu.up.Programa;
import br.edu.up.controles.AdcionarAno;
import br.edu.up.controles.AgendarCompromisso;
import br.edu.up.controles.DefinirDiasValidos;
import br.edu.up.controles.DefinirNumMes;
import br.edu.up.controles.VerificarBissexto;
import br.edu.up.controles.VerificarPosicao;
import br.edu.up.metodos.Ano;
import br.edu.up.telas.util.Prompt;

public class Menu {
    

    public static void iniciar(){
        Ano[] listaAnos = new Ano[1];
        int ano = Prompt.lerInteiro("Digite o ano desejado:");
        listaAnos[0] = new Ano(ano, VerificarBissexto.executar(ano)); 
        mostrarTela(listaAnos, 0);
    }

    public static void mostrarTela(Ano[] listaAnos, int posicao){

        Prompt.separador();
        System.out.println("=== Sistema de Agendamento ===");
        System.out.println("Ano:" + listaAnos[posicao].getAno());
        Prompt.separador();
        System.out.println("--Selecione a operação desejada:--");
        System.out.println("1 - Agendar Compromisso");
        System.out.println("2 - Alterar compromisso");
        System.out.println("3 - Excluir compromisso");
        System.out.println("4 - Listar compromissos desse ano");
        System.out.println("5 - Listar compromisso de uma mês específico");
        System.out.println("6 - Mudar ano");
        System.out.println("(qualquer botão) - Parar Programa");
        Prompt.separador();

        int escolha = Prompt.lerInteiro("-->");

        switch (escolha) {
            case 1:
                agendar(listaAnos[posicao]);
            break;
            
            case 2:
                Prompt.lerLinha("Qual Mes:");
                Prompt.lerInteiro("Qual dia:");

                break;
            case 3:
                Prompt.lerInteiro("Qual Ano:");
                Prompt.lerLinha("Qual Mes:");
                Prompt.lerInteiro("Qual dia:");

                break;
            case 4:
                listaAnos[posicao].listarCompromissos();

                break;
            case 5:


                break;
            case 6:
                int anoDigitado = Prompt.lerInteiro("Qual ano:");  
                boolean posicaoExiste = VerificarPosicao.seExiste(listaAnos, anoDigitado);

                if(posicaoExiste == true){
                    posicao = VerificarPosicao.qualPosicao(listaAnos, anoDigitado, posicao);
                    mostrarTela(listaAnos, posicao);
                }else{

                    listaAnos = new Ano[listaAnos.length + 1];
                    listaAnos = AdcionarAno.executar(listaAnos);
                    posicao = VerificarPosicao.qualPosicao(listaAnos, anoDigitado, posicao);
                    listaAnos[posicao] = new Ano(anoDigitado, VerificarBissexto.executar(anoDigitado)); 
                    mostrarTela(listaAnos, posicao);
                }
                break;
            default:

                Programa.parar();
                break;
        }
    }

    public static String mesValido(){
        String mes = Prompt.lerLinha("Qual Mês:");
        VerificarMes.executar(mes);

        return mes;
    }

    public static void agendar(Ano objetoAno){
        
        String mes = Menu.mesValido();
        int numMes = DefinirNumMes.executar(mes);
        int numDias = DefinirDiasValidos.executar(numMes, objetoAno.isBissexto());
        int dia = Prompt.lerInteiro("Qual dia:");
        int hora = Prompt.lerInteiro("Qual hora:");
        String pessoa = Prompt.lerLinha("Nome da pessoa:");
        String local = Prompt.lerLinha("Nome do local:");
        String assunto = Prompt.lerLinha("Assunto:");

        
        AgendarCompromisso.executar(objetoAno,mes,dia,hora,pessoa,local,assunto,numMes, numDias);
    }


}
