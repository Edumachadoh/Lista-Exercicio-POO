package br.edu.up.telas;

import java.time.LocalDate;
import java.util.Scanner;

import br.edu.up.controles.ManipularSeguros;
import br.edu.up.modelos.Segurado;
import br.edu.up.modelos.SeguroVeiculo;
import br.edu.up.modelos.SeguroVida;
import br.edu.up.util.Prompt;

public class Menu {
    public static void executar() {
        int opcao = 0;
        int contSeguros = 0; 

        ManipularSeguros seguros = new ManipularSeguros();
        Scanner leitor = new Scanner(System.in);

        do {
            System.out.println("----------------------");
            System.out.println("1. Incluir seguro\n" +
                    "2. Localizar seguro\n" +
                    "3. Excluir seguro\n" +
                    "4. Excluir todos os seguros\n" +
                    "5. Listar todos os seguros\n" +
                    "6. Ver quantidade de seguros\n" +
                    "7. Sair");
            System.out.println("----------------------\n");

            opcao = Prompt.lerInteiro(":");
            if (opcao == 7) {
                break;
            }

            if (contSeguros == 20) {
                System.out.println("Sistema cheio, finalizando... \n");
                break;
            }

            

            switch (opcao) {
                case 1:
                String nome = Prompt.lerLinha("Nome: ");
                String rg = Prompt.lerLinha("RG: ");
                String cpf = Prompt.lerLinha("CPF: ");
                String telefone = Prompt.lerLinha("Telefone: ");
                String endereco = Prompt.lerLinha("Endereço: ");
                String cep = Prompt.lerLinha("Cep: ");
                String cidade = Prompt.lerLinha("Cidade: ");
                int sexo = Prompt.lerInteiro("Sexo: ([1] Homem [2] Mulher) ");
    
                Segurado segurado = new Segurado(nome, rg, cpf, telefone, endereco, cep, cidade);
                
                switch (sexo) {
                    case 1:
                        segurado.setSexo(Segurado.Sexo.MASCULINO);
                        break;
                    case 2:
                        segurado.setSexo(Segurado.Sexo.FEMININO);
                        break;
                    default:
                        System.out.println("Valor invalido!");
                        break;
                }

                    String apolice = Prompt.lerLinha("Apolice:");
                    double vlrApolice = Prompt.lerDecimal("Valor apolice :R$");
                    int diaInicio = Prompt.lerInteiro("Dia inicio: ");
                    int mesInicio = Prompt.lerInteiro("Mes inicio: ");
                    LocalDate dtaInicio = LocalDate.of(2024, mesInicio, diaInicio);
                    int diaFim = Prompt.lerInteiro("Dia fim: ");
                    int mesFim = Prompt.lerInteiro("Mes fim: ");
                    LocalDate dtaFim = LocalDate.of(2024, mesFim, diaFim);

                    int tipoSeguro = Prompt.lerInteiro("Tipo de seguro: (1- SeguroVida 2- SeguroVeiculo)");
                    if (tipoSeguro == 1) {
                        boolean cobreAcidente = true;
                        boolean cobreDoenca = true;

                        int cD = Prompt.lerInteiro("Cobre doenca: (1- Sim 2- Nao):");
                        if (cD == 1) {
                            cobreDoenca = true;
                        } else if (cD == 2) {
                            cobreDoenca = false;
                        }

                        int cA = Prompt.lerInteiro("Cobre acidente: (1- Sim 2- Nao):");
                        if (cA == 1) {
                            cobreAcidente = true;
                        } else if (cA == 2) {
                            cobreAcidente = false;
                        }

                        SeguroVida seguroVida = new SeguroVida(apolice, segurado, vlrApolice, dtaInicio, dtaFim, cobreDoenca, cobreAcidente);
                        seguros.adicionarSeguroVida(seguroVida, contSeguros);

                    } else if (tipoSeguro == 2) {
                        boolean temCarroReserva = true;
                        boolean cobreVidros = true;

                        double vlrFranquia = Prompt.lerDecimal("Valor franquia: ");

                        int cD = Prompt.lerInteiro("Carro reserva: (1- Sim 2- Nao):");
                        if (cD == 1) {
                            temCarroReserva = true;
                        } else if (cD == 2) {
                            temCarroReserva = false;
                        }

                        int cA = Prompt.lerInteiro("Cobre vidros: (1- Sim 2- Nao):");
                        if (cA == 1) {
                            cobreVidros = true;
                        } else if (cA == 2) {
                            cobreVidros = false;
                        }

                        SeguroVeiculo seguroVeiculo = new SeguroVeiculo(apolice, segurado, vlrApolice, dtaInicio, dtaFim, vlrFranquia, temCarroReserva, cobreVidros);
                        seguros.adicionarSeguroVeiculo(seguroVeiculo, contSeguros);
                    }

                    contSeguros++;
                    
                    break;
                case 2:
                    cpf = Prompt.lerLinha("Digite o cpf para localizar o seguro: ");
                    ;

                    if (seguros.localizarSeguro(cpf, contSeguros) == 1) {
                        System.out.println("Seguro encontrado com sucesso");
                    } else {
                        System.out.println("Seguro NAO encontrado!!!");
                    }
                    break;

                case 3:
                  
                    break;

                case 4:
                    seguros.excluirTodos(contSeguros);
                    contSeguros = 0;
                    System.out.println("Seguros excluidos");
                    break;

                case 5:
                    System.out.println(seguros.toString(contSeguros));
                    break;

                case 6:
                System.out.println("Numero de seguros: " + contSeguros);
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }

        } while (opcao != 7);
    }
}
