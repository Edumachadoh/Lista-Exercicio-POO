package br.edu.up.telas;

import br.edu.up.Programa;
import br.edu.up.controles.AdcionarAno;
import br.edu.up.controles.DefinirNumMes;
import br.edu.up.controles.VerificarPosicao;
import br.edu.up.metodos.Ano;
import br.edu.up.metodos.Compromisso;
import br.edu.up.metodos.Dia;
import br.edu.up.metodos.Mes;
import br.edu.up.util.Prompt;

public class Menu {
    

    public static void iniciar(){
        Ano[] listaAnos = new Ano[1];
        int ano = Prompt.lerInteiro("Digite o ano desejado:");
        listaAnos[0] = new Ano(ano); 
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
        System.out.println("6 - Listar compromisso de um dia específico");
        System.out.println("7 - Mudar ano");
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
                Prompt.lerLinha("Qual Mes:");
                Prompt.lerInteiro("Qual dia:");

                break;
            case 4:
                Prompt.imprimir(listaAnos[posicao].listarCompromissos());
                break;
            case 5:
                listarMes(listaAnos[posicao]);
                break;
            case 6:
                listarDia(listaAnos[posicao]);
                break;
            case 7:
                int anoDigitado = Prompt.lerInteiro("Qual ano:");  
                boolean posicaoExiste = VerificarPosicao.seExiste(listaAnos, anoDigitado);

                if(posicaoExiste == true){
                    Prompt.imprimir("--Ano já listado--\n Reselecionado");
                    posicao = listaAnos.length - 1;
                    mostrarTela(listaAnos, posicao);
                }else{
                    listaAnos = AdcionarAno.executar(listaAnos);
                    listaAnos = new Ano[listaAnos.length + 1];
                    posicao = listaAnos.length - 1;
                    listaAnos[posicao] = new Ano(anoDigitado); 
                    mostrarTela(listaAnos, posicao);
                }
                break;
            default:

                Programa.parar();
                break;
        }

        mostrarTela(listaAnos, posicao);
    }

    public static String mesValido(){
        String mes = Prompt.lerLinha("Qual Mês:");
        mes = VerificarMes.executar(mes);

        return mes;
    }

    public static void agendar(Ano objetoAno){
        
        String mes = Menu.mesValido();
        Mes objetoMes = new Mes(mes, objetoAno);

        int dia = Prompt.lerInteiro("Qual dia:");
        Dia objetoDia = new Dia(dia);

        int hora = Prompt.lerInteiro("Qual hora:");
        String pessoa = Prompt.lerLinha("Nome da pessoa:");
        String local = Prompt.lerLinha("Nome do local:");
        String assunto = Prompt.lerLinha("Assunto:");
        Compromisso objCompromisso = new Compromisso(pessoa, local, assunto, hora);

        objetoDia.adicionarCompromisso(objCompromisso);
        
        objetoMes.adicionarCompromisso(objCompromisso, dia);
        
        objetoAno.adicionarMes(objetoMes, objetoMes.numeroMes());
    }

    public static void listarMes(Ano ano){
        String mes = Menu.mesValido();
        int n = DefinirNumMes.executar(mes);

        Prompt.imprimir(ano.listarCompromissos(n));
    }

    public static void listarDia(Ano ano){
        String mes = Menu.mesValido();
        int n = DefinirNumMes.executar(mes);

        Mes mesEscolhido = ano.getMes(n);

        int dia = 0;

        do{
            dia = Prompt.lerInteiro("Qual dia:");
            if(dia > mesEscolhido.getQtdDeDias() || dia < 0){
                Prompt.imprimir("Dia Inválido");
            }else{
                break;
            }
        }while(true);

        mesEscolhido.listarCompromissos(dia);
    }

}
