package br.edu.up.controles;

import br.edu.up.modelos.*;

public class ControleAeronave {
    private Passageiro[] passageiros;
    private Tripulacao[] tripulacoes;
    private Aeronave[] aeronaves;
    private int contPassageiro;
    private int contComissario;
    private int contComandante;

    public ControleAeronave() {
        this.aeronaves = new Aeronave[10];
        for (int i = 0; i < aeronaves.length; i++) {
            aeronaves[i] = new Aeronave();
        }
        this.passageiros = new Passageiro[10];
        for (int i = 0; i < passageiros.length; i++) {
            passageiros[i] = new Passageiro();
        }
    }

    public void adicionarAeronave(int contAeronave, int idCodigo, String tipo, int qtdAssentos) {
       
        this.aeronaves[contAeronave].setIdCodigo(idCodigo);
        this.aeronaves[contAeronave].setQtdAssentos(qtdAssentos);
        this.aeronaves[contAeronave].setTipo(tipo);


    }


    public void adicionarPassageiro(int numPassageiro, int numAeronave, String nome, String rg, int idPassagem, String numAssento, String classeAssento, int dia, int mes, int hora, int minuto, int idBagagem) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setRg(rg);

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

        Passageiro passageiro = new Passageiro();
        passageiro.setPassagem(passagem);
        passageiro.setIdBagagem(idBagagem);
        passageiro.setNome(nome);
        passageiro.setRg(rg);

        this.passageiros[numPassageiro] = passageiro;

        this.aeronaves[numAeronave].setPessoa(pessoa);
        

    }
    
    public  void adicionarComandante(String nome, String rg ,int tripulacao, int idAeronautica, int idMatricula, int totalHorasVoo ) {
        this.tripulacoes[tripulacao].setIdAeronautica(idAeronautica);
        this.tripulacoes[tripulacao].setIdMatricula(idMatricula);
        this.tripulacoes[tripulacao].setNome("Evandro");
        this.tripulacoes[tripulacao].setRg("575457");
       
        
        
       
    }
    public  void adicionarComissario(String nome, String rg ,int tripulacao, int idAeronautica, int idMatricula, int idiomar[]) {
        this.tripulacoes[tripulacao].setIdAeronautica(442);
        this.tripulacoes[tripulacao].setIdMatricula(1451);
        this.tripulacoes[tripulacao].setNome("Evandro");
        this.tripulacoes[tripulacao].setRg("575457");

    }

    public void relatorioPassageiro() {
        System.out.printf("Nome: %s\n", passageiros[0].getNome());
        System.out.printf("Rg: %s\n", passageiros[0].getRg());
        System.out.printf("Identificacao bagagem: %d\n", passageiros[0].getIdBagagem());
        System.out.printf("Identificacao passagem: %d\n", passageiros[0].getPassagem().getIdPassagem());
        System.out.printf("Numero de assento: %s\n", passageiros[0].getPassagem().getNumAssento());
        System.out.printf("Classe assento: %s\n",passageiros[0].getPassagem().getNumAssento());
        System.out.printf("Dia: %d\n", passageiros[0].getPassagem().getData().getDia());
        System.out.printf("Mes: %d\n", passageiros[0].getPassagem().getData().getMes());
        System.out.printf("Hora: %d\n", passageiros[0].getPassagem().getData().getHora());
        System.out.printf("Minuto: %d\n", passageiros[0].getPassagem().getData().getMinuto());

    }

    @Override
    public String toString() {
        return "Nome: " + passageiros[0].getNome() + 
        "\nRg: " + passageiros[0].getRg()+ 
        "\nIdentificacao bagagem: " + passageiros[0].getIdBagagem() + 
         "\nIdentificacao passagem: " + passageiros[0].getPassagem().getIdPassagem() + 
        "\nNumero de assento: " +passageiros[0].getPassagem().getNumAssento() +
        "\nClasse assento: " + passageiros[0].getPassagem().getClasseAssento()+ 
        "\nDia: " + passageiros[0].getPassagem().getData().getDia()+ 
        "\nMes: " + passageiros[0].getPassagem().getData().getMes() +
         "\nHora: " + passageiros[0].getPassagem().getData().getHora()+ 
         "\nMinuto: " + passageiros[0].getPassagem().getData().getMinuto();
    }

    

}
