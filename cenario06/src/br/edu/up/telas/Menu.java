package br.edu.up.telas;

import br.edu.up.util.Prompt;
import br.edu.up.controles.ControleAeronave;
import br.edu.up.modelos.Aeronave;
import br.edu.up.modelos.Comandante;
import br.edu.up.modelos.Comissario;
import br.edu.up.modelos.Passageiro;
import br.edu.up.modelos.Passagem;
import br.edu.up.modelos.Data;


public class Menu {

    static ControleAeronave controleAeronave = new ControleAeronave();

    public static void executar() {
        int opcao;
        int numAeronave = 0;
        int passageiroCont = 0;
        int tripulacaoCont = 0;
        int comissarioCont = 0;
        int comandanteCont = 0;

        String nome;
        String rg;

        System.out.printf("------------------------- \n");
        int idCodigo = Prompt.lerInteiro("Codigo da aeronave: "); 
        String tipo = Prompt.lerLinha("Tipo: "); 
        int qtdAssentos = Prompt.lerInteiro("Qtd assentos: "); 
       
        Aeronave aeronave = new Aeronave();

        aeronave.setIdCodigo(idCodigo);
        aeronave.setQtdAssentos(qtdAssentos);
        aeronave.setTipo(tipo);

        controleAeronave.adicionarAeronave(aeronave);

       
        do {
            

            System.out.printf("------------------------- \n");
            System.out.printf("Digite a ação que deseja de 1 a 4: \n");
            System.out.printf("1 = Adicionar passageiro\n");
            System.out.printf("2 = Adicionar tripulacao\n");
            System.out.printf("3 = Relatório comandante \n");
            System.out.printf("4 = Sair \n");

            opcao = Prompt.lerInteiro("");
    
            switch (opcao) {
                case 1:
                   

                    nome = Prompt.lerLinha("Nome:");
                    rg = Prompt.lerLinha("Rg:");
                    int idPassagem = Prompt.lerInteiro("Id passagem:");
                    int idBagagem = Prompt.lerInteiro("Id bagagem:");
                    String numAssento = Prompt.lerLinha("Numero assento:");
                    String classeAssento = Prompt.lerLinha("Classe assento:");
                    int dia = Prompt.lerInteiro("Dia:");
                    int mes = Prompt.lerInteiro("Mes:");
                    int hora = Prompt.lerInteiro("Hora:");
                    int minuto = Prompt.lerInteiro("Minuto:");
                    
                    Data data = new Data();
                    data.setDia(dia);
                    data.setMes(mes);
                    data.setHora(hora);
                    data.setMinuto(minuto);

                    Passagem passagem = new Passagem();
                    passagem.setIdPassagem(idPassagem);
                    passagem.setNumAssento(numAssento);
                    passagem.setClasseAssento(classeAssento);
                    passagem.setData(data);

                    Passageiro passageiro = new Passageiro(nome, rg, passagem, idBagagem);
        
                    controleAeronave.adicionarPassageiro(passageiro);

                    passageiroCont ++;

                    break;
                case 2:
                    

                    nome = Prompt.lerLinha("Nome:");
                    rg = Prompt.lerLinha("Rg:");
                    int tipoTripulacao = Prompt.lerInteiro("Qual tripulante [1 - Comandante / 2 - Comissário]:");
                    int idAeronautica = Prompt.lerInteiro("Id aeronautica: ");
                    int idMatricula = Prompt.lerInteiro("Id matricula: ");


                    if (tipoTripulacao == 1) {

                        int totalHorasVoo = Prompt.lerInteiro("Total de horas de voo: ");     
                        
                        Comandante comandante = new Comandante(nome, rg, idAeronautica, idMatricula, totalHorasVoo);

                        comandante.setIdAeronautica(idAeronautica);
                        comandante.setIdMatricula(idMatricula);
                        comandante.setNome(nome);
                        comandante.setRg(rg);
                        comandante.setTotalHorasVoo(totalHorasVoo);
                        
                        controleAeronave.adicionarComandante(comandante); 

                        tripulacaoCont ++; 
                        comandanteCont ++;

                        break;
                    } else if (tipoTripulacao == 2) {

                        String idiomas = Prompt.lerLinha("idiomas fluentes: ");

                        Comissario comissario = new Comissario(nome, rg, idAeronautica, idMatricula, idiomas);

                        comissario.setIdAeronautica(idAeronautica);
                        comissario.setIdMatricula(idMatricula);
                        comissario.setNome(nome);
                        comissario.setRg(rg);
                        comissario.setIdioma(idiomas);
                        controleAeronave.adicionarComissario(comissario);
                       
                        tripulacaoCont ++; 
                        comissarioCont ++;

                        break;
                    }
                case 3:
                    Comandante comandante = controleAeronave.buscarComandante();
                    if(comandante != null){
                        //System.out.println(comandante);
                        System.out.println(comandante.getTotalHorasVoo());
                    } else {

                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    break;
            }
            if (opcao == 4) {
                break;
            }
        } while(opcao != 4);
    }
}
