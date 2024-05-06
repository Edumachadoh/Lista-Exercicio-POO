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
    }

    public void adicionarAeronave(int numAeronave) {
       
        this.aeronaves[numAeronave].setIdCodigo(1233);
        this.aeronaves[numAeronave].setQtdAssentos(555);
        this.aeronaves[numAeronave].setTipo("");

        this.passageiros = new Passageiro[this.aeronaves[numAeronave].getQtdAssentos()];
        for (int i = 0; i < aeronaves.length; i++) {
            passageiros[i] = new Passageiro();
        }
    }


    public void adicionarPassageiro(int numPassageiro, int numAeronave, String nome, String rg, int idPassagem, String numAssento, String classeAssento, int dia, int mes, int hora, int minuto, int idBagagem) {
       
        Data data = new Data();
        data.setDia(1);
        data.setMes(5);
        data.setHora(12);
        data.setMinuto(56);

        Passagem passagem = new Passagem();
        passagem.setIdPassagem(212);
        passagem.setNumAssento("53C");
        passagem.setClasseAssento("Executiva");
        passagem.setDataPassagem(data);

        this.passageiros[numPassageiro].setPassagem(passagem);
        this.passageiros[numPassageiro].setIdBagagem(idBagagem);
        this.passageiros[numPassageiro].setNome(nome);
        this.passageiros[numPassageiro].setRg(rg);
        

    }
    
    public  void adicionarComandante(int tripulacao, int idAeronautica, int idMatricula, int totalHorasVoo ) {
        this.tripulacoes[tripulacao].setIdAeronautica(442);
        this.tripulacoes[tripulacao].setIdMatricula(1451);
        this.tripulacoes[tripulacao].setNome("Evandro");
        this.tripulacoes[tripulacao].setRg("575457");
       
        
        
       
    }
    public  void adicionarComissario(int tripulacao, int idAeronautica, int idMatricula, int idiomar[]) {
        this.tripulacoes[tripulacao].setIdAeronautica(442);
        this.tripulacoes[tripulacao].setIdMatricula(1451);
        this.tripulacoes[tripulacao].setNome("Evandro");
        this.tripulacoes[tripulacao].setRg("575457");
       
        
       
    }

    
}
